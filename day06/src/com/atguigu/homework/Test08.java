package com.atguigu.homework;

public class Test08 {
    public static void main(String[] args) {
        DateCommonsTools d = new DateCommonsTools();
        System.out.println("d.getWeekName(7) = " + d.getWeekName(7));
        System.out.println("d.getMonthName(11) = " + d.getMonthName(11));
        System.out.println("d.getTotalDaysOfMonth(2020,12) = " + d.getTotalDaysOfMonth(2020, 12));
        System.out.println("d.getTotalDaysOfYear(2020) = " + d.getTotalDaysOfYear(2020));
        System.out.println("d.isLeapYear(2020) = " + d.isLeapYear(2020));
    }
}
