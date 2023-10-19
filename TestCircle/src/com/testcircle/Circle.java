package com.testcircle;

public class Circle {
    public final double PI = 3.14;
    private double radius = 1.0;
    private String color = "baby_red";

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return this.radius * PI *2;
    }
}
