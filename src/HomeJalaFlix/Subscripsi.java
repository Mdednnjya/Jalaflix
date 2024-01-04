package HomeJalaFlix;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.security.CodeSigner;

public class Subscripsi implements ActionListener {

    JFrame frame;
    JPanel panel;
    JLabel label;
    JLabel label1;
    JRadioButton regular;
    JRadioButton gold;
    JRadioButton platinum;
    ButtonGroup comb;
    JButton back;
    JButton moreInfo;
    JButton subs;
    JButton buy;
    public static int amount = 55000;
    public static String rank;
    ImageIcon image = new ImageIcon("img.png");

    public Subscripsi() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Subscription Page");
        frame.setBounds(500, 300, 500, 550);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setVisible(true);
        frame.setIconImage(image.getImage());

        label = new JLabel("Subscripsi");
        label.setBounds(150, 20, 185, 185);
        label.setFont(new Font("Arial", Font.PLAIN, 40));
        label.setForeground(Color.WHITE);
        label.setVisible(true);
        frame.add(label);

        label = new JLabel("Your Cash:  " + amount);
        label.setBounds(345, 20, 185, 20);
        label.setFont(new Font("Arial", Font.PLAIN, 12));
        label.setForeground(Color.WHITE);
        label.setVisible(true);
        frame.add(label);

        label1 = new JLabel("Subscripsi : " + rank);
        label1.setBounds(20, 20, 185, 20);
        label1.setFont(new Font("Arial", Font.PLAIN, 12));
        label1.setForeground(Color.WHITE);
        label1.setVisible(true);
        frame.add(label1);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(50, 152, 385, 300);
        panel.setVisible(true);
        frame.add(panel);

        regular = new JRadioButton("Regular");
        regular.setFont(new Font("Arial", Font.PLAIN, 10));
        regular.setBounds(70, 95, 80, 20);
        regular.setSelected(true);
        panel.add(regular);

        gold = new JRadioButton("Gold");
        gold.setFont(new Font("Arial", Font.PLAIN, 10));
        gold.setBounds(160, 95, 80, 20);
        gold.setSelected(true);
        panel.add(gold);

        platinum = new JRadioButton("Platinum");
        platinum.setFont(new Font("Arial", Font.PLAIN, 10));
        platinum.setBounds(240, 95, 80, 20);
        platinum.setSelected(true);
        panel.add(platinum);

        comb = new ButtonGroup();
        comb.add(regular);
        comb.add(gold);
        comb.add(platinum);

        back = new JButton("Back");
        back.setBounds(20, 480, 90, 20);
        back.setFocusable(false);
        back.addActionListener(this);
        frame.add(back);

        moreInfo = new JButton("More Info");
        moreInfo.setBounds(195, 480, 90, 20);
        moreInfo.setFocusable(false);
        moreInfo.addActionListener(this);
        frame.add(moreInfo);

        subs = new JButton("Subs");
        subs.setBounds(375, 480, 90, 20);
        subs.setFocusable(false);
        subs.addActionListener(this);
        frame.add(subs);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
            frame.dispose();
            Home home = new Home();
        } else if (e.getSource() == moreInfo) {
            if (regular.isSelected()) {
                frame.dispose();
                filmInfoRegular filmregular = new filmInfoRegular();
            } else if (gold.isSelected()) {
                frame.dispose();
                filmInfoGold filmgold = new filmInfoGold();
            } else if (platinum.isSelected()) {
                frame.dispose();
                filmInfoPlatinum filmplatinum = new filmInfoPlatinum();
            }
        } else if (e.getSource() == subs) {
            if (regular.isSelected()) {
                frame.dispose();
                SubscripsiRegular subscripsiRegular = new SubscripsiRegular();
            } else if (gold.isSelected()) {
                frame.dispose();
                SubscripsiGold subscripsiGold = new SubscripsiGold();
            } else if (platinum.isSelected()) {
                frame.dispose();
                SubscripsiPlatinum subscripsiPlatinum = new SubscripsiPlatinum();
            }

        }
    }
}
class filmInfoRegular implements ActionListener {
    JFrame frame;
    JPanel panel;
    JLabel label;
    JLabel label1;
    JButton avatar;
    JButton inception;
    JButton interstellar;
    JButton tenet;
    JButton dunkirk;
    JButton back;
    JButton buy;
    ImageIcon image = new ImageIcon("img.png");

    filmInfoRegular() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("More Info: regular category");
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

        label = new JLabel("Your Cash:  " + Subscripsi.amount);
        label.setBounds(750, 20, 185, 20);
        label.setFont(new Font("Arial", Font.PLAIN, 12));
        label.setForeground(Color.WHITE);
        label.setVisible(true);
        frame.add(label);

        label = new JLabel("Kategori: Regular");
        label.setBounds(50, 117, 275, 20);
        label.setFont(new Font("Arial", Font.PLAIN, 12));
        label.setForeground(Color.WHITE);
        label.setVisible(true);
        frame.add(label);

        label1 = new JLabel("Subscripsi : " + Subscripsi.rank);
        label1.setBounds(20, 20, 185, 20);
        label1.setFont(new Font("Arial", Font.PLAIN, 12));
        label1.setForeground(Color.WHITE);
        label1.setVisible(true);
        frame.add(label1);

        avatar = new JButton("Avatar");
        avatar.setBounds(52, 50, 100, 20);
        avatar.setFont(new Font("Arial", Font.PLAIN, 10));
        avatar.setFocusable(false);
        avatar.addActionListener(this);
        panel.add(avatar);

        inception = new JButton("Inception");
        inception.setBounds(192, 50, 100, 20);
        inception.setFont(new Font("Arial", Font.PLAIN, 10));
        inception.setFocusable(false);
        inception.addActionListener(this);
        panel.add(inception);

        interstellar = new JButton("Interstellar");
        interstellar.setBounds(332, 50, 100, 20);
        interstellar.setFont(new Font("Arial", Font.PLAIN, 10));
        interstellar.setFocusable(false);
        interstellar.addActionListener(this);
        panel.add(interstellar);

        tenet = new JButton("Tenet");
        tenet.setBounds(472, 50, 100, 20);
        tenet.setFont(new Font("Arial", Font.PLAIN, 10));
        tenet.setFocusable(false);
        tenet.addActionListener(this);
        panel.add(tenet);

        dunkirk = new JButton("Dunkirk");
        dunkirk.setBounds(612, 50, 100, 20);
        dunkirk.setFont(new Font("Arial", Font.PLAIN, 10));
        dunkirk.setFocusable(false);
        dunkirk.addActionListener(this);
        panel.add(dunkirk);

        label = new JLabel("Harga: 10.000");
        label.setBounds(20, 580, 90, 20);
        label.setFont(new Font("Arial", Font.PLAIN, 12));
        label.setForeground(Color.WHITE);
        label.setVisible(true);
        frame.add(label);

        back = new JButton("Back");
        back.setBounds(675, 580, 90, 20);
        back.setFocusable(false);
        back.addActionListener(this);
        frame.add(back);

        buy = new JButton("Buy");
        buy.setBounds(775, 580, 90, 20);
        buy.setFocusable(false);
        buy.addActionListener(this);
        frame.add(buy);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
            frame.dispose();
            Subscripsi subs = new Subscripsi();
        } else if (e.getSource() == buy) {
            frame.dispose();
            SubscripsiRegular subscripsiRegular = new SubscripsiRegular();
        } else if (e.getSource() == avatar) {
            frame.dispose();
            Avatar avatar = new Avatar();
        }else if (e.getSource() == inception) {
            frame.dispose();
            Inception Inception = new Inception();
        }else if (e.getSource() == interstellar) {
            frame.dispose();
            Interstellar Interstellar = new Interstellar();
        }else if (e.getSource() == tenet) {
            frame.dispose();
            Tenet tenet = new Tenet();
        }else if (e.getSource() == dunkirk) {
            frame.dispose();
            Dunkirk dunkirk = new Dunkirk();
        }
    }
}


class filmInfoGold implements ActionListener {
    JFrame frame;
    JPanel panel;
    JLabel label;
    JLabel label1;
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
    JButton buy;
    ImageIcon image = new ImageIcon("img.png");

    filmInfoGold() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("More Info: gold category");
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

        label = new JLabel("Your Cash:  " + Subscripsi.amount);
        label.setBounds(750, 20, 185, 20);
        label.setFont(new Font("Arial", Font.PLAIN, 12));
        label.setForeground(Color.WHITE);
        label.setVisible(true);
        frame.add(label);

        label = new JLabel("Kategori: Gold");
        label.setBounds(50, 117, 275, 20);
        label.setFont(new Font("Arial", Font.PLAIN, 12));
        label.setForeground(Color.WHITE);
        label.setVisible(true);
        frame.add(label);

        label1 = new JLabel("Subscripsi : " + Subscripsi.rank);
        label1.setBounds(20, 20, 185, 20);
        label1.setFont(new Font("Arial", Font.PLAIN, 12));
        label1.setForeground(Color.WHITE);
        label1.setVisible(true);
        frame.add(label1);

        avatar = new JButton("Avatar");
        avatar.setBounds(52, 50, 100, 20);
        avatar.setFont(new Font("Arial", Font.PLAIN, 10));
        avatar.setFocusable(false);
        avatar.addActionListener(this);
        panel.add(avatar);

        inception = new JButton("Inception");
        inception.setBounds(192, 50, 100, 20);
        inception.setFont(new Font("Arial", Font.PLAIN, 10));
        inception.setFocusable(false);
        inception.addActionListener(this);
        panel.add(inception);

        interstellar = new JButton("Interstellar");
        interstellar.setBounds(332, 50, 100, 20);
        interstellar.setFont(new Font("Arial", Font.PLAIN, 10));
        interstellar.setFocusable(false);
        interstellar.addActionListener(this);
        panel.add(interstellar);

        tenet = new JButton("Tenet");
        tenet.setBounds(472, 50, 100, 20);
        tenet.setFont(new Font("Arial", Font.PLAIN, 10));
        tenet.setFocusable(false);
        tenet.addActionListener(this);
        panel.add(tenet);

        dunkirk = new JButton("Dunkirk");
        dunkirk.setBounds(612, 50, 100, 20);
        dunkirk.setFont(new Font("Arial", Font.PLAIN, 10));
        dunkirk.setFocusable(false);
        dunkirk.addActionListener(this);
        panel.add(dunkirk);

        label = new JLabel("Harga: 20.000");
        label.setBounds(20, 580, 90, 20);
        label.setFont(new Font("Arial", Font.PLAIN, 12));
        label.setForeground(Color.WHITE);
        label.setVisible(true);
        frame.add(label);

        back = new JButton("Back");
        back.setBounds(675, 580, 90, 20);
        back.setFocusable(false);
        back.addActionListener(this);
        frame.add(back);

        buy = new JButton("Buy");
        buy.setBounds(775, 580, 90, 20);
        buy.setFocusable(false);
        buy.addActionListener(this);
        frame.add(buy);

        manOfSteel = new JButton("Man Of Steel");
        manOfSteel.setBounds(52, 100, 100, 20);
        manOfSteel.setFont(new Font("Arial", Font.PLAIN, 10));
        manOfSteel.setFocusable(false);
        manOfSteel.addActionListener(this);
        panel.add(manOfSteel);

        justiceLeague = new JButton("Justice League");
        justiceLeague.setBounds(192, 100, 100, 20);
        justiceLeague.setFont(new Font("Arial", Font.PLAIN, 10));
        justiceLeague.setFocusable(false);
        justiceLeague.addActionListener(this);
        panel.add(justiceLeague);

        nemo = new JButton("Nemo");
        nemo.setBounds(332, 100, 100, 20);
        nemo.setFont(new Font("Arial", Font.PLAIN, 10));
        nemo.setFocusable(false);
        nemo.addActionListener(this);
        panel.add(nemo);

        transcendence = new JButton("Transcendence");
        transcendence.setBounds(472, 100, 100, 20);
        transcendence.setFont(new Font("Arial", Font.PLAIN, 10));
        transcendence.setFocusable(false);
        transcendence.addActionListener(this);
        panel.add(transcendence);

        transformers = new JButton("Transformers");
        transformers.setBounds(612, 100, 100, 20);
        transformers.setFont(new Font("Arial", Font.PLAIN, 10));
        transformers.setFocusable(false);
        transformers.addActionListener(this);
        panel.add(transformers);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
            frame.dispose();
            Subscripsi subs = new Subscripsi();
        } else if (e.getSource() == buy) {
            frame.dispose();
            SubscripsiGold subscripsiGold = new SubscripsiGold();
        } else if (e.getSource() == avatar) {
            frame.dispose();
            Avatar avatar = new Avatar();
        } else if (e.getSource() == inception) {
            frame.dispose();
            Inception Inception = new Inception();
        } else if (e.getSource() == interstellar) {
            frame.dispose();
            Interstellar Interstellar = new Interstellar();
        } else if (e.getSource() == tenet) {
            frame.dispose();
            Tenet tenet = new Tenet();
        } else if (e.getSource() == dunkirk) {
            frame.dispose();
            Dunkirk dunkirk = new Dunkirk();
        } else if (e.getSource() == manOfSteel) {
            frame.dispose();
            manOfSteel manOfSteel = new manOfSteel();
        } else if (e.getSource() == justiceLeague) {
            frame.dispose();
            justiceLeague justiceLeague1 = new justiceLeague();
        } else if (e.getSource() == nemo) {
            frame.dispose();
            Nemo findingNemo = new Nemo();
        } else if (e.getSource() == transcendence) {
            frame.dispose();
            Transcendence transcendence = new Transcendence();
        } else if (e.getSource() == transformers) {
            frame.dispose();
            Transformers dunkirk = new Transformers();
        }
    }
}

class filmInfoPlatinum implements ActionListener {
    JFrame frame;
    JPanel panel;
    JLabel label;
    JLabel label1;
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
    JButton buy;
    ImageIcon image = new ImageIcon("img.png");

    filmInfoPlatinum() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("More Info: Platinum category");
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

        label = new JLabel("Your Cash:  " + Subscripsi.amount);
        label.setBounds(750, 20, 185, 20);
        label.setFont(new Font("Arial", Font.PLAIN, 12));
        label.setForeground(Color.WHITE);
        label.setVisible(true);
        frame.add(label);

        label = new JLabel("Kategori: Platinum");
        label.setBounds(50, 117, 275, 20);
        label.setFont(new Font("Arial", Font.PLAIN, 12));
        label.setForeground(Color.WHITE);
        label.setVisible(true);
        frame.add(label);

        label1 = new JLabel("Subscripsi : " + Subscripsi.rank);
        label1.setBounds(20, 20, 185, 20);
        label1.setFont(new Font("Arial", Font.PLAIN, 12));
        label1.setForeground(Color.WHITE);
        label1.setVisible(true);
        frame.add(label1);

        avatar = new JButton("Avatar");
        avatar.setBounds(52, 50, 100, 20);
        avatar.setFont(new Font("Arial", Font.PLAIN, 10));
        avatar.setFocusable(false);
        avatar.addActionListener(this);
        panel.add(avatar);

        inception = new JButton("Inception");
        inception.setBounds(192, 50, 100, 20);
        inception.setFont(new Font("Arial", Font.PLAIN, 10));
        inception.setFocusable(false);
        inception.addActionListener(this);
        panel.add(inception);

        interstellar = new JButton("Interstellar");
        interstellar.setBounds(332, 50, 100, 20);
        interstellar.setFont(new Font("Arial", Font.PLAIN, 10));
        interstellar.setFocusable(false);
        interstellar.addActionListener(this);
        panel.add(interstellar);

        tenet = new JButton("Tenet");
        tenet.setBounds(472, 50, 100, 20);
        tenet.setFont(new Font("Arial", Font.PLAIN, 10));
        tenet.setFocusable(false);
        tenet.addActionListener(this);
        panel.add(tenet);

        dunkirk = new JButton("Dunkirk");
        dunkirk.setBounds(612, 50, 100, 20);
        dunkirk.setFont(new Font("Arial", Font.PLAIN, 10));
        dunkirk.setFocusable(false);
        dunkirk.addActionListener(this);
        panel.add(dunkirk);

        label = new JLabel("Harga: 30.000");
        label.setBounds(20, 580, 90, 20);
        label.setFont(new Font("Arial", Font.PLAIN, 12));
        label.setForeground(Color.WHITE);
        label.setVisible(true);
        frame.add(label);

        back = new JButton("Back");
        back.setBounds(675, 580, 90, 20);
        back.setFocusable(false);
        back.addActionListener(this);
        frame.add(back);

        buy = new JButton("Buy");
        buy.setBounds(775, 580, 90, 20);
        buy.setFocusable(false);
        buy.addActionListener(this);
        frame.add(buy);

        manOfSteel = new JButton("Man Of Steel");
        manOfSteel.setBounds(52, 100, 100, 20);
        manOfSteel.setFont(new Font("Arial", Font.PLAIN, 10));
        manOfSteel.setFocusable(false);
        manOfSteel.addActionListener(this);
        panel.add(manOfSteel);

        justiceLeague = new JButton("Justice League");
        justiceLeague.setBounds(192, 100, 100, 20);
        justiceLeague.setFont(new Font("Arial", Font.PLAIN, 10));
        justiceLeague.setFocusable(false);
        justiceLeague.addActionListener(this);
        panel.add(justiceLeague);

        nemo = new JButton("Finding Nemo");
        nemo.setBounds(332, 100, 100, 20);
        nemo.setFont(new Font("Arial", Font.PLAIN, 10));
        nemo.setFocusable(false);
        nemo.addActionListener(this);
        panel.add(nemo);

        transcendence = new JButton("Transcendence");
        transcendence.setBounds(472, 100, 100, 20);
        transcendence.setFont(new Font("Arial", Font.PLAIN, 10));
        transcendence.setFocusable(false);
        transcendence.addActionListener(this);
        panel.add(transcendence);

        transformers = new JButton("Transformers");
        transformers.setBounds(612, 100, 100, 20);
        transformers.setFont(new Font("Arial", Font.PLAIN, 10));
        transformers.setFocusable(false);
        transformers.addActionListener(this);
        panel.add(transformers);


        tropicThunder = new JButton("Tropic Thunder");
        tropicThunder.setBounds(52, 150, 100, 20);
        tropicThunder.setFont(new Font("Arial", Font.PLAIN, 10));
        tropicThunder.setFocusable(false);
        tropicThunder.addActionListener(this);
        panel.add(tropicThunder);

        trainspotting = new JButton("Trainspotting");
        trainspotting.setBounds(192, 150, 100, 20);
        trainspotting.setFont(new Font("Arial", Font.PLAIN, 10));
        trainspotting.setFocusable(false);
        trainspotting.addActionListener(this);
        panel.add(trainspotting);

        theMandalorian = new JButton("The Mandalorian");
        theMandalorian.setBounds(332, 150, 100, 20);
        theMandalorian.setFont(new Font("Arial", Font.PLAIN, 10));
        theMandalorian.setFocusable(false);
        theMandalorian.addActionListener(this);
        panel.add(theMandalorian);

        openheimer = new JButton("Openheimer");
        openheimer.setBounds(472, 150, 100, 20);
        openheimer.setFont(new Font("Arial", Font.PLAIN, 10));
        openheimer.setFocusable(false);
        openheimer.addActionListener(this);
        panel.add(openheimer);

        CODA = new JButton("CODA");
        CODA.setBounds(612, 150, 100, 20);
        CODA.setFont(new Font("Arial", Font.PLAIN, 10));
        CODA.setFocusable(false);
        CODA.addActionListener(this);
        panel.add(CODA);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
            frame.dispose();
            Subscripsi subs = new Subscripsi();
        } else if (e.getSource() == buy) {
            frame.dispose();
            SubscripsiPlatinum subscripsiPlatinum = new SubscripsiPlatinum();
        } else if (e.getSource() == avatar) { //1
            frame.dispose();
            Avatar avatar = new Avatar();
        } else if (e.getSource() == inception) { //2
            frame.dispose();
            Inception Inception = new Inception();
        } else if (e.getSource() == interstellar) { //3
            frame.dispose();
            Interstellar Interstellar = new Interstellar();
        } else if (e.getSource() == tenet) { //4
            frame.dispose();
            Tenet tenet = new Tenet();
        } else if (e.getSource() == dunkirk) { //5
            frame.dispose();
            Dunkirk dunkirk = new Dunkirk();
        } else if (e.getSource() == manOfSteel) { //6
            frame.dispose();
            manOfSteel manOfSteel = new manOfSteel();
        } else if (e.getSource() == justiceLeague) { //7
            frame.dispose();
            justiceLeague justiceLeague1 = new justiceLeague();
        } else if (e.getSource() == nemo) { //8
            frame.dispose();
            Nemo findingNemo = new Nemo();
        } else if (e.getSource() == transcendence) { //9
            frame.dispose();
            Transcendence transcendence = new Transcendence();
        } else if (e.getSource() == transformers) { //10
            frame.dispose();
            Transformers dunkirk = new Transformers();
        } else if (e.getSource() == tropicThunder) { //11
            frame.dispose();
            tropicThunder transcendence = new tropicThunder();
        } else if (e.getSource() == trainspotting) { //12
            frame.dispose();
            Trainspotting manOfSteel = new Trainspotting();
        } else if (e.getSource() == theMandalorian) { //13
            frame.dispose();
            theMandalorian Inception = new theMandalorian();
        } else if (e.getSource() == openheimer) { //14
            frame.dispose();
            Openheimer findingNemo = new Openheimer();
        } else if (e.getSource() == CODA) { //15
            frame.dispose();
            CODA coda = new CODA();
        }
    }

}

class daftarfilm implements ActionListener{

    public void actionPerformed(ActionEvent e) {

    }


}

class SubscripsiRegular implements ActionListener {
    JFrame frame;
    JPanel panel;
    JLabel label;
    JLabel label1;
    JButton back;
    JButton subs;
    ImageIcon image = new ImageIcon("img.png");
    SubscripsiRegular(){
        frame = new JFrame();
        frame.setTitle("Subscripsi Regular");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setBounds(500, 300,400,200);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setIconImage(image.getImage());
        frame.setResizable(false);

        label = new JLabel("Subscripsi Regular");
        label.setBounds(100,25,193,50);
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        label.setForeground(Color.WHITE);
        frame.add(label);

        label1 = new JLabel("10.000 Rp / Bulan");
        label1.setBounds(100,45,193,50);
        label1.setFont(new Font("Arial", Font.PLAIN, 15));
        label1.setForeground(Color.WHITE);
        frame.add(label1);

        back = new JButton("Back");
        back.setBounds(10, 130, 110,25);
        back.setFocusable(false);
        back.addActionListener(this);
        frame.add(back);

        subs = new JButton("Subscribe");
        subs.setBounds(265, 130, 110,25);
        subs.setFocusable(false);
        subs.addActionListener(this);
        frame.add(subs);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==back){
            frame.dispose();
            Subscripsi subscripsi = new Subscripsi();
        }
        if (e.getSource()==subs){
            if (Subscripsi.rank==null) {
                Subscripsi.amount = Subscripsi.amount - 10000;
                Subscripsi.rank = "Regular";
                frame.dispose();
                Subscripsi subscripsi = new Subscripsi();
            }else if (Subscripsi.rank.equals("Regular")){
                JOptionPane.showMessageDialog(null, "Anda Sudah Membeli Rank Ini");
            }else{
                if (Subscripsi.amount >= 10000){
                    Subscripsi.amount = Subscripsi.amount - 10000;
                    Subscripsi.rank = "Regular";
                    frame.dispose();
                    Subscripsi subscripsi = new Subscripsi();
                }else{
                    JOptionPane.showMessageDialog(null, "Maaf Uang Anda Tidak Mencukupi");
                }
            }
        }
    }


}

class SubscripsiGold implements ActionListener {
    JFrame frame;
    JPanel panel;
    JLabel label;
    JLabel label1;
    JButton back;
    JButton subs;
    ImageIcon image = new ImageIcon("img.png");
    SubscripsiGold(){
        frame = new JFrame();
        frame.setTitle("Subscripsi Gold");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setBounds(500, 300,400,200);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setIconImage(image.getImage());
        frame.setResizable(false);

        label = new JLabel("Subscripsi Gold");
        label.setBounds(100,25,193,50);
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        label.setForeground(Color.WHITE);
        frame.add(label);

        label1 = new JLabel("20.000 Rp / Bulan");
        label1.setBounds(100,45,193,50);
        label1.setFont(new Font("Arial", Font.PLAIN, 15));
        label1.setForeground(Color.WHITE);
        frame.add(label1);

        back = new JButton("Back");
        back.setBounds(10, 130, 110,25);
        back.setFocusable(false);
        back.addActionListener(this);
        frame.add(back);

        subs = new JButton("Subscribe");
        subs.setBounds(265, 130, 110,25);
        subs.setFocusable(false);
        subs.addActionListener(this);
        frame.add(subs);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==back){
            frame.dispose();
            Subscripsi subscripsi = new Subscripsi();
        }else if (e.getSource()==subs){
            if (Subscripsi.rank==null){
                Subscripsi.amount = Subscripsi.amount - 20000;
                Subscripsi.rank = "Gold";
                frame.dispose();
                Subscripsi subscripsi = new Subscripsi();
            }else if (Subscripsi.rank.equals("Gold")){
                JOptionPane.showMessageDialog(null, "Anda Sudah Membeli Rank Ini");
            }else{
                if (Subscripsi.amount >= 20000){
                    Subscripsi.amount = Subscripsi.amount - 20000;
                    Subscripsi.rank = "Gold";
                    frame.dispose();
                    Subscripsi subscripsi = new Subscripsi();
                }else{
                    JOptionPane.showMessageDialog(null, "Maaf Uang Anda Tidak Mencukupi");
                }
            }
        }
    }


}

class SubscripsiPlatinum implements ActionListener {
    JFrame frame;
    JPanel panel;
    JLabel label;
    JLabel label1;
    JButton back;
    JButton subs;
    ImageIcon image = new ImageIcon("img.png");
    SubscripsiPlatinum(){
        frame = new JFrame();
        frame.setTitle("Subscripsi Platinum");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setBounds(500, 300,400,200);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setIconImage(image.getImage());
        frame.setResizable(false);

        label = new JLabel("Subscripsi Platinum");
        label.setBounds(100,25,193,50);
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        label.setForeground(Color.WHITE);
        frame.add(label);

        label1 = new JLabel("30.000 Rp / Bulan");
        label1.setBounds(100,45,193,50);
        label1.setFont(new Font("Arial", Font.PLAIN, 15));
        label1.setForeground(Color.WHITE);
        frame.add(label1);

        back = new JButton("Back");
        back.setBounds(10, 130, 110,25);
        back.setFocusable(false);
        back.addActionListener(this);
        frame.add(back);

        subs = new JButton("Subscribe");
        subs.setBounds(265, 130, 110,25);
        subs.setFocusable(false);
        subs.addActionListener(this);
        frame.add(subs);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==back){
            frame.dispose();
            Subscripsi subscripsi = new Subscripsi();
        }else if (e.getSource()==subs){
            if (Subscripsi.rank==null){
                Subscripsi.amount = Subscripsi.amount - 30000;
                Subscripsi.rank = "Platinum";
                frame.dispose();
                Subscripsi subscripsi = new Subscripsi();
            }else if (Subscripsi.rank.equals("Platinum")){
                JOptionPane.showMessageDialog(null, "Anda Sudah Membeli Rank Ini");
            }else{
                if (Subscripsi.amount >= 30000){
                    Subscripsi.amount = Subscripsi.amount - 30000;
                    Subscripsi.rank = "Platinum";
                    frame.dispose();
                    Subscripsi subscripsi = new Subscripsi();
                }else{
                    JOptionPane.showMessageDialog(null, "Maaf Uang Anda Tidak Mencukupi");
                }
            }
        }
    }
}

class Avatar implements ActionListener{
    JFrame frame;
    JPanel panel;
    JLabel genre;
    JLabel rated;
    JLabel releaseDate;
    JLabel title;
    JLabel sinopsis;
    JTextArea sinopsisText;
    JLabel label;
    JButton back;
    ImageIcon poster;
    ImageIcon image = new ImageIcon("img.png");


    Avatar(){
        frame = new JFrame();
        frame.setTitle("Avatar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 300, 500, 500);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setIconImage(image.getImage());
        frame.setVisible(true);

        // poster = new JLabel(image);
        // poster.
        // frame.add(poster);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(50,67,385,310);
        panel.setVisible(true);
        frame.add(panel);

        title = new JLabel("Title : Avatar");
        title.setBounds(10,5, 350,50);
        panel.add(title);

        genre = new JLabel("Genre: Action");
        genre.setBounds(10,30, 200,50);
        panel.add(genre);

        rated = new JLabel("Rated: PG-13");
        rated.setBounds(10,55, 200,50);
        panel.add(rated);

        releaseDate = new JLabel("Release date: Dec 17, 2009");
        releaseDate.setBounds(10,80,200,50);
        panel.add(releaseDate);

        sinopsis = new JLabel("Sinopsis:");
        sinopsis.setBounds(10,130,200,50);
        panel.add(sinopsis);

        poster = new ImageIcon("avatar.png");
        label = new JLabel(poster);
        label.setBounds(255,20,100,150);
        panel.add(label);

        sinopsisText = new JTextArea("Jake, who is paraplegic, replaces his twin on the Na'vi inhabited Pandora for a corporate mission. After the natives accept him as one of their own, he must decide where his loyalties lie.");
        sinopsisText.setBounds(10,180,350,100);
        sinopsisText.setLineWrap(true);
        sinopsisText.setEditable(false);
        panel.add(sinopsisText);

        back = new JButton("Back");
        back.setBounds(30,425,90,20);
        back.setFocusable(false);
        back.addActionListener(this);
        frame.add(back);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==back){
            frame.dispose();
            Subscripsi filmSubscripsiReg = new Subscripsi();
        }
    }
}

class Inception implements ActionListener{
    JFrame frame;
    JPanel panel;
    JLabel genre;
    JLabel rated;
    JLabel releaseDate;
    JLabel title;
    JLabel sinopsis;
    JTextArea sinopsisText;
    JLabel label;
    JButton back;
    ImageIcon poster;
    ImageIcon image = new ImageIcon("img.png");


    Inception(){
        frame = new JFrame();
        frame.setTitle("Inception");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 300, 500, 500);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setIconImage(image.getImage());
        frame.setVisible(true);

        // poster = new JLabel(image);
        // poster.
        // frame.add(poster);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(50,67,385,310);
        panel.setVisible(true);
        frame.add(panel);

        title = new JLabel("Title : Inception");
        title.setBounds(10,5, 350,50);
        panel.add(title);

        genre = new JLabel("Genre: Mystery & thriller");
        genre.setBounds(10,30, 200,50);
        panel.add(genre);

        rated = new JLabel("Rated: PG13");
        rated.setBounds(10,55, 200,50);
        panel.add(rated);

        releaseDate = new JLabel("Release date: July 16, 2010");
        releaseDate.setBounds(10,80,200,50);
        panel.add(releaseDate);

        sinopsis = new JLabel("Sinopsis:");
        sinopsis.setBounds(10,130,200,50);
        panel.add(sinopsis);

        poster = new ImageIcon("inception.png");
        label = new JLabel(poster);
        label.setBounds(255,20,100,150);
        panel.add(label);

        sinopsisText = new JTextArea("Cobb steals information from his targets by entering their dreams. Saito offers to wipe clean Cobb's criminal history as payment for performing an inception on his sick competitor's son.");
        sinopsisText.setBounds(10,180,350,100);
        sinopsisText.setLineWrap(true);
        sinopsisText.setEditable(false);
        panel.add(sinopsisText);

        back = new JButton("Back");
        back.setBounds(30,425,90,20);
        back.setFocusable(false);
        back.addActionListener(this);
        frame.add(back);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==back){
            frame.dispose();
            Subscripsi filmSubscripsiReg = new Subscripsi();
        }
    }
}

class Interstellar implements ActionListener{
    JFrame frame;
    JPanel panel;
    JLabel genre;
    JLabel rated;
    JLabel releaseDate;
    JLabel title;
    JLabel sinopsis;
    JTextArea sinopsisText;
    JLabel label;
    JButton back;
    ImageIcon poster;
    ImageIcon image = new ImageIcon("img.png");

    Interstellar(){
        frame = new JFrame();
        frame.setTitle("Interstellar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 300, 500, 500);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setIconImage(image.getImage());
        frame.setVisible(true);

        // poster = new JLabel(image);
        // poster.
        // frame.add(poster);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(50,67,385,310);
        panel.setVisible(true);
        frame.add(panel);

        title = new JLabel("Title : Interstellar");
        title.setBounds(10,5, 350,50);
        panel.add(title);

        genre = new JLabel("Genre: Sci-fi");
        genre.setBounds(10,30, 200,50);
        panel.add(genre);

        rated = new JLabel("Rated: PG-13");
        rated.setBounds(10,55, 200,50);
        panel.add(rated);

        releaseDate = new JLabel("Release date:  Nov 6, 2014");
        releaseDate.setBounds(10,80,200,50);
        panel.add(releaseDate);

        sinopsis = new JLabel("Sinopsis:");
        sinopsis.setBounds(10,130,200,50);
        panel.add(sinopsis);

        poster = new ImageIcon("interstellar.png");
        label = new JLabel(poster);
        label.setBounds(255,20,100,150);
        panel.add(label);

        sinopsisText = new JTextArea("When Earth becomes uninhabitable in the future, a farmer and ex-NASA pilot, Joseph Cooper, is tasked to pilot a spacecraft, along with a team of researchers, to find a new planet for humans.");
        sinopsisText.setBounds(10,180,350,100);
        sinopsisText.setLineWrap(true);
        sinopsisText.setEditable(false);
        panel.add(sinopsisText);

        back = new JButton("Back");
        back.setBounds(30,425,90,20);
        back.setFocusable(false);
        back.addActionListener(this);
        frame.add(back);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==back){
            frame.dispose();
            Subscripsi filmSubscripsiReg = new Subscripsi();
        }
    }
}

class Tenet implements ActionListener{
    JFrame frame;
    JPanel panel;
    JLabel genre;
    JLabel rated;
    JLabel releaseDate;
    JLabel title;
    JLabel sinopsis;
    JTextArea sinopsisText;
    JLabel label;
    JButton back;
    ImageIcon poster;
    ImageIcon image = new ImageIcon("img.png");


    Tenet(){
        frame = new JFrame();
        frame.setTitle("Tenet");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 300, 500, 500);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setIconImage(image.getImage());
        frame.setVisible(true);

        // poster = new JLabel(image);
        // poster.
        // frame.add(poster);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(50,67,385,310);
        panel.setVisible(true);
        frame.add(panel);

        title = new JLabel("Title : Tenet");
        title.setBounds(10,5, 350,50);
        panel.add(title);

        genre = new JLabel("Genre: Action");
        genre.setBounds(10,30, 200,50);
        panel.add(genre);

        rated = new JLabel("Rated: PG-13");
        rated.setBounds(10,55, 200,50);
        panel.add(rated);

        releaseDate = new JLabel("Release date: Feb 10, 2021");
        releaseDate.setBounds(10,80,200,50);
        panel.add(releaseDate);

        sinopsis = new JLabel("Sinopsis:");
        sinopsis.setBounds(10,130,200,50);
        panel.add(sinopsis);

        poster = new ImageIcon("tenet.png");
        label = new JLabel(poster);
        label.setBounds(255,20,100,150);
        panel.add(label);

        sinopsisText = new JTextArea("When a few objects that can be manipulated and used as weapons in the future fall into the wrong hands, a CIA operative, known as the Protagonist, must save the world.");
        sinopsisText.setBounds(10,180,350,100);
        sinopsisText.setLineWrap(true);
        sinopsisText.setEditable(false);
        panel.add(sinopsisText);

        back = new JButton("Back");
        back.setBounds(30,425,90,20);
        back.setFocusable(false);
        back.addActionListener(this);
        frame.add(back);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==back){
            frame.dispose();
            Subscripsi filmSubscripsiReg = new Subscripsi();
        }
    }
}

class Dunkirk implements ActionListener{
    JFrame frame;
    JPanel panel;
    JLabel genre;
    JLabel rated;
    JLabel releaseDate;
    JLabel title;
    JLabel sinopsis;
    JTextArea sinopsisText;
    JLabel label;
    JButton back;
    ImageIcon poster;
    ImageIcon image = new ImageIcon("img.png");


    Dunkirk(){
        frame = new JFrame();
        frame.setTitle("Dunkirk");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 300, 500, 500);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setIconImage(image.getImage());
        frame.setVisible(true);

        // poster = new JLabel(image);
        // poster.
        // frame.add(poster);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(50,67,385,310);
        panel.setVisible(true);
        frame.add(panel);

        title = new JLabel("Title : Dunkirk");
        title.setBounds(10,5, 350,50);
        panel.add(title);

        genre = new JLabel("Genre: War/History");
        genre.setBounds(10,30, 200,50);
        panel.add(genre);

        rated = new JLabel("Rated: PG-13");
        rated.setBounds(10,55, 200,50);
        panel.add(rated);

        releaseDate = new JLabel("Release date: July 20, 2017");
        releaseDate.setBounds(10,80,200,50);
        panel.add(releaseDate);

        sinopsis = new JLabel("Sinopsis:");
        sinopsis.setBounds(10,130,200,50);
        panel.add(sinopsis);

        poster = new ImageIcon("dunkirk.png");
        label = new JLabel(poster);
        label.setBounds(255,20,100,150);
        panel.add(label);

        sinopsisText = new JTextArea("During World War II, soldiers from the British Empire, Belgium and France try to evacuate from the town of Dunkirk during a arduous battle with German forces.");
        sinopsisText.setBounds(10,180,350,100);
        sinopsisText.setLineWrap(true);
        sinopsisText.setEditable(false);
        panel.add(sinopsisText);

        back = new JButton("Back");
        back.setBounds(30,425,90,20);
        back.setFocusable(false);
        back.addActionListener(this);
        frame.add(back);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==back){
            frame.dispose();
            Subscripsi filmSubscripsiReg = new Subscripsi();
        }
    }
}

class manOfSteel implements ActionListener{
    JFrame frame;
    JPanel panel;
    JLabel genre;
    JLabel rated;
    JLabel releaseDate;
    JLabel title;
    JLabel sinopsis;
    JTextArea sinopsisText;
    JLabel label;
    JButton back;
    ImageIcon poster;
    ImageIcon image = new ImageIcon("img.png");


    manOfSteel(){
        frame = new JFrame();
        frame.setTitle("Man Of Steel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 300, 500, 500);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setIconImage(image.getImage());
        frame.setVisible(true);

        // poster = new JLabel(image);
        // poster.
        // frame.add(poster);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(50,67,385,310);
        panel.setVisible(true);
        frame.add(panel);

        title = new JLabel("Title : Man Of Steel");
        title.setBounds(10,5, 350,50);
        panel.add(title);

        genre = new JLabel("Genre: Action/Adventure");
        genre.setBounds(10,30, 200,50);
        panel.add(genre);

        rated = new JLabel("Rated: PG-13");
        rated.setBounds(10,55, 200,50);
        panel.add(rated);

        releaseDate = new JLabel("Release date: June 13, 2013");
        releaseDate.setBounds(10,80,200,50);
        panel.add(releaseDate);

        sinopsis = new JLabel("Sinopsis:");
        sinopsis.setBounds(10,130,200,50);
        panel.add(sinopsis);

        poster = new ImageIcon("manofsteel.png");
        label = new JLabel(poster);
        label.setBounds(255,20,100,150);
        panel.add(label);

        sinopsisText = new JTextArea("Clark learns about the source of his abilities and his real home when he enters a Kryptonian ship in the Artic. However, an old enemy follows him to Earth in search of a codex and brings destruction.");
        sinopsisText.setBounds(10,180,350,100);
        sinopsisText.setLineWrap(true);
        sinopsisText.setEditable(false);
        panel.add(sinopsisText);

        back = new JButton("Back");
        back.setBounds(30,425,90,20);
        back.setFocusable(false);
        back.addActionListener(this);
        frame.add(back);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==back){
            frame.dispose();
            Subscripsi filmSubscripsiReg = new Subscripsi();
        }
    }
}

class justiceLeague implements ActionListener{
    JFrame frame;
    JPanel panel;
    JLabel genre;
    JLabel rated;
    JLabel releaseDate;
    JLabel title;
    JLabel sinopsis;
    JTextArea sinopsisText;
    JLabel label;
    JButton back;
    ImageIcon poster;
    ImageIcon image = new ImageIcon("img.png");


    justiceLeague(){
        frame = new JFrame();
        frame.setTitle("Justice League");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 300, 500, 500);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setIconImage(image.getImage());
        frame.setVisible(true);

        // poster = new JLabel(image);
        // poster.
        // frame.add(poster);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(50,67,385,310);
        panel.setVisible(true);
        frame.add(panel);

        title = new JLabel("Title : Justice League");
        title.setBounds(10,5, 350,50);
        panel.add(title);

        genre = new JLabel("Genre: Action");
        genre.setBounds(10,30, 200,50);
        panel.add(genre);

        rated = new JLabel("Rated: PG-13");
        rated.setBounds(10,55, 200,50);
        panel.add(rated);

        releaseDate = new JLabel("Release date: November 17, 2017");
        releaseDate.setBounds(10,80,200,50);
        panel.add(releaseDate);

        sinopsis = new JLabel("Sinopsis:");
        sinopsis.setBounds(10,130,200,50);
        panel.add(sinopsis);

        poster = new ImageIcon("justiceleague.png");
        label = new JLabel(poster);
        label.setBounds(255,20,100,150);
        panel.add(label);

        sinopsisText = new JTextArea("Sinopsis: Steppenwolf and his Parademons return after eons to capture Earth. However, Batman seeks the help of Wonder Woman to recruit and assemble Flash, Cyborg and Aquaman to fight the powerful new enemy.");
        sinopsisText.setBounds(10,180,350,100);
        sinopsisText.setLineWrap(true);
        sinopsisText.setEditable(false);
        panel.add(sinopsisText);

        back = new JButton("Back");
        back.setBounds(30,425,90,20);
        back.setFocusable(false);
        back.addActionListener(this);
        frame.add(back);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==back){
            frame.dispose();
            Subscripsi filmSubscripsiReg = new Subscripsi();
        }
    }
}

class Nemo implements ActionListener{
    JFrame frame;
    JPanel panel;
    JLabel genre;
    JLabel rated;
    JLabel releaseDate;
    JLabel title;
    JLabel sinopsis;
    JTextArea sinopsisText;
    JLabel label;
    JButton back;
    ImageIcon poster;
    ImageIcon image = new ImageIcon("img.png");


    Nemo(){
        frame = new JFrame();
        frame.setTitle("Finding Nemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 300, 500, 500);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setIconImage(image.getImage());
        frame.setVisible(true);

        // poster = new JLabel(image);
        // poster.
        // frame.add(poster);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(50,67,385,310);
        panel.setVisible(true);
        frame.add(panel);

        title = new JLabel("Title : Finding Nemo");
        title.setBounds(10,5, 350,50);
        panel.add(title);

        genre = new JLabel("Genre: Family/Adventure");
        genre.setBounds(10,30, 200,50);
        panel.add(genre);

        rated = new JLabel("Rated: G");
        rated.setBounds(10,55, 200,50);
        panel.add(rated);

        releaseDate = new JLabel("Release date: May 30, 2003");
        releaseDate.setBounds(10,80,200,50);
        panel.add(releaseDate);

        sinopsis = new JLabel("Sinopsis:");
        sinopsis.setBounds(10,130,200,50);
        panel.add(sinopsis);

        poster = new ImageIcon("nemo.png");
        label = new JLabel(poster);
        label.setBounds(255,20,100,150);
        panel.add(label);

        sinopsisText = new JTextArea("After his son gets abducted from the Great Barrier Reef and is dispatched to Sydney, Marlin, a meek clownfish, enlists the help of a forgetful fish and embarks on a journey to bring him home.");
        sinopsisText.setBounds(10,180,350,100);
        sinopsisText.setLineWrap(true);
        sinopsisText.setEditable(false);
        panel.add(sinopsisText);

        back = new JButton("Back");
        back.setBounds(30,425,90,20);
        back.setFocusable(false);
        back.addActionListener(this);
        frame.add(back);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==back){
            frame.dispose();
            Subscripsi filmSubscripsiReg = new Subscripsi();
        }
    }
}

class Transcendence implements ActionListener{
    JFrame frame;
    JPanel panel;
    JLabel genre;
    JLabel rated;
    JLabel releaseDate;
    JLabel title;
    JLabel sinopsis;
    JTextArea sinopsisText;
    JLabel label;
    JButton back;
    ImageIcon poster;
    ImageIcon image = new ImageIcon("img.png");


    Transcendence(){
        frame = new JFrame();
        frame.setTitle("Transcendence");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 300, 500, 500);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setIconImage(image.getImage());
        frame.setVisible(true);

        // poster = new JLabel(image);
        // poster.
        // frame.add(poster);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(50,67,385,310);
        panel.setVisible(true);
        frame.add(panel);

        title = new JLabel("Title : Transcendence");
        title.setBounds(10,5, 350,50);
        panel.add(title);

        genre = new JLabel("Genre: Sci-fi/Thriller");
        genre.setBounds(10,30, 200,50);
        panel.add(genre);

        rated = new JLabel("Rated: PG-13");
        rated.setBounds(10,55, 200,50);
        panel.add(rated);

        releaseDate = new JLabel("Release date: April 10, 2014");
        releaseDate.setBounds(10,80,200,50);
        panel.add(releaseDate);

        sinopsis = new JLabel("Sinopsis:");
        sinopsis.setBounds(10,130,200,50);
        panel.add(sinopsis);

        poster = new ImageIcon("transcendence.png");
        label = new JLabel(poster);
        label.setBounds(255,20,100,150);
        panel.add(label);

        sinopsisText = new JTextArea("Will's desperate wife uploads his consciousness into a quantum computer to save him. He soon begins making groundbreaking discoveries but also displays signs of a dark and hidden motive.");
        sinopsisText.setBounds(10,180,350,100);
        sinopsisText.setLineWrap(true);
        sinopsisText.setEditable(false);
        panel.add(sinopsisText);

        back = new JButton("Back");
        back.setBounds(30,425,90,20);
        back.setFocusable(false);
        back.addActionListener(this);
        frame.add(back);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==back){
            frame.dispose();
            Subscripsi filmSubscripsiReg = new Subscripsi();
        }
    }
}

class Transformers implements ActionListener{
    JFrame frame;
    JPanel panel;
    JLabel genre;
    JLabel rated;
    JLabel releaseDate;
    JLabel title;
    JLabel sinopsis;
    JTextArea sinopsisText;
    JLabel label;
    JButton back;
    ImageIcon poster;
    ImageIcon image = new ImageIcon("img.png");


    Transformers(){
        frame = new JFrame();
        frame.setTitle("Transformers");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 300, 500, 500);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setIconImage(image.getImage());
        frame.setVisible(true);

        // poster = new JLabel(image);
        // poster.
        // frame.add(poster);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(50,67,385,310);
        panel.setVisible(true);
        frame.add(panel);

        title = new JLabel("Title : Transformers");
        title.setBounds(10,5, 350,50);
        panel.add(title);

        genre = new JLabel("Genre: Action/Sci-fi");
        genre.setBounds(10,30, 200,50);
        panel.add(genre);

        rated = new JLabel("Rated: PG-13");
        rated.setBounds(10,55, 200,50);
        panel.add(rated);

        releaseDate = new JLabel("Release date:  June 28, 2007");
        releaseDate.setBounds(10,80,200,50);
        panel.add(releaseDate);

        sinopsis = new JLabel("Sinopsis:");
        sinopsis.setBounds(10,130,200,50);
        panel.add(sinopsis);

        poster = new ImageIcon("transformers.png");
        label = new JLabel(poster);
        label.setBounds(255,20,100,150);
        panel.add(label);

        sinopsisText = new JTextArea("The noble Autobots and Decepticons, two intergalactic races of robots, crash land on Earth. They battle for Allspark, the ultimate power source, whose location is held by Sam.");
        sinopsisText.setBounds(10,180,350,100);
        sinopsisText.setLineWrap(true);
        sinopsisText.setEditable(false);
        panel.add(sinopsisText);

        back = new JButton("Back");
        back.setBounds(30,425,90,20);
        back.setFocusable(false);
        back.addActionListener(this);
        frame.add(back);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==back){
            frame.dispose();
            Subscripsi filmSubscripsiReg = new Subscripsi();
        }
    }
}

class tropicThunder implements ActionListener{
    JFrame frame;
    JPanel panel;
    JLabel genre;
    JLabel rated;
    JLabel releaseDate;
    JLabel title;
    JLabel sinopsis;
    JTextArea sinopsisText;
    JLabel label;
    JButton back;
    ImageIcon poster;
    ImageIcon image = new ImageIcon("img.png");


    tropicThunder(){
        frame = new JFrame();
        frame.setTitle("Tropic Thunder");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 300, 500, 500);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setIconImage(image.getImage());
        frame.setVisible(true);

        // poster = new JLabel(image);
        // poster.
        // frame.add(poster);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(50,67,385,310);
        panel.setVisible(true);
        frame.add(panel);

        title = new JLabel("Title : Tropic Thunder");
        title.setBounds(10,5, 350,50);
        panel.add(title);

        genre = new JLabel("Genre: Action");
        genre.setBounds(10,30, 200,50);
        panel.add(genre);

        rated = new JLabel("Rated: R");
        rated.setBounds(10,55, 200,50);
        panel.add(rated);

        releaseDate = new JLabel("Release date: August 13, 2008");
        releaseDate.setBounds(10,80,200,50);
        panel.add(releaseDate);

        sinopsis = new JLabel("Sinopsis:");
        sinopsis.setBounds(10,130,200,50);
        panel.add(sinopsis);

        poster = new ImageIcon("tropicthunder.png");
        label = new JLabel(poster);
        label.setBounds(255,20,100,150);
        panel.add(label);

        sinopsisText = new JTextArea("A film crew shooting a big-budget war movie are forced to become the soldiers they are portraying, when they are attacked by a gang of poppy-growing local drug dealer, due to mistaken identities.");
        sinopsisText.setBounds(10,180,350,100);
        sinopsisText.setLineWrap(true);
        sinopsisText.setEditable(false);
        panel.add(sinopsisText);

        back = new JButton("Back");
        back.setBounds(30,425,90,20);
        back.setFocusable(false);
        back.addActionListener(this);
        frame.add(back);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==back){
            frame.dispose();
            Subscripsi filmSubscripsiReg = new Subscripsi();
        }
    }
}

class Trainspotting implements ActionListener{
    JFrame frame;
    JPanel panel;
    JLabel genre;
    JLabel rated;
    JLabel releaseDate;
    JLabel title;
    JLabel sinopsis;
    JTextArea sinopsisText;
    JLabel label;
    JButton back;
    ImageIcon poster;
    ImageIcon image = new ImageIcon("img.png");


    Trainspotting(){
        frame = new JFrame();
        frame.setTitle("Trainspotting");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 300, 500, 500);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setIconImage(image.getImage());
        frame.setVisible(true);

        // poster = new JLabel(image);
        // poster.
        // frame.add(poster);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(50,67,385,310);
        panel.setVisible(true);
        frame.add(panel);

        title = new JLabel("Title : Trainspotting");
        title.setBounds(10,5, 350,50);
        panel.add(title);

        genre = new JLabel("Genre: Comedy/Drama");
        genre.setBounds(10,30, 200,50);
        panel.add(genre);

        rated = new JLabel("Rated: R");
        rated.setBounds(10,55, 200,50);
        panel.add(rated);

        releaseDate = new JLabel("Release date: February 23, 1996");
        releaseDate.setBounds(10,80,200,50);
        panel.add(releaseDate);

        sinopsis = new JLabel("Sinopsis:");
        sinopsis.setBounds(10,130,200,50);
        panel.add(sinopsis);

        poster = new ImageIcon("trainspotting.png");
        label = new JLabel(poster);
        label.setBounds(255,20,100,150);
        panel.add(label);

        sinopsisText = new JTextArea("Renton is a drug addict who tries to mend his ways by moving to London and starting life afresh. He, however, is pulled back into the world of addiction by his friends.");
        sinopsisText.setBounds(10,180,350,100);
        sinopsisText.setLineWrap(true);
        sinopsisText.setEditable(false);
        panel.add(sinopsisText);

        back = new JButton("Back");
        back.setBounds(30,425,90,20);
        back.setFocusable(false);
        back.addActionListener(this);
        frame.add(back);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==back){
            frame.dispose();
            Subscripsi filmSubscripsiReg = new Subscripsi();
        }
    }
}

class theMandalorian implements ActionListener{
    JFrame frame;
    JPanel panel;
    JLabel genre;
    JLabel rated;
    JLabel releaseDate;
    JLabel title;
    JLabel sinopsis;
    JTextArea sinopsisText;
    JLabel label;
    JButton back;
    ImageIcon poster;
    ImageIcon image = new ImageIcon("img.png");


    theMandalorian(){
        frame = new JFrame();
        frame.setTitle("The Mandalorian");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 300, 500, 500);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setIconImage(image.getImage());
        frame.setVisible(true);

        // poster = new JLabel(image);
        // poster.
        // frame.add(poster);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(50,67,385,310);
        panel.setVisible(true);
        frame.add(panel);

        title = new JLabel("Title : The Mandalorian");
        title.setBounds(10,5, 350,50);
        panel.add(title);

        genre = new JLabel("Genre: Action/Adventure");
        genre.setBounds(10,30, 200,50);
        panel.add(genre);

        rated = new JLabel("Rated: TV-14");
        rated.setBounds(10,55, 200,50);
        panel.add(rated);

        releaseDate = new JLabel("Release date:  November 12, 2019");
        releaseDate.setBounds(10,80,200,50);
        panel.add(releaseDate);

        sinopsis = new JLabel("Sinopsis:");
        sinopsis.setBounds(10,130,200,50);
        panel.add(sinopsis);

        poster = new ImageIcon("themandalorian.png");
        label = new JLabel(poster);
        label.setBounds(255,20,100,150);
        panel.add(label);

        sinopsisText = new JTextArea("Beginning five years after the events of Return of the Jedi (1983) and the fall of the Galactic Empire,[ The Mandalorian follows Din Djarin, a lone Mandalorian bounty hunter in the outer reaches of the galaxy.");
        sinopsisText.setBounds(10,180,350,100);
        sinopsisText.setLineWrap(true);
        sinopsisText.setEditable(false);
        panel.add(sinopsisText);

        back = new JButton("Back");
        back.setBounds(30,425,90,20);
        back.setFocusable(false);
        back.addActionListener(this);
        frame.add(back);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==back){
            frame.dispose();
            Subscripsi filmSubscripsiReg = new Subscripsi();
        }
    }
}

class Openheimer implements ActionListener{
    JFrame frame;
    JPanel panel;
    JLabel genre;
    JLabel rated;
    JLabel releaseDate;
    JLabel title;
    JLabel sinopsis;
    JTextArea sinopsisText;
    JLabel label;
    JButton back;
    ImageIcon poster;
    ImageIcon image = new ImageIcon("img.png");


    Openheimer(){
        frame = new JFrame();
        frame.setTitle("Openheimer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 300, 500, 500);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setIconImage(image.getImage());
        frame.setVisible(true);

        // poster = new JLabel(image);
        // poster.
        // frame.add(poster);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(50,67,385,310);
        panel.setVisible(true);
        frame.add(panel);

        title = new JLabel("Title : Openheimer");
        title.setBounds(10,5, 350,50);
        panel.add(title);

        genre = new JLabel("Genre: Drama/War");
        genre.setBounds(10,30, 200,50);
        panel.add(genre);

        rated = new JLabel("Rated: PG-13");
        rated.setBounds(10,55, 200,50);
        panel.add(rated);

        releaseDate = new JLabel("Release date: July 21, 2023");
        releaseDate.setBounds(10,80,200,50);
        panel.add(releaseDate);

        sinopsis = new JLabel("Sinopsis:");
        sinopsis.setBounds(10,130,200,50);
        panel.add(sinopsis);

        poster = new ImageIcon("openheimer.png");
        label = new JLabel(poster);
        label.setBounds(255,20,100,150);
        panel.add(label);

        sinopsisText = new JTextArea(" Physicist J Robert Oppenheimer works with a team of scientists during the Manhattan Project, leading to the development of the atomic bomb.");
        sinopsisText.setBounds(10,180,350,100);
        sinopsisText.setLineWrap(true);
        sinopsisText.setEditable(false);
        panel.add(sinopsisText);

        back = new JButton("Back");
        back.setBounds(30,425,90,20);
        back.setFocusable(false);
        back.addActionListener(this);
        frame.add(back);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==back){
            frame.dispose();
            Subscripsi filmSubscripsiReg = new Subscripsi();
        }
    }
}

class CODA implements ActionListener{
    JFrame frame;
    JPanel panel;
    JLabel genre;
    JLabel rated;
    JLabel releaseDate;
    JLabel title;
    JLabel sinopsis;
    JTextArea sinopsisText;
    JLabel label;
    JButton back;
    ImageIcon poster;
    ImageIcon image = new ImageIcon("img.png");


    CODA(){
        frame = new JFrame();
        frame.setTitle("CODA");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 300, 500, 500);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setIconImage(image.getImage());
        frame.setVisible(true);

        // poster = new JLabel(image);
        // poster.
        // frame.add(poster);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(50,67,385,310);
        panel.setVisible(true);
        frame.add(panel);

        title = new JLabel("Title : CODA");
        title.setBounds(10,5, 350,50);
        panel.add(title);

        genre = new JLabel("Genre: Drama");
        genre.setBounds(10,30, 200,50);
        panel.add(genre);

        rated = new JLabel("Rated: PG-13");
        rated.setBounds(10,55, 200,50);
        panel.add(rated);

        releaseDate = new JLabel("Release date: Aug 13, 2021");
        releaseDate.setBounds(10,80,200,50);
        panel.add(releaseDate);

        sinopsis = new JLabel("Sinopsis:");
        sinopsis.setBounds(10,130,200,50);
        panel.add(sinopsis);

        poster = new ImageIcon("coda.png");
        label = new JLabel(poster);
        label.setBounds(255,20,100,150);
        panel.add(label);

        sinopsisText = new JTextArea("SinopsisRuby is the only hearing member of a deaf family from Gloucester, Massachusetts. At 17, she works mornings before school to help her parents and brother keep their fishing business afloat. But in joining her high school's choir club, Ruby finds herself drawn to both her duet partner and her latent passion for singing.");
        sinopsisText.setBounds(10,180,350,100);
        sinopsisText.setLineWrap(true);
        sinopsisText.setEditable(false);
        panel.add(sinopsisText);

        back = new JButton("Back");
        back.setBounds(30,425,90,20);
        back.setFocusable(false);
        back.addActionListener(this);
        frame.add(back);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==back){
            frame.dispose();
            Subscripsi filmSubscripsiReg = new Subscripsi();
        }
    }
}
