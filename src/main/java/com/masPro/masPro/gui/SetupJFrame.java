package com.masPro.masPro.gui;

import javax.swing.*;
import java.awt.*;

public class SetupJFrame {
    public static JFrame setup(String title){
        try {
            com.jtattoo.plaf.acryl.AcrylLookAndFeel.setTheme("Green", "INSERT YOUR LICENSE KEY HERE", "my company");
            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        JFrame jFrame = new JFrame();
        jFrame.setResizable(false);
        jFrame.setTitle(title);
        jFrame.setBounds(100, 100, 1000, 450);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.getContentPane().setLayout(new BorderLayout(0, 0));
        jFrame.setLocationRelativeTo(null);

        return jFrame;
    }
}
