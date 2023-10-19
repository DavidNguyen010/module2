package com.fan;

import java.awt.*;

public class  Main {
    public static void main(String[] args) {
        Fan f1 = new Fan(1,true,5.2, "Color.red");
        Fan f2 = new Fan(3,false,6.0,"pink");

        System.out.println(f1.toString());
        System.out.println(f2.toString());

    }
}
