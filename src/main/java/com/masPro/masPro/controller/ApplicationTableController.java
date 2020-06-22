package com.masPro.masPro.controller;

import com.masPro.masPro.gui.ApplicationTableModel;
import com.masPro.masPro.gui.ApplicationTableWindow;
import com.masPro.masPro.model.Client;
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

    Client client;

    private boolean initialized = false;

    public ApplicationTableController() {

    }


    public void initialize(Client client) {
        if (!initialized) {
            initialized = true;
            applicationTableWindow.getAddAppBtn().addActionListener(openAppTable);
            applicationTableWindow.getBackToMainBtn().addActionListener(backToMainMenu);
        }

        this.client = client;

        applicationTableWindow.getTable().setModel(new ApplicationTableModel(client.getApplicationListList()));

        applicationTableWindow.getApplicationsFrm().setVisible(true);

    }

    private ActionListener backToMainMenu = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            mainMenuController.initialize(client);
            applicationTableWindow.getApplicationsFrm().dispose();
        }

    };


    private ActionListener openAppTable = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            createApplicationController.initialize(client);
            applicationTableWindow.getApplicationsFrm().dispose();
        }

    };

}
