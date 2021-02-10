package xyz.ssmidge.simplehwid;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;



public class Main {



    public static void main(String[] args) {

        HWID.getInstance().addHWID("Ssmidge", "DEV", 0);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VerifyFrame().verify();
            }
        });

    }

}