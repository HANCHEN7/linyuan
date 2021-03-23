package com.atguigu.homework;

public class Test02 {
    public static void main(String[] args) {
        MyData r1 = new MyData();
        r1.year = 1999;
        r1.month = 10;
        r1.day = 13;
        System.out.println(r1.year+"."+r1.month+"."+r1.day);
        MyData r2 = new MyData();
        r2.year = 2020;
        r2.month = 11;
        r2.day = 27;
        System.out.println(r2.year+"."+r2.month+"."+r2.day);
        MyData r3 = new MyData();
        r3.year = 2021;
        r3.month = 6;
        r3.day = 27;
        System.out.println(r3.year+"."+r3.month+"."+r3.day);
    }
}
