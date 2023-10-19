package com.teojsc.triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        Triangle defaultTriangle  = new Triangle();
        Triangle inputTriangle = new Triangle(side1,side2,side3);

        System.out.println("default triangle: " + defaultTriangle.toString());
        System.out.println("Area of default triangle: " + defaultTriangle.getArea());
        System.out.println("Perimeter of default triangle: " + defaultTriangle.getPerimeter());
        System.out.println("_____________________________________");
        System.out.println("default triangle: " + inputTriangle.toString());
        System.out.println("Area of input triangle: " + inputTriangle.getArea());
        System.out.println("Perimeter of input triangle: " + inputTriangle.getPerimeter());
    }
}
