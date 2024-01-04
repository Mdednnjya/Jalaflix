package SistemLogin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LogReg implements ActionListener{
    JFrame frame = new JFrame();
    JButton myButton = new JButton("Register");
    JButton myButton2 = new JButton("Login");
    JButton myButton3 = new JButton("Log Out");
    ImageIcon image = new ImageIcon("img.png");

    public LogReg(){
        frame.setTitle("Sign In");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(new Point(500,300));
        frame.setLayout(null);
        frame.setSize(new Dimension(400,200));
        frame.setVisible(true);
        frame.setIconImage(image.getImage());
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.DARK_GRAY);

        myButton.setBounds(100,30,193,28);
        myButton.setFocusable(false);
        myButton.setForeground(Color.WHITE);
        myButton.setForeground(Color.BLACK);
        myButton.addActionListener(this);
        frame.add(myButton);

        myButton2.setBounds(100,77,193,28);
        myButton2.setFocusable(false);
        myButton2.setForeground(Color.WHITE);
        myButton2.setForeground(Color.BLACK);
        myButton2.addActionListener(this);
        frame.add(myButton2);

        myButton3.setBounds(100, 124,193,28);
        myButton3.setFocusable(false);
        myButton3.setForeground(Color.WHITE);
        myButton3.setForeground(Color.BLACK);
        myButton3.addActionListener(this);
        frame.add(myButton3);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource()==myButton){
            frame.dispose();
            Register register = new Register();
        }
        if (e.getSource()==myButton2){
            frame.dispose();
            Login login = new Login();
        }
        if (e.getSource()==myButton3){
            frame.dispose();
        }
    }

}
