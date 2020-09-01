package com.masPro.masPro.controller;

import com.masPro.masPro.gui.ClientsTableModel;
import com.masPro.masPro.gui.ClientsTableWindow;
import com.masPro.masPro.service.serviceImpl.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Component
public class ClientTableController {
    @Autowired
    ClientsTableWindow clientsTableWindow;

    @Autowired
    MainMenuController mainMenuController;

    @Autowired
    ApplicationTableController applicationTableController;

    @Autowired
    ClientServiceImpl clientServiceImpl;

    private boolean initialized = false;

    public ClientTableController() {}


    public void initialize() {
        if (!initialized) {
            initialized = true;
            clientsTableWindow.getBackToMainBtn().addActionListener(backToMainMenu);
            clientsTableWindow.getTable().getSelectionModel().addListSelectionListener(showClientsApplication);
            clientsTableWindow.getTable().setModel(new ClientsTableModel(clientServiceImpl.getAll()));
        }
        clientsTableWindow.getClientsFrm().setVisible(true);

    }

    private ActionListener backToMainMenu = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            mainMenuController.initialize();
            clientsTableWindow.getClientsFrm().dispose();
        }
    };

    private ListSelectionListener showClientsApplication = new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent listSelectionEvent) {
            ClientsTableModel clientsTableModel= (ClientsTableModel) clientsTableWindow.getTable().getModel();
            applicationTableController.initialize(clientsTableModel.getValueAtRow(clientsTableWindow.getTable().getSelectedRow()));
            clientsTableWindow.getClientsFrm().dispose();
        }
    };

}
