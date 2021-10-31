package com.company.lab8;

import javax.swing.*;
import java.awt.*;

public class WindowsWithPic extends JPanel {
    static Image img;

    public static void main(String[] args){
//        img = new ImageIcon("src/com/company/lab8/java.png").getImage();
        img = new ImageIcon(args[0]).getImage();
        JFrame fr = new JFrame();
        fr.setLayout(null);
        fr.setSize(1500,1000);

        WindowsWithPic m = new WindowsWithPic();
        m.setBounds(0,0,1500,1000);
        fr.add(m);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }

    public void paintComponent(Graphics g){
        g.drawImage(img, 0, 0, null);
    }
}
