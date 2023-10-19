package com.teo.interface_resizeable;

public class Rectangle extends Circle implements interface_resizealbe{
    private double width;
    private double height;


    @Override
    public double resize() {
        return  area()*percent()/100;
    }
    public double area(){
        return this.width*this.height;
    }

    public double getWidth() {
        return width;
    }
    public double percent(){
        return getPercent();
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
