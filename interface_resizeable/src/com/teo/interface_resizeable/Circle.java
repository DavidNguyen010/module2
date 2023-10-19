package com.teo.interface_resizeable;

public class Circle implements interface_resizealbe{
    public final double PI = 3.14;
    private double radius ;
    private float percent;

    public float getPercent() {
        return percent;
    }

    public void setPercent(float percent) {
        this.percent = percent;
    }

    @Override
    public double resize() {
        return area()*percent()/100;
    }

    @Override
    public double area() {
        return Math.pow(radius,2)*PI;
    }
    public double percent(){
        return getPercent();
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
