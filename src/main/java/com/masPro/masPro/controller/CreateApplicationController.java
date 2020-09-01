package com.masPro.masPro.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import com.masPro.masPro.enums.ApplicationStatusEnum;
import com.masPro.masPro.gui.CreateApplicationWindow;
import com.masPro.masPro.model.Application;
import com.masPro.masPro.repository.ApplicationRepository;
import com.masPro.masPro.service.serviceImpl.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;


@Component
public class CreateApplicationController {


    @Autowired
    CreateApplicationWindow createApplicationWindow;

    @Autowired
    MainMenuController mainMenuController;

    @Autowired
    ApplicationTableController applicationTableController;

    @Autowired
    ClientServiceImpl clientServiceImpl;

    @Autowired
    ApplicationRepository applicationRepository;

    private boolean initialized = false;

    public CreateApplicationController() {}

    public void initialize( ) {
        if (!initialized) {
            createApplicationWindow.getAddApplicationBtn().addActionListener(addApplication);
            createApplicationWindow.getGoToMainBtn().addActionListener(backToMain);
            initialized = true;
        }
        createApplicationWindow.getAddApplicationFrm().setVisible(true);
    }


    private ActionListener addApplication = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           if(LocalDateTime.now().compareTo(convertToLocalDateTime( createApplicationWindow.getDateChooser().getDate())) > 0){
               showErrors("Data badania nie może być mniejsza od dzisiejszej");
           }else{
               String email = createApplicationWindow.getUserEmail().getText();
               clientServiceImpl.findByEmail(email).ifPresentOrElse(
                       c -> {
                           Application newApplication = new Application(
                                   createApplicationWindow.getChoseTestComboBox().getItemCount(),
                                   createApplicationWindow.getChoseGetResultsMethodComboBox().getItemCount(),
                                   createApplicationWindow.getChosePaymentMethodComboBox().getItemCount(),
                                   convertToLocalDateTime(createApplicationWindow.getDateChooser().getDate()),
                                   ApplicationStatusEnum.IN_PROGRESS.getValue(),
                                   c
                           );
                           applicationRepository.save(newApplication);
                           applicationTableController.initialize();
                           createApplicationWindow.getAddApplicationFrm().dispose();
                       },
                       () -> {
                           showErrors("Nie znaleziono użytkownika z e-mail: " + email );
                       }
               );

           }
        }

    };

    private ActionListener backToMain = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            mainMenuController.initialize();
            createApplicationWindow.getAddApplicationFrm().dispose();
        }
    };

    private LocalDateTime convertToLocalDateTime(Date dateToConvert) {
        return LocalDateTime.ofInstant(
                dateToConvert.toInstant(), ZoneId.systemDefault());
    }


    private void showErrors(String title){
        JOptionPane.showMessageDialog( createApplicationWindow.getAddApplicationFrm(),
                title,
                "Błąd danych wejściowych", JOptionPane.INFORMATION_MESSAGE);
    }
}

