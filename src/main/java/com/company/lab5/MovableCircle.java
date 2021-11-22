package com.company.lab5;

import com.company.lab5.MovablePoint;

public class MovableCircle implements Movable {

    private MovablePoint center;
    private int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void slideUp() {
        center.y -= center.ySpeed;
    }

    @Override
    public void slideDown() {
        center.y += center.ySpeed;
    }

    @Override
    public void slideLeft() {
        center.x -= center.xSpeed;
    }

    @Override
    public void slideRight() {
        center.x += center.xSpeed;
    }
}
