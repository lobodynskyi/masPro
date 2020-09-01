package com.masPro.masPro.gui;

import org.springframework.stereotype.Component;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;


@Component
public class MainMenuWindow  {
    private JFrame mainMenuFrm;
    private JButton usersDataBtn;
    private JButton applicationsBtn;
    private JButton addApplicationsBtn;

    private JLabel nameLb;
    private JLabel emailLb;




    public MainMenuWindow() {
        initialize();
    }


    private void initialize() {

        setMainView();
        prepareBottomSection();
        prepareCentreSection();
        prepareTopSection();

        mainMenuFrm.setVisible(true);

    }

    private void prepareBottomSection(){

        JPanel bottomPanel = new JPanel();

        FlowLayout flowLayout = (FlowLayout) bottomPanel.getLayout();
        flowLayout.setHgap(10);
        mainMenuFrm.getContentPane().add(bottomPanel, BorderLayout.SOUTH);

        applicationsBtn = SetupBtn.setup("Wnioski");
        bottomPanel.add(applicationsBtn);

        addApplicationsBtn =SetupBtn.setup("Złóż wniosek");
        bottomPanel.add(addApplicationsBtn);

        usersDataBtn = SetupBtn.setup("Klienci");
        bottomPanel.add(usersDataBtn);

    }

    private void prepareCentreSection(){

        JPanel centralPanel = new JPanel();

        FlowLayout flowLayout = (FlowLayout) centralPanel.getLayout();
        flowLayout.setHgap(10);
        try {
            String fileName = "get-file.png";
            ClassLoader classLoader = getClass().getClassLoader();

            File file = new File(classLoader.getResource(fileName).getFile());
            centralPanel = new JPanelWithBackground(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        mainMenuFrm.getContentPane().add(centralPanel, BorderLayout.CENTER);
        mainMenuFrm.getContentPane().add(centralPanel, BorderLayout.CENTER);



    }

    private void setMainView(){
        mainMenuFrm = SetupJFrame.setup("Strona główna");
    }

    private void prepareTopSection(){
        JPanel panel_3 = new JPanel();
        panel_3.setBackground(SystemColor.menu);
        mainMenuFrm.getContentPane().add(panel_3, BorderLayout.NORTH);
        panel_3.setLayout(new GridLayout(0, 2, 4, 10));

        JLabel helloText = SetupJLabel.setup("Zalogowany użytkownik: ",18);
        helloText.setHorizontalAlignment(SwingConstants.RIGHT);
        panel_3.add(helloText);

        nameLb = SetupJLabel.setup("",18);
        nameLb.setHorizontalAlignment(SwingConstants.CENTER);
        panel_3.add(nameLb);

        JLabel emailLb = SetupJLabel.setup("E-mail użytkownika: ",18);
        emailLb.setHorizontalAlignment(SwingConstants.RIGHT);
        panel_3.add(emailLb);


        this.emailLb = SetupJLabel.setup("",18);
        this.emailLb.setHorizontalAlignment(SwingConstants.CENTER);
        panel_3.add(this.emailLb);


    }


    public JButton getUsersDataBtn() {
        return usersDataBtn;
    }

    public JButton getApplicationsBtn() {
        return applicationsBtn;
    }

    public JButton getAddApplicationsBtn() {
        return addApplicationsBtn;
    }

    public JLabel getNameLb() {
        return nameLb;
    }

    public JLabel getEmailLb() {
        return emailLb;
    }

    public JFrame getMainMenuFrm() {
        return mainMenuFrm;
    }
}

