package com.teo.interface_resizeable;

public class Square extends Rectangle implements interface_resizealbe {
    @Override
    public double resize() {
        return area()*Math.random()*percent()/100;
    }
    public double area(){
        return getWidth()*getHeight();
    }

    public Square() {
    }
}
