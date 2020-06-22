package com.masPro.masPro.gui;

import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;


@Component
public class MainMenuWindow extends JFrame {
    private JPanel MainMenu;
    private JButton changeUserDataBtn;
    private JButton applicationsBtn;
    private JButton addApplicationsBtn;
    private JButton info1;
    private JButton info2;
    private JButton info3;

    private JPanel bottomPanel;
    private JPanel centralPanel;

    private JPanel panel_3;
    private JLabel nameLb;
    private JLabel lastNameLb;
    private JLabel emailLb;




    public MainMenuWindow() {
        initialize();
    }


    private void initialize() {

        setMainView();
        prepareBottomSection();
        prepareCentreSection();
        prepareTopSection();

        this.setVisible(true);

    }

    private void prepareBottomSection(){

        bottomPanel = new JPanel();

        FlowLayout flowLayout = (FlowLayout) bottomPanel.getLayout();
        flowLayout.setHgap(10);
        this.getContentPane().add(bottomPanel, BorderLayout.SOUTH);

        info1 = new JButton("info1");
        info1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        bottomPanel.add(info1);

        info2 = new JButton("info1");
        info2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        bottomPanel.add(info2);

        info3 = new JButton("info1");
        info3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        bottomPanel.add(info3);
    }

    private void prepareCentreSection(){

        centralPanel = new JPanel();

        FlowLayout flowLayout = (FlowLayout) centralPanel.getLayout();
        flowLayout.setHgap(10);
        this.getContentPane().add(centralPanel, BorderLayout.CENTER);

        applicationsBtn = new JButton("wnioski");
        applicationsBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
        centralPanel.add(applicationsBtn);

        addApplicationsBtn = new JButton("zloz wniosek");
        addApplicationsBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
        centralPanel.add(addApplicationsBtn);

    }

    private void setMainView(){
        this.setResizable(false);
        this.setTitle("main");
        this.setBounds(150, 150, 520, 570);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.getContentPane().setLayout(new BorderLayout(0, 0));

        this.setLocationRelativeTo(null);
    }

    private void prepareTopSection(){
        panel_3 = new JPanel();
        panel_3.setBackground(SystemColor.menu);
        this.getContentPane().add(panel_3, BorderLayout.NORTH);
        panel_3.setLayout(new GridLayout(0, 2, 4, 10));

        nameLb = new JLabel("");
        nameLb.setFont(new Font("Tahoma", Font.PLAIN, 18));
        nameLb.setHorizontalAlignment(SwingConstants.CENTER);
        panel_3.add(nameLb);

        lastNameLb = new JLabel("");
        lastNameLb.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lastNameLb.setHorizontalAlignment(SwingConstants.LEFT);
        panel_3.add(lastNameLb);


        emailLb = new JLabel("");
        emailLb.setFont(new Font("Tahoma", Font.PLAIN, 18));
        emailLb.setHorizontalAlignment(SwingConstants.CENTER);
        panel_3.add(emailLb);

        changeUserDataBtn = new JButton("info o uzytkowniku");
        changeUserDataBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
        changeUserDataBtn.setHorizontalAlignment(SwingConstants.CENTER);
        panel_3.add(changeUserDataBtn);
    }

    public JPanel getMainMenu() {
        return MainMenu;
    }

    public void setMainMenu(JPanel mainMenu) {
        MainMenu = mainMenu;
    }

    public JButton getChangeUserDataBtn() {
        return changeUserDataBtn;
    }

    public void setChangeUserDataBtn(JButton changeUserDataBtn) {
        this.changeUserDataBtn = changeUserDataBtn;
    }

    public JButton getApplicationsBtn() {
        return applicationsBtn;
    }

    public void setApplicationsBtn(JButton applicationsBtn) {
        this.applicationsBtn = applicationsBtn;
    }

    public JButton getAddApplicationsBtn() {
        return addApplicationsBtn;
    }

    public void setAddApplicationsBtn(JButton addApplicationsBtn) {
        this.addApplicationsBtn = addApplicationsBtn;
    }

    public JButton getInfo1() {
        return info1;
    }

    public void setInfo1(JButton info1) {
        this.info1 = info1;
    }

    public JButton getInfo2() {
        return info2;
    }

    public void setInfo2(JButton info2) {
        this.info2 = info2;
    }

    public JButton getInfo3() {
        return info3;
    }

    public void setInfo3(JButton info3) {
        this.info3 = info3;
    }

    public JPanel getBottomPanel() {
        return bottomPanel;
    }

    public void setBottomPanel(JPanel bottomPanel) {
        this.bottomPanel = bottomPanel;
    }

    public JPanel getCentralPanel() {
        return centralPanel;
    }

    public void setCentralPanel(JPanel centralPanel) {
        this.centralPanel = centralPanel;
    }

    public JPanel getPanel_3() {
        return panel_3;
    }

    public void setPanel_3(JPanel panel_3) {
        this.panel_3 = panel_3;
    }

    public JLabel getNameLb() {
        return nameLb;
    }

    public void setNameLb(JLabel nameLb) {
        this.nameLb = nameLb;
    }

    public JLabel getLastNameLb() {
        return lastNameLb;
    }

    public void setLastNameLb(JLabel lastNameLb) {
        this.lastNameLb = lastNameLb;
    }

    public JLabel getEmailLb() {
        return emailLb;
    }

    public void setEmailLb(JLabel emailLb) {
        this.emailLb = emailLb;
    }
}
