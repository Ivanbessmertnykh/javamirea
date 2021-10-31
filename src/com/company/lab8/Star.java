package com.company.lab8;

import java.awt.*;
import java.awt.geom.GeneralPath;
import java.util.Random;

public class Star extends Shape{
    public Star(int x, int y, Color color) {
        super(x, y, color);
    }

    public void draw(Graphics g) {
        int xPoints[] = {9, 15, 0, 18, 3};
        int yPoints[] = {0, 18, 6, 6, 18};

        Graphics2D g2d = (Graphics2D) g;
        GeneralPath star = new GeneralPath();

        star.moveTo(xPoints[0] + x, yPoints[0] + y);
        for (int i = 1; i < xPoints.length; i++) {
            star.lineTo(xPoints[i] + x, yPoints[i] + y);
        }
        star.closePath();

        g2d.setColor(color);
        g2d.fill(star);
    }
}
