package com.masPro.masPro.gui;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;

import org.springframework.stereotype.Component;

import java.awt.SystemColor;

import com.toedter.calendar.JDateChooser;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;


@Component
public class CreateApplicationWindow {
    private JFrame addApplicationFrm;
    private JLabel topTextFrame;
    private JPanel buttonPanel;
    private JButton goToMainBtn;
    private JButton addApplicationBtn;
    private JPanel panel_1;
    private JPanel panel_2;
    private JPanel panel_3;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    private JTextField nazwaImprezyField;
    private JLabel lblNewLabel_3;
    private JDateChooser dataImprezyField;
    private JLabel lblNewLabel_4;
    private JScrollPane scrollPane;
    private JTextArea opisImprezyField;
    private JLabel label_1;
    private JLabel lblError;
    private JLabel lblAdresImprezy;
    private JTextField adresImprezyField;
    private DefaultComboBoxModel<String> cbModel;

    private JComboBox<String> getResultsComboBox;

    public CreateApplicationWindow() {
        initialize();
    }


    private void initialize() {

        setMainView();
        prepareBottomSection();
        prepareCentreSection();


        panel_3 = new JPanel();
        panel_3.setBackground(SystemColor.menu);
        addApplicationFrm.getContentPane().add(panel_3, BorderLayout.CENTER);
        panel_3.setLayout(new GridLayout(0, 2, 4, 10));

        //-------------------------------------------------------------------------------------------


        lblNewLabel_2 = new JLabel("Rodzaj badania:");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        panel_3.add(lblNewLabel_2);

        nazwaImprezyField = new JTextField();
        nazwaImprezyField.setHorizontalAlignment(SwingConstants.CENTER);
        nazwaImprezyField.setFont(new Font("Tahoma", Font.PLAIN, 16));
        panel_3.add(nazwaImprezyField);
        nazwaImprezyField.setColumns(10);

        //-------------------------------------------------------------------------------------------


        lblNewLabel_3 = new JLabel("Data badania:");
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        panel_3.add(lblNewLabel_3);

        dataImprezyField = new JDateChooser();
        dataImprezyField.setFont(new Font("Tahoma", Font.PLAIN, 16));
        panel_3.add(dataImprezyField);

        //-------------------------------------------------------------------------------------------

        lblAdresImprezy = new JLabel("Odebrania wyników:");
        lblAdresImprezy.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblAdresImprezy.setHorizontalAlignment(SwingConstants.CENTER);
        panel_3.add(lblAdresImprezy);

//        adresImprezyField = new JTextField();
//        adresImprezyField.setHorizontalAlignment(SwingConstants.CENTER);
//        adresImprezyField.setFont(new Font("Tahoma", Font.PLAIN, 16));
//        adresImprezyField.setColumns(10);

//        bigList.setPrototypeCellValue("12345");
        getResultsComboBox  = new JComboBox<String>();
        panel_3.add(getResultsComboBox);
        //-------------------------------------------------------------------------------------------


        lblNewLabel_4 = new JLabel("Sposób płatności:");
        lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
        panel_3.add(lblNewLabel_4);


        opisImprezyField = new JTextArea();
        opisImprezyField.setFont(new Font("Tahoma", Font.PLAIN, 16));
        panel_3.add(opisImprezyField);

        scrollPane = new JScrollPane(opisImprezyField);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        panel_3.add(scrollPane);


        lblError = new JLabel("");
        lblError.setForeground(Color.RED);
        lblError.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblError.setHorizontalAlignment(SwingConstants.CENTER);
        panel_3.add(lblError);


    }

    public JPanel getButtonPanel() {
        return buttonPanel;
    }

    public void setButtonPanel(JPanel buttonPanel) {
        this.buttonPanel = buttonPanel;
    }

    public JButton getGoToMainBtn() {
        return goToMainBtn;
    }

    public void setGoToMainBtn(JButton goToMainBtn) {
        this.goToMainBtn = goToMainBtn;
    }

    public JFrame getAddApplicationFrm() {
        return addApplicationFrm;
    }

    public void setAddApplicationFrm(JFrame addApplicationFrm) {
        this.addApplicationFrm = addApplicationFrm;
    }

    public JButton getAddApplicationBtn() {
        return addApplicationBtn;
    }

    public JLabel getTopTextFrame() {
        return topTextFrame;
    }

    public void setTopTextFrame(JLabel topTextFrame) {
        this.topTextFrame = topTextFrame;
    }

    public void setAddApplicationBtn(JButton addApplicationBtn) {
        this.addApplicationBtn = addApplicationBtn;
    }


    public JTextField getNazwaImprezyField() {
        return nazwaImprezyField;
    }

    public void setNazwaImprezyField(JTextField nazwaImprezyField) {
        this.nazwaImprezyField = nazwaImprezyField;
    }

    public JDateChooser getDataImprezyField() {
        return dataImprezyField;
    }

    public void setDataImprezyField(JDateChooser dataImprezyField) {
        this.dataImprezyField = dataImprezyField;
    }

    public JTextArea getOpisImprezyField() {
        return opisImprezyField;
    }

    public void setOpisImprezyField(JTextArea opisImprezyField) {
        this.opisImprezyField = opisImprezyField;
    }

    public JLabel getLblError() {
        return lblError;
    }

    public void setLblError(JLabel lblError) {
        this.lblError = lblError;
    }

    public JTextField getAdresImprezyField() {
        return adresImprezyField;
    }

    public void setAdresImprezyField(JTextField adresImprezyField) {
        this.adresImprezyField = adresImprezyField;
    }

    private void setMainView() {
        addApplicationFrm = new JFrame();
        addApplicationFrm.setResizable(false);
        addApplicationFrm.setTitle("Zlozenie zamowienia");
        addApplicationFrm.setBounds(100, 100, 471, 526);
        addApplicationFrm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        addApplicationFrm.getContentPane().setLayout(new BorderLayout(0, 0));

        addApplicationFrm.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        addApplicationFrm.getContentPane().add(panel, BorderLayout.NORTH);

        topTextFrame = new JLabel("Zlozenie Zamowienia");
        topTextFrame.setFont(new Font("Tahoma", Font.PLAIN, 20));
        panel.add(topTextFrame);
    }

    private void prepareBottomSection() {
        buttonPanel = new JPanel();
        FlowLayout flowLayout = (FlowLayout) buttonPanel.getLayout();
        flowLayout.setHgap(10);
        addApplicationFrm.getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        goToMainBtn = new JButton("powrot");
        goToMainBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
        buttonPanel.add(goToMainBtn);

        addApplicationBtn = new JButton("Złóż wniosek");
        addApplicationBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
        buttonPanel.add(addApplicationBtn);
    }

    private void prepareCentreSection() {
    }



    public void setPaymentType(Vector<String> data){
        getResultsComboBox  = new JComboBox<String>(data);
        getResultsComboBox.setEditable(true);
        getResultsComboBox.setMaximumRowCount(data.size());

    }

    public void setGetResultsComboBox(Vector<String> data){
        getResultsComboBox  = new JComboBox<String>(data);
        getResultsComboBox.setEditable(true);
        getResultsComboBox.setMaximumRowCount(data.size());

    }

    public JComboBox<String> getGetResultsComboBox() {
        return getResultsComboBox;
    }

    public void setGetResultsComboBox(JComboBox<String> getResultsComboBox) {
        this.getResultsComboBox = getResultsComboBox;
    }


// Кнопка добавления элемента в модель данных
//        JButton btnAdd = new JButton("Добавить");
//        btnAdd.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                int pos = cbModel.getSize() - 1;
//                cbModel.insertElementAt("~ Добавленная строка ~", pos);
//            }
//        });

}
