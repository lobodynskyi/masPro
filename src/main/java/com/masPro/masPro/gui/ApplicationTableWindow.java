package com.masPro.masPro.gui;

import java.awt.Font;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.springframework.stereotype.Component;

import javax.swing.JButton;


@Component
public class ApplicationTableWindow {
    private JFrame applicationsFrm;
    private JPanel buttonsPanel;
    private JTable table;
    private JButton addAppBtn;
    private JButton backToMainBtn;

    public ApplicationTableWindow() {
        initialize();
    }

    private void initialize() {

        applicationsFrm = SetupJFrame.setup("Strona wnioski");

        buttonsPanel = new JPanel();
        applicationsFrm.getContentPane().add(buttonsPanel, BorderLayout.SOUTH);

        backToMainBtn = SetupBtn.setup("Powrót");
        buttonsPanel.add(backToMainBtn);

        addAppBtn = SetupBtn.setup("Złóż wniosek\n");
        buttonsPanel.add(addAppBtn);

        table = SetupJTable.setup();

        JScrollPane scrollPane = new JScrollPane(table);
        applicationsFrm.getContentPane().add(scrollPane, BorderLayout.CENTER);
    }


    public JFrame getApplicationsFrm() {
        return applicationsFrm;
    }

    public JTable getTable() {
        return table;
    }

    public JButton getAddAppBtn() {
        return addAppBtn;
    }

    public JButton getBackToMainBtn() {
        return backToMainBtn;
    }

}
