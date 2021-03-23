package com.atguigu.test2;

public class Test {
    public static void main(String[] args) {
        System.out.println("欢迎临渊");
       l: for (int i = 2; i < 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j==0){
                    continue l;
                }
            }
           System.out.println(i);
        }

    }
}
