package com.company.lab2;

public class Ball {
    private String color;
    private String type;
    private int speed;

    public void hitBall(String force) {
        switch (force) {
            case "little":
                speed = speed + 10;
                break;
            case "medium":
                speed = speed + 50;
                break;
            case "strong":
                speed = speed + 100;
                break;
            default:
                System.out.println("Укажите силу удара");
        }
    }

    public Ball(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", speed=" + speed +
                '}';
    }
}
