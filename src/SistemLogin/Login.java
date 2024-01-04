package SistemLogin;

import HomeJalaFlix.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login implements ActionListener{
    JFrame myWindows = new JFrame();
    ImageIcon image = new ImageIcon("img.png");
    JLabel label = new JLabel();
    JLabel username = new JLabel("Username");
    JTextField username1 = new JTextField();
    JLabel password = new JLabel("Password");
    JPasswordField Password = new JPasswordField();
    JButton button = new JButton("Login");
    JButton button1 = new JButton("Register");

    Login(){
        myWindows.setTitle("Login Page");
        myWindows.setLocation(new Point(500, 300));
        myWindows.setLayout(null);
        myWindows.setSize(new Dimension(500, 550));
        myWindows.setVisible(true);
        myWindows.setResizable(false);
        myWindows.getContentPane().setBackground(Color.DARK_GRAY);
        myWindows.setIconImage(image.getImage());

        label.setText("Login");
        label.setBounds(200,20,100,150);
        label.setFont(new Font("Arial", Font.PLAIN, 40));
        label.setForeground(Color.WHITE);
        label.setVisible(true);
        myWindows.add(label);

        username.setForeground(Color.WHITE);
        username.setBounds(150, 152, 70, 20);
        myWindows.add(username);
        username1.setBounds(150, 172, 193, 28);
        myWindows.add(username1);

        password.setForeground(Color.WHITE);
        password.setBounds(150, 210, 70, 20);
        myWindows.add(password);
        Password.setBounds(150, 230, 193, 28);
        myWindows.add(Password);

        button.setBounds(200, 265, 90, 25);
        button.setForeground(Color.WHITE);
        button.setForeground(Color.BLACK);
        button.addActionListener(this);
        myWindows.add(button);

        button1.setBounds(200, 463,90,25);
        button1.setForeground(Color.WHITE);
        button1.addActionListener(this);
        button1.setOpaque(false);
        button1.setContentAreaFilled(false);
        button1.setBorderPainted(false);
        myWindows.add(button1);
    }
//    public String getUserN(){
//        SistemLogin.Register register = new SistemLogin.Register();
//        return register.userN;
//    }
//
//    public String getPass(){
//        SistemLogin.Register register = new SistemLogin.Register();
//        return register.pass;
//    }

    public void actionPerformed(ActionEvent e) {
        if (username1.getText().equals(Register.userN) && Password.getText().equals(Register.pass)) {
            myWindows.dispose();
            if (e.getSource() == button) {
                Home home = new Home();
            }
        }else if (e.getSource()==button1){
            myWindows.dispose();
            Register register = new Register();
        }else {
            JOptionPane.showMessageDialog(null, "Username atau Password Tidak Cocok ");
        }
    }
}


