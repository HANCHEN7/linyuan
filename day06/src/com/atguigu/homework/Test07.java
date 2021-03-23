package com.atguigu.homework;

public class Test07 {
    public static void main(String[] args) {
        MyArrays m = new MyArrays();
        int [] arr = new int[]{1,2,3,6,4,5,7,9,8};
        m.sort(arr);
        System.out.println("m.indexOf(arr,7) = " + m.indexOf(arr, 7));
        for (int ele : m.copy(arr, 7)) {
            System.out.print(ele+" ");
        }
    }
}
