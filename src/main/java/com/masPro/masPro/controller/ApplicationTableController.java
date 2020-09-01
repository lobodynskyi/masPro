package com.masPro.masPro.controller;

import com.masPro.masPro.gui.*;
import com.masPro.masPro.model.Client;
import com.masPro.masPro.service.serviceImpl.ApplicationServiceImpl;
import com.masPro.masPro.service.serviceImpl.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Component
public class ApplicationTableController {

    @Autowired
    ApplicationTableWindow applicationTableWindow;

    @Autowired
    MainMenuController mainMenuController;

    @Autowired
    ApplicationTableController applicationTableController;

    @Autowired
    CreateApplicationController createApplicationController;

    @Autowired
    ApplicationServiceImpl applicationServiceImpl;

    @Autowired
    ClientServiceImpl clientServiceImpl;


    private boolean initialized = false;

    public ApplicationTableController() {}

    public void initialize() {
        if (!initialized) {
            initialized = true;
            initializeButtons();
        }
        applicationTableWindow.getTable().setModel(new ApplicationTableModel(applicationServiceImpl.getAll()));
        applicationTableWindow.getApplicationsFrm().setVisible(true);
    }

    public void initialize(Client client) {
        if (!initialized) {
            initialized = true;
            initializeButtons();
        }
        applicationTableWindow.getTable().setModel(new ApplicationTableModel(client.getApplications()));
        applicationTableWindow.getApplicationsFrm().setVisible(true);
    }


    private ActionListener backToMainMenu = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            mainMenuController.initialize();
            applicationTableWindow.getApplicationsFrm().dispose();
        }
    };


    private ActionListener openApplicationTable = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            createApplicationController.initialize();
            applicationTableWindow.getApplicationsFrm().dispose();
        }
    };

    private void initializeButtons(){
        applicationTableWindow.getAddAppBtn().addActionListener(openApplicationTable);
        applicationTableWindow.getBackToMainBtn().addActionListener(backToMainMenu);
    }

}
