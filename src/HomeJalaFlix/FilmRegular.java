package HomeJalaFlix;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FilmRegular implements ActionListener {
    JFrame frame;
    JLabel label;
    JPanel panel;
    JButton avatar;
    JButton inception;
    JButton interstellar;
    JButton tenet;
    JButton dunkirk;
    JButton back;
    JTextArea hasil;
    ImageIcon image = new ImageIcon("img.png");
    FilmRegular(){
        frame = new JFrame("Film Regular");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 300, 900, 650);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setVisible(true);
        frame.setIconImage(image.getImage());

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(50, 152, 790, 410);
        panel.setVisible(true);
        frame.add(panel);

        label = new JLabel("Selamat Datang di Film Reguler");
        label.setBounds(150,30,580,80);
        label.setFont(new Font("Arial", Font.PLAIN, 40));
        label.setForeground(Color.WHITE);
        frame.add(label);

        avatar = new JButton("Avatar");
        avatar.setBounds(52, 50, 120, 30);
        avatar.setFont(new Font("Arial", Font.PLAIN, 10));
        avatar.setFocusable(false);
        avatar.addActionListener(this);
        panel.add(avatar);

        inception = new JButton("Inception");
        inception.setBounds(52, 120, 120, 30);
        inception.setFont(new Font("Arial", Font.PLAIN, 10));
        inception.setFocusable(false);
        inception.addActionListener(this);
        panel.add(inception);

        interstellar = new JButton("Interstellar");
        interstellar.setBounds(52, 190, 120, 30);
        interstellar.setFont(new Font("Arial", Font.PLAIN, 10));
        interstellar.setFocusable(false);
        interstellar.addActionListener(this);
        panel.add(interstellar);

        tenet = new JButton("Tenet");
        tenet.setBounds(52, 260, 120, 30);
        tenet.setFont(new Font("Arial", Font.PLAIN, 10));
        tenet.setFocusable(false);
        tenet.addActionListener(this);
        panel.add(tenet);

        dunkirk = new JButton("Dunkirk");
        dunkirk.setBounds(52, 330, 120, 30);
        dunkirk.setFont(new Font("Arial", Font.PLAIN, 10));
        dunkirk.setFocusable(false);
        dunkirk.addActionListener(this);
        panel.add(dunkirk);

        hasil = new JTextArea();
        hasil.setBounds(480,50,270,20);
        hasil.setEditable(false);
        hasil.setLineWrap(true);
        panel.add(hasil);

        back = new JButton("Back");
        back.setBounds(675, 580, 90, 20);
        back.setFocusable(false);
        back.addActionListener(this);
        frame.add(back);
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==back){
            frame.dispose();
            Home home = new Home();
        }else if(e.getSource()==avatar){
            hasil.setText("Sedang menonton Avatar. . . .");
            History.history.add("Avatar");
        }else if(e.getSource()==inception){
            hasil.setText("Sedang menonton Inception. . . .");
            History.history.add("Inception");
        }else if(e.getSource()==interstellar){
            hasil.setText("Sedang menonton Interstellar. . . .");
            History.history.add("Interstellar");
        }else if(e.getSource()==tenet){
            hasil.setText("Sedang menonton Tenet. . . .");
            History.history.add("Tenet");
        }else if(e.getSource()==dunkirk){
            hasil.setText("Sedang menonton Dunkirk. . . .");
            History.history.add("Dunkirk");
        }
    }
}

class FilmGold implements ActionListener {
    JFrame frame;
    JLabel label;
    JPanel panel;
    JButton avatar;
    JButton inception;
    JButton interstellar;
    JButton tenet;
    JButton dunkirk;
    JButton manOfSteel;
    JButton justiceLeague;
    JButton nemo;
    JButton transcendence;
    JButton transformers;
    JButton back;
    JTextArea hasil;
    ImageIcon image = new ImageIcon("img.png");

    FilmGold() {
        frame = new JFrame("Film Gold");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 300, 900, 650);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setVisible(true);
        frame.setIconImage(image.getImage());

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(50, 152, 790, 410);
        panel.setVisible(true);
        frame.add(panel);

        label = new JLabel("Selamat Datang di Film Gold");
        label.setBounds(150, 30, 580, 80);
        label.setFont(new Font("Arial", Font.PLAIN, 40));
        label.setForeground(Color.WHITE);
        frame.add(label);

        avatar = new JButton("Avatar");
        avatar.setBounds(52, 50, 120, 30);
        avatar.setFont(new Font("Arial", Font.PLAIN, 10));
        avatar.setFocusable(false);
        avatar.addActionListener(this);
        panel.add(avatar);

        inception = new JButton("Inception");
        inception.setBounds(52, 120, 120, 30);
        inception.setFont(new Font("Arial", Font.PLAIN, 10));
        inception.setFocusable(false);
        inception.addActionListener(this);
        panel.add(inception);

        interstellar = new JButton("Interstellar");
        interstellar.setBounds(52, 190, 120, 30);
        interstellar.setFont(new Font("Arial", Font.PLAIN, 10));
        interstellar.setFocusable(false);
        interstellar.addActionListener(this);
        panel.add(interstellar);

        tenet = new JButton("Tenet");
        tenet.setBounds(52, 260, 120, 30);
        tenet.setFont(new Font("Arial", Font.PLAIN, 10));
        tenet.setFocusable(false);
        tenet.addActionListener(this);
        panel.add(tenet);

        dunkirk = new JButton("Dunkirk");
        dunkirk.setBounds(52, 330, 120, 30);
        dunkirk.setFont(new Font("Arial", Font.PLAIN, 10));
        dunkirk.setFocusable(false);
        dunkirk.addActionListener(this);
        panel.add(dunkirk);

        manOfSteel = new JButton("Man Of Steel");
        manOfSteel.setBounds(192, 50, 120, 30);
        manOfSteel.setFont(new Font("Arial", Font.PLAIN, 10));
        manOfSteel.setFocusable(false);
        manOfSteel.addActionListener(this);
        panel.add(manOfSteel);

        justiceLeague = new JButton("Justice League");
        justiceLeague.setBounds(192, 120, 120, 30);
        justiceLeague.setFont(new Font("Arial", Font.PLAIN, 10));
        justiceLeague.setFocusable(false);
        justiceLeague.addActionListener(this);
        panel.add(justiceLeague);

        nemo = new JButton("Nemo");
        nemo.setBounds(192, 190, 120, 30);
        nemo.setFont(new Font("Arial", Font.PLAIN, 10));
        nemo.setFocusable(false);
        nemo.addActionListener(this);
        panel.add(nemo);

        transcendence = new JButton("Transcendence");
        transcendence.setBounds(192, 260, 120, 30);
        transcendence.setFont(new Font("Arial", Font.PLAIN, 10));
        transcendence.setFocusable(false);
        transcendence.addActionListener(this);
        panel.add(transcendence);

        transformers = new JButton("Transformers");
        transformers.setBounds(192, 330, 120, 30);
        transformers.setFont(new Font("Arial", Font.PLAIN, 10));
        transformers.setFocusable(false);
        transformers.addActionListener(this);
        panel.add(transformers);

        hasil = new JTextArea();
        hasil.setBounds(480, 50, 270, 20);
        hasil.setEditable(false);
        hasil.setLineWrap(true);
        panel.add(hasil);

        back = new JButton("Back");
        back.setBounds(675, 580, 90, 20);
        back.setFocusable(false);
        back.addActionListener(this);
        frame.add(back);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
            frame.dispose();
            Home home = new Home();
        } else if (e.getSource() == avatar) {
            hasil.setText("Sedang menonton Avatar. . . .");
            History.history.add("Avatar");
        } else if (e.getSource() == inception) {
            hasil.setText("Sedang menonton Inception. . . .");
            History.history.add("Inception");
        } else if (e.getSource() == interstellar) {
            hasil.setText("Sedang menonton Interstellar. . . .");
            History.history.add("Interstellar");
        } else if (e.getSource() == tenet) {
            hasil.setText("Sedang menonton Tenet. . . .");
            History.history.add("Tenet");
        } else if (e.getSource() == dunkirk) {
            hasil.setText("Sedang menonton Dunkirk. . . .");
            History.history.add("Dunkirk");
        } else if (e.getSource() == manOfSteel) {
            hasil.setText("Sedang menonton Man Of Steel. . . .");
            History.history.add("Man Of Steel");
        } else if (e.getSource() == justiceLeague) {
            hasil.setText("Sedang menonton Justice League. . . .");
            History.history.add("Justice League");
        } else if (e.getSource() == nemo) {
            hasil.setText("Sedang menonton Nemo. . . .");
            History.history.add("Nemo");
        } else if (e.getSource() == transcendence) {
            hasil.setText("Sedang menonton Transcendence. . . .");
            History.history.add("Transcendence");
        } else if (e.getSource() == transformers) {
            hasil.setText("Sedang menonton Tranformers. . . .");
            History.history.add("Transformers");
        }
    }
}

class FilmPlatinum implements ActionListener {
    JFrame frame;
    JLabel label;
    JLabel poster;
    JPanel panel;
    JButton avatar;
    JButton inception;
    JButton interstellar;
    JButton tenet;
    JButton dunkirk;
    JButton manOfSteel;
    JButton justiceLeague;
    JButton nemo;
    JButton transcendence;
    JButton transformers;
    JButton tropicThunder;
    JButton trainspotting;
    JButton theMandalorian;
    JButton openheimer;
    JButton CODA;
    JButton back;
    JTextArea hasil;
    ImageIcon image = new ImageIcon("img.png");

    FilmPlatinum() {
        frame = new JFrame("Film Platinum");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 300, 900, 650);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setVisible(true);
        frame.setIconImage(image.getImage());

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(50, 152, 790, 410);
        panel.setVisible(true);
        frame.add(panel);

        label = new JLabel("Selamat Datang di Film Platinum");
        label.setBounds(150, 30, 580, 80);
        label.setFont(new Font("Arial", Font.PLAIN, 40));
        label.setForeground(Color.WHITE);
        frame.add(label);

        avatar = new JButton("Avatar");
        avatar.setBounds(52, 50, 120, 30);
        avatar.setFont(new Font("Arial", Font.PLAIN, 10));
        avatar.setFocusable(false);
        avatar.addActionListener(this);
        panel.add(avatar);

        inception = new JButton("Inception");
        inception.setBounds(52, 120, 120, 30);
        inception.setFont(new Font("Arial", Font.PLAIN, 10));
        inception.setFocusable(false);
        inception.addActionListener(this);
        panel.add(inception);

        interstellar = new JButton("Interstellar");
        interstellar.setBounds(52, 190, 120, 30);
        interstellar.setFont(new Font("Arial", Font.PLAIN, 10));
        interstellar.setFocusable(false);
        interstellar.addActionListener(this);
        panel.add(interstellar);

        tenet = new JButton("Tenet");
        tenet.setBounds(52, 260, 120, 30);
        tenet.setFont(new Font("Arial", Font.PLAIN, 10));
        tenet.setFocusable(false);
        tenet.addActionListener(this);
        panel.add(tenet);

        dunkirk = new JButton("Dunkirk");
        dunkirk.setBounds(52, 330, 120, 30);
        dunkirk.setFont(new Font("Arial", Font.PLAIN, 10));
        dunkirk.setFocusable(false);
        dunkirk.addActionListener(this);
        panel.add(dunkirk);

        manOfSteel = new JButton("Man Of Steel");
        manOfSteel.setBounds(192, 50, 120, 30);
        manOfSteel.setFont(new Font("Arial", Font.PLAIN, 10));
        manOfSteel.setFocusable(false);
        manOfSteel.addActionListener(this);
        panel.add(manOfSteel);

        justiceLeague = new JButton("Justice League");
        justiceLeague.setBounds(192, 120, 120, 30);
        justiceLeague.setFont(new Font("Arial", Font.PLAIN, 10));
        justiceLeague.setFocusable(false);
        justiceLeague.addActionListener(this);
        panel.add(justiceLeague);

        nemo = new JButton("Nemo");
        nemo.setBounds(192, 190, 120, 30);
        nemo.setFont(new Font("Arial", Font.PLAIN, 10));
        nemo.setFocusable(false);
        nemo.addActionListener(this);
        panel.add(nemo);

        transcendence = new JButton("Transcendence");
        transcendence.setBounds(192, 260, 120, 30);
        transcendence.setFont(new Font("Arial", Font.PLAIN, 10));
        transcendence.setFocusable(false);
        transcendence.addActionListener(this);
        panel.add(transcendence);

        transformers = new JButton("Transformer");
        transformers.setBounds(192, 330, 120, 30);
        transformers.setFont(new Font("Arial", Font.PLAIN, 10));
        transformers.setFocusable(false);
        transformers.addActionListener(this);
        panel.add(transformers);

        tropicThunder = new JButton("Tropic Thunder");
        tropicThunder.setBounds(332, 50, 120, 30);
        tropicThunder.setFont(new Font("Arial", Font.PLAIN, 10));
        tropicThunder.setFocusable(false);
        tropicThunder.addActionListener(this);
        panel.add(tropicThunder);

        trainspotting = new JButton("Transpotting");
        trainspotting.setBounds(332, 120, 120, 30);
        trainspotting.setFont(new Font("Arial", Font.PLAIN, 10));
        trainspotting.setFocusable(false);
        trainspotting.addActionListener(this);
        panel.add(trainspotting);

        theMandalorian = new JButton("The Mandalorian");
        theMandalorian.setBounds(332, 190, 120, 30);
        theMandalorian.setFont(new Font("Arial", Font.PLAIN, 10));
        theMandalorian.setFocusable(false);
        theMandalorian.addActionListener(this);
        panel.add(theMandalorian);

        openheimer = new JButton("Openheimer");
        openheimer.setBounds(332, 260, 120, 30);
        openheimer.setFont(new Font("Arial", Font.PLAIN, 10));
        openheimer.setFocusable(false);
        openheimer.addActionListener(this);
        panel.add(openheimer);

        CODA = new JButton("CODA");
        CODA.setBounds(332, 330, 120, 30);
        CODA.setFont(new Font("Arial", Font.PLAIN, 10));
        CODA.setFocusable(false);
        CODA.addActionListener(this);
        panel.add(CODA);

        hasil = new JTextArea();
        hasil.setBounds(480, 50, 270, 20);
        hasil.setEditable(false);
        hasil.setLineWrap(true);
        panel.add(hasil);

        back = new JButton("Back");
        back.setBounds(675, 580, 90, 20);
        back.setFocusable(false);
        back.addActionListener(this);
        frame.add(back);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
            frame.dispose();
            Home home = new Home();
        } else if (e.getSource() == avatar) {
            hasil.setText("Sedang menonton Avatar. . . .");
            History.history.add("Avatar");
        } else if (e.getSource() == inception) {
            hasil.setText("Sedang menonton Inception. . . .");
            History.history.add("Inception");
        } else if (e.getSource() == interstellar) {
            hasil.setText("Sedang menonton Interstellar. . . .");
            History.history.add("Interstellar");
        } else if (e.getSource() == tenet) {
            hasil.setText("Sedang menonton Tenet. . . .");
            History.history.add("Tenet");
        } else if (e.getSource() == dunkirk) {
            hasil.setText("Sedang menonton Dunkirk. . . .");
            History.history.add("Dunkirk");
        } else if (e.getSource() == manOfSteel) {
            hasil.setText("Sedang menonton Man Of Steel. . . .");
            History.history.add("Man Of Steel");
        } else if (e.getSource() == justiceLeague) {
            hasil.setText("Sedang menonton Justice League. . . .");
            History.history.add("Justice League");
        } else if (e.getSource() == nemo) {
            hasil.setText("Sedang menonton Nemo. . . .");
            History.history.add("Nemo");
        } else if (e.getSource() == transcendence) {
            hasil.setText("Sedang menonton Transcendence. . . .");
            History.history.add("Transcendence");
        } else if (e.getSource() == transformers) {
            hasil.setText("Sedang menonton Tranformers. . . .");
            History.history.add("Transformers");
        } else if (e.getSource() == tropicThunder) {
            hasil.setText("Sedang menonton Tropic Thunder. . . .");
            History.history.add("Tropic Thunder");
        } else if (e.getSource() == trainspotting) {
            hasil.setText("Sedang menonton Trainspotting. . . .");
            History.history.add("Trainspotting");
        } else if (e.getSource() == theMandalorian) {
            hasil.setText("Sedang menonton The Mandalorian. . . .");
            History.history.add("The Mandalorian");
        } else if (e.getSource() == openheimer) {
            hasil.setText("Sedang menonton Openheimer. . . .");
            History.history.add("Openheimer");
        } else if (e.getSource() == CODA) {
            hasil.setText("Sedang menonton CODA. . . .");
            History.history.add("CODA");
        }
    }
}


