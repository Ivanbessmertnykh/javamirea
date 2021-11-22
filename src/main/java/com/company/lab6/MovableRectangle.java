package com.company.lab6;

import com.company.lab5.Movable;
import com.company.lab5.MovablePoint;

public class MovableRectangle implements Movable {

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    private boolean hasPointsSameSpeed() {
        return (topLeft.xSpeed == bottomRight.xSpeed)
                && (topLeft.ySpeed == bottomRight.ySpeed);
    }

    @Override
    public void slideUp() {
        if ( ! hasPointsSameSpeed()) {
            return;
        }
        topLeft.y     -= topLeft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    }

    @Override
    public void slideDown() {
        if ( ! hasPointsSameSpeed()) {
            return;
        }
        topLeft.y     += topLeft.ySpeed;
        bottomRight.y += bottomRight.ySpeed;
    }

    @Override
    public void slideLeft() {
        if ( ! hasPointsSameSpeed()) {
            return;
        }
        topLeft.x     -= topLeft.xSpeed;
        bottomRight.x -= bottomRight.xSpeed;
    }

    @Override
    public void slideRight() {
        if ( ! hasPointsSameSpeed()) {
            return;
        }
        topLeft.x     += topLeft.xSpeed;
        bottomRight.x += bottomRight.xSpeed;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

}
