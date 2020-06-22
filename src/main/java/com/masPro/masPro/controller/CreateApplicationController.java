package com.masPro.masPro.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.util.Vector;

import com.masPro.masPro.enums.ApplicationStatusEnum;
import com.masPro.masPro.enums.BloodTestEnum;
import com.masPro.masPro.enums.PaymentTypeEnum;
import com.masPro.masPro.enums.ResultDeliveryEnum;
import com.masPro.masPro.gui.CreateApplicationWindow;
import com.masPro.masPro.model.Application;
import com.masPro.masPro.model.Client;
import com.masPro.masPro.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class CreateApplicationController {


    @Autowired
    CreateApplicationWindow createApplicationWindow;

    @Autowired
    MainMenuController mainMenuController;

    @Autowired
    ApplicationTableController applicationTableController;

    @Autowired
    ClientService clientService;


    Client client;

    private boolean initialized = false;



    public CreateApplicationController() {

    }

    public void initialize(Client client) {
        if (!initialized) {
            createApplicationWindow.getAddApplicationBtn().addActionListener(addApplication);
            createApplicationWindow.getGoToMainBtn().addActionListener(backToMain);
            initialized = true;
        }
        this.client = client;
        createApplicationWindow.getAddApplicationFrm().setVisible(true);

    }

    private ActionListener addApplication = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            client.getApplicationListList().add(new Application(BloodTestEnum.GENERAL.getValue(), ResultDeliveryEnum.EMAIL.getValue(), PaymentTypeEnum.CARD.getValue(), LocalDateTime.now(), ApplicationStatusEnum.DONE.getValue(),client));
            clientService.save(client);
//            client.getApplicationListList().add(new Application())
//            System.out.println(client.getApplicationListList());
            applicationTableController.initialize(client);
            createApplicationWindow.getAddApplicationFrm().dispose();
        }

    };

    private ActionListener backToMain = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {

            mainMenuController.initialize(client);
            createApplicationWindow.getAddApplicationFrm().dispose();

        }

    };

}

