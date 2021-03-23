package com.atguigu.homework;

public class Test06 {
    public static void main(String[] args) {
        MathTools m =new MathTools();
        System.out.println("m.add(3,7) = " + m.add(3, 7));
        System.out.println("m.subtract(3,7) = " + m.subtract(3, 7));
        System.out.println("m.mutiply(3,7) = " + m.mutiply(3, 7));
        System.out.println("m.divide(3,7) = " + m.divide(3, 7));
        System.out.println("m.remainder(3,7) = " + m.remainder(3, 7));
        System.out.println("m.max(3,7) = " + m.max(3, 7));
        System.out.println("m.min(3,7) = " + m.min(3, 7));
        System.out.println("m.equals(3,7) = " + m.equals(3, 7));
        System.out.println("m.isEven(3) = " + m.isEven(3));
        System.out.println("m.isPrimeNumer(3) = " + m.isPrimeNumer(3));
        System.out.println("m.round(3.5) = " + m.round(3.5));
    }
}
