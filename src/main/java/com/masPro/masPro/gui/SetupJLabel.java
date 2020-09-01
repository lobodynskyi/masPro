package com.masPro.masPro.gui;

import javax.swing.*;
import java.awt.*;

public class SetupJLabel {
    public static JLabel setup(String text, int size) {
        JLabel jLabel = new JLabel(text);
        jLabel.setFont(new Font("Tahoma", Font.PLAIN, size));
        return jLabel;
    }
}
