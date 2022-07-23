package com.project.intelliStart;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewWindow {
    JFrame frame = new JFrame("Buy Product");
    JLabel lP = new JLabel("Enter ID of product"); //label for product
    TextField tP = new TextField(); //text field for product
    JLabel lU = new JLabel("Enter ID of product"); //label for user
    TextField tU = new TextField(); //text field for user
    JButton buy = new JButton("BUY");

    NewWindow(){
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // установить JFrame в центре экрана
        frame.setLocationRelativeTo(null);

        Container container = frame.getContentPane();

        container.add(lP);
        container.add(tP);
        container.add(lU);
        container.add(tU);
        container.add(buy);

        container.setLayout(new GridLayout(3, 2, 10, 10));

        frame.setVisible(true);
    }



    static class BuyEvent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "", "BUY", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
