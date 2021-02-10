package xyz.ssmidge.simplehwid;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class VerifyFrame {

    public static String input = null;
    private final StringBuffer str = new StringBuffer();

    JFrame frame;
    public void verify() {

        frame = new JFrame("Verify");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel text = new JLabel("Please enter your HWID...");
        JButton button = new JButton("Submit");
        JTextField field = new JTextField(20);

        frame.getContentPane().setLayout(new FlowLayout());

        frame.getContentPane().setBackground(new Color(106, 100, 207));

        frame.getContentPane().add(field, SwingConstants.CENTER);

        frame.getContentPane().add(text, SwingConstants.CENTER);

        frame.getContentPane().add(button, SwingConstants.CENTER);

        frame.setSize(275, 150);
        frame.setResizable(true);
        frame.setVisible(true);

        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String s = e.getActionCommand();
                if (s.equals("Submit")) {
                    // set the text of the label to the text of the field

                    HWID hwid = HWID.getInstance();
                    List<LicenseItem> items = hwid.HWIDs;

                    String displayText = "Invalid";
                    for (LicenseItem item : items) {
                        String id = item.getHWID();
                        if (id == null) {
                            continue;
                        }
                        if (id.equals(field.getText())) {
                            displayText = "Valid";
                        }
                    }

                    text.setText(displayText);
                    if (str.length() > 0) {
                        str.delete(0, str.length() - 1);
                    }
                    str.append(text.getText());

                    // set the text of field to blank
                    proceed();

                }
            }
        });

    }

    public String getText() {
        return this.str.toString();
    }

    protected void proceed() {
        if (getText().equalsIgnoreCase("Invalid")) {
            System.exit(69420);
        } else {

              System.err.println("Verified!");
              frame.dispose();

        }

    }


}
