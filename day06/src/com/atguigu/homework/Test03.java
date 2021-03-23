package com.atguigu.homework;

public class Test03 {

    public static void main(String[] args) {
        Citizen c1 = new Citizen();
        MyData r1 = new MyData();
        c1.name = "临渊";
        r1.year = 1111;
        r1.month = 11;
        r1.day = 11;
        c1.birthday = r1;
        c1.id = "111111111111111111";
        System.out.println("姓名："+c1.name+",生日:"+c1.birthday.year+"."+c1.birthday.month+"."+c1.birthday.day+"身份证号："+c1.id);

        Citizen c2 = new Citizen();
        MyData r2 = new MyData();
        c2.name = "羡鱼";
        r2.year = 1112;
        r2.month = 12;
        r2.day = 12;
        c2.birthday = r2;
        c2.id = "111111111212121111";
        System.out.println("姓名："+c2.name+",生日:"+c2.birthday.year+"."+c2.birthday.month+"."+c2.birthday.day+"身份证号："+c2.id);
    }
}
