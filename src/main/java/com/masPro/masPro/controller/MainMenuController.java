package com.masPro.masPro.controller;

import com.masPro.masPro.gui.MainMenuWindow;
import com.masPro.masPro.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.*;
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

    private boolean initialized = false;

    private Client client;

    public MainMenuController() {
//        initialize();
    }


    public void initialize(Client client) {
        if (!initialized) {
            mainMenuWindow.getAddApplicationsBtn().addActionListener(createNewApp);
            mainMenuWindow.getApplicationsBtn().addActionListener(openAppTable);


            initialized = true;
        }
        this.client = client;
        mainMenuWindow.getEmailLb().setText(client.getEmail());
        mainMenuWindow.getNameLb().setText(client.getName());
        mainMenuWindow.getLastNameLb().setText(client.getLastName());

        mainMenuWindow.setVisible(true);

    }

    private ActionListener createNewApp = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            createApplicationController.initialize(client);
            mainMenuWindow.dispose();
        }

    };


    private ActionListener openAppTable = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            applicationTableController.initialize(client);
            mainMenuWindow.dispose();
        }

    };

}
