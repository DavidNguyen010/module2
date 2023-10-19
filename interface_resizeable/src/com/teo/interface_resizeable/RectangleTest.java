package com.teo.interface_resizeable;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rec1 = new Rectangle();
        System.out.print("Nhap vao chieu rong tinh hinh Cn \t");
        rec1.setWidth(scanner.nextDouble());
        System.out.print("Nhap vao chieu cao hinh Cn \t");
        rec1.setHeight(scanner.nextFloat());
        System.out.print("Nhap vao percent can resize \t");
        rec1.setPercent(scanner.nextFloat());
        System.out.println("Dien tich la : " + rec1.area());
        System.out.println("Dien tich sau khi resize  "
                + rec1.getPercent() +" %" + " la : " + rec1.resize() );
    }
}
