package com.company.lab8;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Rectangle extends Shape{
    public Rectangle(int x, int y, Color color) {
        super(x, y, color);
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Rectangle2D.Double circle = new Rectangle2D.Double(x, y, 20, 20);

        g2d.setColor(color);
        g2d.fill(circle);
    }
}
