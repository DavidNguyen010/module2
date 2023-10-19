package com.fan;

import java.awt.*;

public class Fan {
    public final int SLOW=1;
    public final int MEDIUM=2;
    public final int HIGHT=3;
    private int speed ;
    private boolean isOn = false;
    private double radius ;
    private String color = "Color.blue";

    public Fan(int speed, boolean isOn,double radius,String color) {
        this.speed = speed;
        this.isOn = isOn;
        this.radius = radius;
        this.color = color;
    }


    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return isOn;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "SLOW=" + SLOW +
                ", MEDIUM=" + MEDIUM +
                ", HIGHT=" + HIGHT +
                ", speed=" + speed +
                ", isOn=" + isOn +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
