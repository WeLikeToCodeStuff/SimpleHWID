package xyz.ssmidge.tutorial;

import xyz.ssmidge.simplehwid.HWID;
import xyz.ssmidge.simplehwid.VerifyFrame;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        HWID.getInstance().addHWID("Ssmidge", "DevSsmidge", 0);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VerifyFrame().verify();
            }
        });

    }

}
