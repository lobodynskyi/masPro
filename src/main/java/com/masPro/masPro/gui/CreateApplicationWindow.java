package com.masPro.masPro.gui;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;

import com.masPro.masPro.enums.BloodTestEnum;
import com.masPro.masPro.enums.PaymentTypeEnum;
import com.masPro.masPro.enums.ResultDeliveryEnum;
import org.springframework.stereotype.Component;

import java.awt.SystemColor;

import com.toedter.calendar.JDateChooser;

import java.awt.FlowLayout;


@Component
public class CreateApplicationWindow {
    private JFrame addApplicationFrm;
    private JButton goToMainBtn;
    private JButton addApplicationBtn;
    private JTextField userEmail;
    private JDateChooser dateChooser;


    private JComboBox<String> choseGetResultsMethodComboBox;
    private JComboBox<String> choseTestComboBox;
    private JComboBox<String> chosePaymentMethodComboBox;

    public CreateApplicationWindow() {
        initialize();
    }


    private void initialize() {

        setMainView();
        prepareBottomSection();
        prepareCentreSection();


        JPanel panel_3 = new JPanel();
        panel_3.setBackground(SystemColor.menu);
        addApplicationFrm.getContentPane().add(panel_3, BorderLayout.CENTER);
        panel_3.setLayout(new GridLayout(0, 2, 4, 10));

        //-------------------------------------------------------------------------------------------


        JLabel lblNewLabel_2 = SetupJLabel.setup("Rodzaj badania:", 18);
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        panel_3.add(lblNewLabel_2);

        choseTestComboBox = new JComboBox<>(BloodTestEnum.getStringArray());
        panel_3.add(choseTestComboBox);

        //-------------------------------------------------------------------------------------------


        JLabel lblNewLabel_3 = SetupJLabel.setup("Data badania:", 18);
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        panel_3.add(lblNewLabel_3);

        dateChooser = new JDateChooser();
        dateChooser.setFont(new Font("Tahoma", Font.PLAIN, 18));
        panel_3.add(dateChooser);

        //-------------------------------------------------------------------------------------------

        JLabel lblGetResults = SetupJLabel.setup("Odebrania wyników:", 18);
        lblGetResults.setHorizontalAlignment(SwingConstants.CENTER);
        panel_3.add(lblGetResults);

        choseGetResultsMethodComboBox = new JComboBox<>(ResultDeliveryEnum.getStringArray());
        panel_3.add(choseGetResultsMethodComboBox);
        //-------------------------------------------------------------------------------------------


        JLabel lblNewLabel_4 = SetupJLabel.setup("Sposób płatności:", 18);
        lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
        panel_3.add(lblNewLabel_4);

        chosePaymentMethodComboBox = new JComboBox<>(PaymentTypeEnum.getStringArray());
        panel_3.add(chosePaymentMethodComboBox);


        //-------------------------------------------------------------------------------------------------------


        JLabel lblNewLabel_5 =  SetupJLabel.setup("E-mail klienta:",18);
        lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
        panel_3.add(lblNewLabel_5);

        userEmail = new JTextField();
        userEmail.setHorizontalAlignment(SwingConstants.CENTER);
        userEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
        panel_3.add(userEmail);

    }



    private void setMainView() {
        addApplicationFrm  = SetupJFrame.setup("Złożenie wniosku");

        JPanel panel = new JPanel();
        addApplicationFrm.getContentPane().add(panel, BorderLayout.NORTH);

        JLabel topTextFrame = SetupJLabel.setup("Złożenie wniosku",20);
        panel.add(topTextFrame);
    }

    private void prepareBottomSection() {
        JPanel buttonPanel = new JPanel();
        FlowLayout flowLayout = (FlowLayout) buttonPanel.getLayout();
        flowLayout.setHgap(10);
        addApplicationFrm.getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        goToMainBtn = SetupBtn.setup("Powrót");
        buttonPanel.add(goToMainBtn);

        addApplicationBtn = SetupBtn.setup("Potwierdź");
        buttonPanel.add(addApplicationBtn);
    }

    private void prepareCentreSection() {
    }


    public JButton getGoToMainBtn() {
        return goToMainBtn;
    }

    public JButton getAddApplicationBtn() {
        return addApplicationBtn;
    }

    public JTextField getUserEmail() {
        return userEmail;
    }

    public JDateChooser getDateChooser() {
        return dateChooser;
    }

    public JComboBox<String> getChoseGetResultsMethodComboBox() {
        return choseGetResultsMethodComboBox;
    }

    public JComboBox<String> getChoseTestComboBox() {
        return choseTestComboBox;
    }

    public JComboBox<String> getChosePaymentMethodComboBox() {
        return chosePaymentMethodComboBox;
    }

    public JFrame getAddApplicationFrm() {
        return addApplicationFrm;
    }
}
