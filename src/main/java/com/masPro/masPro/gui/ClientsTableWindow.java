package com.masPro.masPro.gui;

import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class ClientsTableWindow {
    private JFrame clientsFrm;
    private JPanel buttonsPanel;
    private JTable table;
    private JButton backToMainBtn;

    public ClientsTableWindow() {
        initialize();
    }


    private void initialize() {

        clientsFrm = SetupJFrame.setup("Strona klientów");

        buttonsPanel = new JPanel();
        clientsFrm.getContentPane().add(buttonsPanel, BorderLayout.SOUTH);

        backToMainBtn = SetupBtn.setup("Powrót");
        buttonsPanel.add(backToMainBtn);


        table = SetupJTable.setup();

        JScrollPane scrollPane = new JScrollPane(table);
        clientsFrm.getContentPane().add(scrollPane, BorderLayout.CENTER);
    }


    public JFrame getClientsFrm() {
        return clientsFrm;
    }


    public JTable getTable() {
        return table;
    }


    public JButton getBackToMainBtn() {
        return backToMainBtn;
    }

}
