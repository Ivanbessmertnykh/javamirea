package com.company.lab8;

import javax.swing.*;

public class Animation extends JFrame {

    private JLabel imgLabel;
    private int imgNum = 1;

    private Animation() {
        this.setSize(1200, 1200);
        imgLabel = new JLabel("", new ImageIcon("src/com/company/lab8/1.jpeg"), SwingConstants.CENTER);

        getContentPane().add(imgLabel);

        Timer timer = new Timer(2000, e -> nextImg());
        timer.start();
    }
    private void nextImg(){
        imgLabel.setIcon( new ImageIcon("src/com/company/lab8/"+ ++imgNum +".jpeg"));
        if(imgNum == 3) imgNum = 0;

    }

    public static void main(String[] args)  {
        Animation mf = new Animation();
        mf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mf.setVisible(true);

    }
}