package com.teo.interface_resizeable;

import java.util.Scanner;

public class Circle_test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle cr1 = new Circle();
        System.out.print("Nhap vao radius tinh hinh tron \t");
        cr1.setRadius(scanner.nextDouble()) ;
        System.out.print("Nhap vao percent can resize \t");
        cr1.setPercent(scanner.nextFloat());
        System.out.println("Dien tich la : " + cr1.area());
        System.out.println("Dien tich sau khi resize  "
                + cr1.getPercent() +" %" + " la : " + cr1.resize() );
    }
}
