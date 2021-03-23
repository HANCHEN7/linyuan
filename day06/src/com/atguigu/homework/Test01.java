package com.atguigu.homework;

public class Test01 {

    public static void main(String[] args) {
        Employee user1 = new Employee();
        user1.no = 1;
        user1.name = "习枫";
        user1.age = 20;
        user1.many = 99999;
        System.out.println("员工编号："+user1.no+", 姓名："+user1.name+", 年龄："+user1.age+", 薪资："+user1.many);

        Employee user2 = new Employee();
        user2.no = 2;
        user2.name = "临渊";
        user2.age = 21;
        user2.many = 199999;
        System.out.println("员工编号："+user2.no+", 姓名："+user2.name+", 年龄："+user2.age+", 薪资："+user2.many);
    }
}
