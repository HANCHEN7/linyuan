package com.atguigu.homework;

public class Test05 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.a = 3;
        t.b = 3;
        t.c = 3;
        System.out.println("是否是一个直角三角形:" + t.isRightTriangle(t.a, t.b, t.c));
        System.out.println("是否是一个等腰三角形:" + t.isIsoscelesTriangle(t.a, t.b, t.c));
        System.out.println("是否是一个等边三角形:" + t.isEquilateralTriangle(t.a, t.b, t.c));
        System.out.println("面积为:" + t.getArea(t.a, t.b, t.c));
        System.out.println("周长为:" + t.getLength(t.a, t.b, t.c));
    }
}
