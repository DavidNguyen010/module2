package com.teojsc.triangle;

public class Triangle extends Shape{
    public Triangle(double side1, double side2, double side3) {
        super(side1, side2, side3);
    }

    public Triangle() {

    }
    //    Bước 1: Gọi a, b, c lần lượt là độ dài ba cạnh của tam giác
    //    Bước 2: Tính nửa chu vi tam giác bằng cách sử dụng công thức P = (a + b + c)/2
    //    Bước 3: Tính diện tích tam giác bằng cách sử dụng công thức S = √(P(P-a)(P-b)(P-c))

    public double getPerimeter(){
        return (getSide1()+getSide2() +getSide3());
    }
    private double getHalfPerimeter(){
        return getPerimeter()/2;
    }
    public double getArea(){
        return Math.sqrt(
                getHalfPerimeter()*
                        (getPerimeter() -getSide1())*
                        (getHalfPerimeter()-getSide2())*
                        (getHalfPerimeter()-getSide3())
        );
    }
}
