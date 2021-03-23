package com.atguigu.homework;

public class Test04 {
    public static void main(String[] args) {
        MyData m = new MyData();
        m.year = 2020;
        m.month = 12;
        m.day = 9;
        m.set(2021,12,9);
        System.out.println(m.year + "年" + m.month + "月" + m.day + "日");
        System.out.println("是闰年吗？" + m.isLeapYear(m.year));
        m.puls(2,2,2);
        System.out.println("再加2年2个月2天之后的日期是：");
        System.out.println(m.year + "年" + m.month + "月" + m.day + "日");
    }
}
