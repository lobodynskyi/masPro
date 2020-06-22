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

        applicationsFrm = new JFrame();
        applicationsFrm.setResizable(false);
        applicationsFrm.setTitle("Twoje Zamowienia");
        applicationsFrm.setBounds(100, 100, 713, 478);
        applicationsFrm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        applicationsFrm.getContentPane().setLayout(new BorderLayout(0, 0));
        applicationsFrm.setLocationRelativeTo(null);

        buttonsPanel = new JPanel();
        applicationsFrm.getContentPane().add(buttonsPanel, BorderLayout.SOUTH);

        backToMainBtn = new JButton("powrot");
        backToMainBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
        buttonsPanel.add(backToMainBtn);

        addAppBtn = new JButton("złóż wniosek");
        addAppBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
        buttonsPanel.add(addAppBtn);

        table = new JTable();
        table.setFont(new Font("Tahoma", Font.PLAIN, 16));

        JScrollPane scrollPane = new JScrollPane(table);
        applicationsFrm.getContentPane().add(scrollPane, BorderLayout.CENTER);
    }


    public JFrame getApplicationsFrm() {
        return applicationsFrm;
    }


    public void setApplicationsFrm(JFrame applicationsFrm) {
        this.applicationsFrm = applicationsFrm;
    }


    public JPanel getButtonsPanel() {
        return buttonsPanel;
    }


    public void setButtonsPanel(JPanel buttonsPanel) {
        this.buttonsPanel = buttonsPanel;
    }


    public JTable getTable() {
        return table;
    }


    public void setTable(JTable table) {
        this.table = table;
    }


    public JButton getAddAppBtn() {
        return addAppBtn;
    }


    public void setAddAppBtn(JButton addAppBtn) {
        this.addAppBtn = addAppBtn;
    }

    public JButton getBackToMainBtn() {
        return backToMainBtn;
    }

    public void setBackToMainBtn(JButton backToMainBtn) {
        this.backToMainBtn = backToMainBtn;
    }
}
