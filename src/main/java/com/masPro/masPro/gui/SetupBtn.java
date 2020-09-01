package com.masPro.masPro.gui;

import javax.swing.*;
import java.awt.*;

public class SetupBtn {
    public static JButton setup(String btnName){
        JButton jButton = new JButton(btnName);
        jButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        return jButton;
    }
}
