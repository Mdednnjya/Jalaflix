package HomeJalaFlix;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class History implements ActionListener {
    JFrame frame;
    JPanel panel;
    JLabel label;
    JLabel empty;
    JButton back;
    JButton clear;
    JButton remove;
    JTextArea list;
    JButton showHistory;
    ImageIcon image = new ImageIcon("img.png");
    static ArrayList<String> history = new ArrayList<>();
    History(){
        frame = new JFrame("History");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Profile Page");
        frame.setBounds(500,300,500,550);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setVisible(true);
        frame.setIconImage(image.getImage());

        label = new JLabel("History");
        label.setBounds(185,20,150,150);
        label.setFont(new Font("Arial", Font.PLAIN, 40));
        label.setForeground(Color.WHITE);
        label.setVisible(true);
        frame.add(label);

        empty = new JLabel("");
        empty.setBounds(220,400,150,20);
        empty.setForeground(Color.RED);
        frame.add(empty);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(50,152,385,300);
        panel.setVisible(true);
        frame.add(panel);

        back = new JButton("Back");
        back.setBounds(20,480,90,20);
        back.setFocusable(false);
        back.addActionListener(this);
        frame.add(back);

        showHistory = new JButton("Show");
        showHistory.setBounds(170, 271,90,20);
        showHistory.setFocusable(false);
        showHistory.addActionListener(this);
        panel.add(showHistory);

        clear = new JButton("Clear");
        clear.setBounds(270, 271,90,20);
        clear.setFocusable(false);
        clear.addActionListener(this);
        panel.add(clear);

        remove = new JButton("Remove");
        remove.setBounds(374, 480,90,20);
        remove.setFocusable(false);
        remove.addActionListener(this);
        frame.add(remove);

        list = new JTextArea();
        list.setBounds(10,10,150,280);
        list.setEditable(false);
        list.setLineWrap(true);
        panel.add(list);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource()==back){
            frame.dispose();
            Home home = new Home();
        }
        if (e.getSource()==showHistory){
            if (!history.isEmpty()){
                list.setText("");
                for(int i = 0; i<history.size();i++){
                    list.append(history.get(i) + "\n");
                }
            }else{
                empty.setText("History Masih Kosong");
            }
        }else if (e.getSource()==clear){
            String del = "";
            list.setText(del);
        }else if (e.getSource()==remove){
            history.remove(0);
            String del = "";
            list.setText(del);
        }
    }
}
