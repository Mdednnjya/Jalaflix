package HomeJalaFlix;

import SistemLogin.Register;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.security.DomainLoadStoreParameter;

public class Profil implements ActionListener {
    JFrame frame;
    JPanel panel;
    JLabel label;
    JLabel fullname;
    JLabel username;
    JLabel mobile;
    JLabel gender;
    JLabel birthDate;
    JLabel address;
    JButton back;
    JButton update;
    ImageIcon image = new ImageIcon("img.png");

    Profil(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Profile Page");
        frame.setBounds(500,300,500,550);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setVisible(true);
        frame.setIconImage(image.getImage());

        label = new JLabel("Profile");
        label.setBounds(185,20,150,150);
        label.setFont(new Font("Arial", Font.PLAIN, 40));
        label.setForeground(Color.WHITE);
        label.setVisible(true);
        frame.add(label);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(50,152,385,300);
        panel.setVisible(true);
        frame.add(panel);

        fullname = new JLabel("FullName : " + Register.fulUserN);
        fullname.setBounds(10,5, 350,50);
        panel.add(fullname);

        username = new JLabel("Username : " + Register.userN);
        username.setBounds(10,30, 200,50);
        panel.add(username);

        mobile = new JLabel("No. Telp : " + Register.mobile);
        mobile.setBounds(10,55, 200,50);
        panel.add(mobile);

        gender = new JLabel("Gender : " + Register.gender);
        gender.setBounds(10,80,150,50);
        panel.add(gender);

        birthDate = new JLabel("Tanggal Lahir : " + Register.date + " / "+ Register.month + " / "+Register.year);
        birthDate.setBounds(10,105,200,50);
        panel.add(birthDate);

        address = new JLabel("Address : "+ Register.address);
        address.setBounds(10,130,350,50);
        panel.add(address);

        back = new JButton("Back");
        back.setBounds(20,480,90,20);
        back.setFocusable(false);
        back.addActionListener(this);
        frame.add(back);

        update = new JButton("Update");
        update.setBounds(375,480,90,20);
        update.setFocusable(false);
        update.addActionListener(this);
        frame.add(update);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource()==back){
            frame.dispose();
            Home home = new Home();
        }else if (e.getSource()==update){
            frame.dispose();
            UpgradedProfile up = new UpgradedProfile();
        }
    }
}

class UpgradedProfile implements ActionListener{
    JFrame frame;
    JLabel label;
    JLabel fullname;
    JLabel username;
    JLabel mobile;
    JLabel gender;
    JLabel birthDate;
    JLabel address;
    JLabel notif;
    JRadioButton lklk;
    JRadioButton pr;
    ButtonGroup comb;
    JComboBox date;
    JComboBox month;
    JComboBox year;
    JTextField fullname1;
    JTextField username1;
    JTextField mobile1;
    JTextArea address1;
    JCheckBox term;
    JPanel panel;
    JButton back;
    JButton submit;
    JButton reset;
    ImageIcon image;
    private String[] dates = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    private String[] months = { "January", "february", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private String[] years = { "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023"};
//    private static String fullN;
//    private static String userN;
//    private static String mob;
//    private static String addreSS;
//    private static String

    UpgradedProfile(){
        frame = new JFrame();
        image = new ImageIcon("img.png");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Profile Page");
        frame.setBounds(500,300,500,550);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setVisible(true);
        frame.setIconImage(image.getImage());

        label = new JLabel();
        label.setText("Profile");
        label.setBounds(185,20,150,150);
        label.setFont(new Font("Arial", Font.PLAIN, 40));
        label.setForeground(Color.WHITE);
        label.setVisible(true);
        frame.add(label);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(50,152,385,300);
        panel.setVisible(true);
        frame.add(panel);

        fullname = new JLabel("FullName ");
        fullname1 = new JTextField(Register.fulUserN);
        fullname.setBounds(10,5, 100,50);
        panel.add(fullname);
        fullname1.setBounds(95,20,200,20);
        panel.add(fullname1);

        username = new JLabel("Username ");
        username1 = new JTextField(Register.userN);
        username.setBounds(10,30, 100,50);
        panel.add(username);
        username1.setBounds(95,45,150,20);
        panel.add(username1);

        mobile = new JLabel("No. Telp ");
        mobile1 = new JTextField(Register.mobile);
        mobile.setBounds(10,55, 100,50);
        panel.add(mobile);
        mobile1.setBounds(95,70,150,20);
        panel.add(mobile1);

        gender = new JLabel("Gender");
        gender.setBounds(10,80,100,50);
        panel.add(gender);

        lklk = new JRadioButton("Laki - Laki");
        lklk.setFont(new Font("Arial", Font.PLAIN,10));
        lklk.setBounds(92,95,80,20);
        lklk.setSelected(true);
        panel.add(lklk);

        pr = new JRadioButton("Perempuan");
        pr.setFont(new Font("Arial", Font.PLAIN,10));
        pr.setBounds(170,95,350,20);
        pr.setSelected(false);
        panel.add(pr);

        comb = new ButtonGroup();
        comb.add(lklk);
        comb.add(pr);

        birthDate = new JLabel("Tanggal Lahir");
        birthDate.setBounds(10,105,100,50);
        panel.add(birthDate);

        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 10));
        date.setBounds(95,120,50,20);
        panel.add(date);

        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 10));
        month.setBounds(145,120,70,20);
        panel.add(month);

        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 10));
        year.setBounds(215,120,50,20);
        panel.add(year);

        address = new JLabel("Address");
        address.setBounds(10,130,100,50);
        panel.add(address);

        address1 = new JTextArea(Register.address);
        address1.setBounds(95,145,200,75);
        address1.setLineWrap(true);
        panel.add(address1);

        term = new JCheckBox("Accept Terms & Conditions.");
        term.setBounds(95,220,200,20);
        term.setFont(new Font("Arial", Font.PLAIN,10));
        panel.add(term);

        back = new JButton("Back");
        back.setBounds(20,480,90,20);
        back.setFocusable(false);
        back.addActionListener(this);
        frame.add(back);

        reset = new JButton("Reset");
        reset.setBounds(195,245,90,20);
        reset.setFocusable(false);
        reset.addActionListener(this);
        panel.add(reset);

        submit = new JButton("Submit");
        submit.setBounds(95,245,90,20);
        submit.setFocusable(false);
        submit.addActionListener(this);
        panel.add(submit);

        notif = new JLabel("");
        notif.setBounds(95,270,150,20);
        panel.add(notif);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource()==back){
            frame.dispose();
            Profil profil = new Profil();
        }else if (e.getSource()==submit){
            if (term.isSelected()){
                Register.fulUserN = fullname1.getText();
                Register.userN = username1.getText();
                Register.mobile = mobile1.getText();
                if (lklk.isSelected()){
                    Register.gender = lklk.getText();
                }else{
                    Register.gender = pr.getText();
                }
                Register.date = (String)date.getSelectedItem();
                Register.month = (String)month.getSelectedItem();
                Register.year = (String)year.getSelectedItem();
                Register.address = address1.getText();
                notif.setForeground(Color.GREEN);
                notif.setText("Registrasi Success..");
                frame.dispose();
                Profil profil = new Profil();
            }else{
                notif.setForeground(Color.RED);
                notif.setText("Please accept the terms & conditions..");
            }
        }else if (e.getSource()==reset){
            String nul = "";
            fullname1.setText(nul);
            username1.setText(nul);
            mobile1.setText(nul);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            address1.setText(nul);
            term.setSelected(false);
        }
    }
}
