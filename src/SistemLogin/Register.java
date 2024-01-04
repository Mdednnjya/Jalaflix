package SistemLogin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Register implements ActionListener {
    public static String fulUserN;
    public static String userN;
    public static String pass;
    public static String mobile;
    public static String gender;
    public static String date;
    public static String month;
    public static String year;
    public static String address;
    JFrame frame = new JFrame();
    JButton myButton = new JButton("Register");
    JButton myButton1 = new JButton("Login");
    JTextField fullName = new JTextField();
    JTextField username = new JTextField();
    JTextField password = new JTextField();
    JTextField ulangiPassword = new JTextField();
    JLabel label = new JLabel();
    JLabel fullName1 = new JLabel("Full Name");
    JLabel username1 = new JLabel("Username");
    JLabel password1 = new JLabel("Password");
    JLabel ulangiPassword1 = new JLabel("Ulangi Password");
    ImageIcon image = new ImageIcon("img.png");

    Register(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Register Page");
        frame.setBounds(500,300,500,550);
        frame.setLayout(null);
        frame.setIconImage(image.getImage());
        frame.setVisible(true);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.DARK_GRAY);

        label.setText("Register");
        label.setBounds(175,20,200,150);
        label.setFont(new Font("Arial",Font.PLAIN,40));
        label.setForeground(Color.WHITE);
        label.setVisible(true);
        frame.add(label);

        fullName1.setForeground(Color.WHITE);
        fullName1.setBounds(150, 152, 70, 20);
        frame.add(fullName1);
        fullName.setBounds(150, 172, 193, 28);
        frame.add(fullName);
        username1.setForeground(Color.WHITE);
        username1.setBounds(150, 210, 70, 20);
        frame.add(username1);
        username.setBounds(150, 230, 193, 28);
        frame.add(username);
        password1.setBounds(150,268,70,20);
        password1.setForeground(Color.WHITE);
        frame.add(password1);
        password.setBounds(150,288,193,28);
        frame.add(password);
        ulangiPassword1.setBounds(150, 326,100,20);
        ulangiPassword1.setForeground(Color.WHITE);
        frame.add(ulangiPassword1);
        ulangiPassword.setBounds(150,346,193,28);
        frame.add(ulangiPassword);

        myButton.setBounds(200,386,90,25);
        myButton.setFocusable(false);
        myButton.addActionListener(this);
        frame.add(myButton);

        myButton1.setBounds(200, 458,90,25);
        myButton1.setForeground(Color.WHITE);
        myButton1.addActionListener(this);
        myButton1.setOpaque(false);
        myButton1.setContentAreaFilled(false);
        myButton1.setBorderPainted(false);
        frame.add(myButton1);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == myButton) {
            if (ulangiPassword.getText().equals(password.getText())) {
                this.fulUserN = fullName.getText();
                this.userN = username.getText();
                this.pass = password.getText();
                frame.dispose();
                LogReg logReg = new LogReg();
            } else {
                JOptionPane.showMessageDialog(null, "Password Yang Diberikan Berbeda");
            }
        } else if (e.getSource() == myButton1) {
            frame.dispose();
            Login login = new Login();
        }
    }
}