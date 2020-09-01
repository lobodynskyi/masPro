package com.masPro.masPro.controller;

import com.masPro.masPro.gui.MainMenuWindow;
import com.masPro.masPro.model.Nurse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Component
public class MainMenuController {

    @Autowired
    MainMenuWindow mainMenuWindow;

    @Autowired
    CreateApplicationController createApplicationController;

    @Autowired
    ApplicationTableController applicationTableController;

    @Autowired
    ClientTableController clientTableController;

    private boolean initialized = false;

    public MainMenuController() {}


    public void initialize() {
        if (!initialized) {
            mainMenuWindow.getAddApplicationsBtn().addActionListener(createNewApp);
            mainMenuWindow.getApplicationsBtn().addActionListener(openAppTable);
            mainMenuWindow.getUsersDataBtn().addActionListener(openClientTable);
            initialized = true;
        }
        mainMenuWindow.getMainMenuFrm().setVisible(true);
    }

    private ActionListener createNewApp = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            createApplicationController.initialize();
            mainMenuWindow.getMainMenuFrm().dispose();
        }
    };


    private ActionListener openAppTable = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            applicationTableController.initialize();
            mainMenuWindow.getMainMenuFrm().dispose();
        }
    };


    private ActionListener openClientTable = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            clientTableController.initialize();
            mainMenuWindow.getMainMenuFrm().dispose();
        }
    };

    public void setNurse(Nurse nurse){
        mainMenuWindow.getEmailLb().setText(nurse.getEmail());
        mainMenuWindow.getNameLb().setText(nurse.getName() + " " + nurse.getLastName());
    }
}
