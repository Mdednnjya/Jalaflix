package HomeJalaFlix;

import SistemLogin.LogReg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home implements ActionListener {
    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    JButton profil = new JButton("Profil");
    JButton film = new JButton("Film");
    JButton subscripsi = new JButton("Subscripsi");
    JButton history = new JButton("History");
    JButton signOut = new JButton("Sign Out");
    ImageIcon image = new ImageIcon("img.png");

    public Home(){
        frame.setTitle("HOME");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500,300,500,550);
        frame.setIconImage(image.getImage());
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.DARK_GRAY);

        label.setText("JalaFlix");
        label.setBounds(180,20,200,150);
        label.setFont(new Font("Arial",Font.PLAIN,40));
        label.setVisible(true);
        label.setForeground(Color.WHITE);
        frame.add(label);

        profil.setBounds(150, 152, 193,28);
        profil.setFocusable(false);
        profil.setForeground(Color.WHITE);
        profil.setForeground(Color.BLACK);
        profil.addActionListener(this);
        frame.add(profil);

        film.setBounds(150, 210,193,28);
        film.setFocusable(false);
        film.setForeground(Color.WHITE);
        film.setForeground(Color.BLACK);
        film.addActionListener(this);
        frame.add(film);

        subscripsi.setBounds(150, 268,193,28);
        subscripsi.setFocusable(false);
        subscripsi.setForeground(Color.WHITE);
        subscripsi.setForeground(Color.BLACK);
        subscripsi.addActionListener(this);
        frame.add(subscripsi);

        history.setBounds(150, 326,193,28);
        history.setFocusable(false);
        history.setForeground(Color.WHITE);
        history.setForeground(Color.BLACK);
        history.addActionListener(this);
        frame.add(history);

        signOut.setBounds(150, 384,193,28);
        signOut.setFocusable(false);
        signOut.setForeground(Color.WHITE);
        signOut.setForeground(Color.BLACK);
        signOut.addActionListener(this);
        frame.add(signOut);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource()==profil){
            frame.dispose();
            Profil profil1 = new Profil();
        }else if (e.getSource()==film){
            if(Subscripsi.rank==null){
                JOptionPane.showMessageDialog(null, "Anda Belum Subcribe.. Silahkan Subscribe Terlebih Dahulu !!");
            }else if(Subscripsi.rank.equals("Gold")){
                frame.dispose();
                FilmGold filmGold = new FilmGold();
            }else if(Subscripsi.rank.equals("Platinum")){
                frame.dispose();
                FilmPlatinum filmPlatinum = new FilmPlatinum();
            }else if(Subscripsi.rank.equals("Regular")){
                frame.dispose();
                FilmRegular filmRegular = new FilmRegular();
            }
        }else if (e.getSource()==subscripsi){
            frame.dispose();
            Subscripsi subscripsi1 = new Subscripsi();
        }else if (e.getSource()==history){
            frame.dispose();
            History history1 = new History();
        }else if (e.getSource()==signOut){
            frame.dispose();
            LogReg log = new LogReg();
        }
    }
}
