package com.atguigu.homework;

public class Triangle {
    double a;
    double b;
    double c;
    public boolean  isRightTriangle(double a,double b,double c){
        return (a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b);
    }
    public boolean isIsoscelesTriangle(double a,double b,double c){
        return a == b || b == c || c == a;
    }
    public boolean  isEquilateralTriangle(double a,double b,double c){
        return a == b && b == c && c == a;
    }
    public double  getArea(double a,double b,double c){
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public double  getLength(double a,double b,double c){
        return (a + b + c);
    }

}
