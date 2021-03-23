package com.atguigu.homework;

public class MyArrays {
    public void sort(int[] arr){
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public int indexOf(int[] arr, int value){
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (value==arr[i])
                index = i;
        }
        return index;
    }
    public int[] copy(int[] arr, int len){
        int [] newarr = new int[len];
        for (int i = 0; i < newarr.length; i++) {
            newarr[i] = arr[i];
        }
        return newarr;
    }
}
