package com.project.intelliStart;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Marketplace {

    protected static Products[] products;
    protected static Users[] users;

    private static JList<Users> listU;
    private static JList<Products> listP;

    private  static JButton buy_button;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Marketplace");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        Container container = frame.getContentPane();

        container.setLayout(new GridLayout(2, 2, 10, 10));

        JButton butt_users = new JButton("Show Users");
        container.add(butt_users);

        JButton butt_prod = new JButton("Show Products");
        container.add(butt_prod);

        buy_button = new JButton("Buy Products");
        container.add(buy_button);

        butt_users.addActionListener(new BuEventManager());
        butt_prod.addActionListener(new BpEventManager());
        buy_button.addActionListener(new BuyEventManager());

        products = new Products[3];
        users = new Users[3];

        products[0] = new Products(1, "chair", 350.0);
        products[1] = new Products(2, "sofa", 7000.0);
        products[2] = new Products(3, "commode", 1200.0);

        users[0] = new Users(1, "Vlad", "Isarev", 30000);
        users[1] = new Users(2, "John", "Smith", 30000);
        users[2] = new Users(3, "William", "Boll", 1000);


        listU = new JList<>(users);
        listU.setLayoutOrientation(JList.HORIZONTAL_WRAP);

        listP = new JList<>(products);
        listP.setLayoutOrientation(JList.HORIZONTAL_WRAP);

        frame.setVisible(true);
    }

    static class BuEventManager implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JList jlist = listU;
            jlist.getToolTipText();
            JOptionPane.showMessageDialog(null,  jlist, "Users", JOptionPane.PLAIN_MESSAGE);
        }
    }

    static  class BpEventManager implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JList jlist = listP;
            jlist.getToolTipText();
            JOptionPane.showMessageDialog(null,  jlist, "Products", JOptionPane.PLAIN_MESSAGE);
        }
    }

    static class BuyEventManager implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == buy_button){
                NewWindow window = new NewWindow();
            }
        }
    }

}
