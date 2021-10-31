package com.company.lab8;

import com.company.lab4.Square;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class Circle extends Shape{

    public Circle(int x, int y, Color color) {
        super(x, y, color);
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D.Double circle = new Ellipse2D.Double(x, y, 10, 10);

        g2d.setColor(color);
        g2d.fill(circle);
    }
}
