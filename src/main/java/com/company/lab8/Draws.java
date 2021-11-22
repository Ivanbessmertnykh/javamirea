package com.company.lab8;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Draws extends JPanel {

    public Draws() {
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(400, 400));

        Random random = new Random();

        for (int j = 0; j < 20; j++) {
            int choose = random.nextInt(10);
            if (choose == 0) {
                addCircle(390, 390);
            } else if(choose == 1){
                addStar(380, 380);

            }else {
                addRectangle(380, 380);
            }
        }

    }

    private List shapes = new ArrayList<>();
    private Random random = new Random();

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.add(new Draws());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Object s : shapes) {
            if (s instanceof Circle) {
                ((Circle) s).draw(g);
            } else if (s instanceof Star) {
                ((Star) s).draw(g);
            }
            else if (s instanceof Rectangle) {
                ((Rectangle) s).draw(g);
            }
        }
    }

    public void addCircle(int maxX, int maxY) {
        Random random = new Random();
        Color color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
        shapes.add(new Circle(random.nextInt(maxX), random.nextInt(maxY), color));
        repaint();
    }

    public void addStar(int maxX, int maxY) {
        Random random = new Random();
        Color color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
        shapes.add(new Star(random.nextInt(maxX), random.nextInt(maxY), color));
        repaint();
    }

    public void addRectangle(int maxX, int maxY) {
        Random random = new Random();
        Color color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
        shapes.add(new Rectangle(random.nextInt(maxX), random.nextInt(maxY), color));
        repaint();
    }

}
