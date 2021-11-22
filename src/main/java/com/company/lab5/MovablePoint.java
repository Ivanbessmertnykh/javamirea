package com.company.lab5;

public class MovablePoint implements Movable {

    public int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void slideUp() {
        y -= ySpeed;
    }

    @Override
    public void slideDown() {
        y += ySpeed;
    }

    @Override
    public void slideLeft() {
        x -= xSpeed;
    }

    @Override
    public void slideRight() {
        x += xSpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
