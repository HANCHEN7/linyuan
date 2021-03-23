package com.atguigu.test2;

public class Day05Test1 {
    public static void main(String[] args) {
        int [][] yanghui = new int[10][];
        for (int i = 0; i < yanghui.length; i++) {
             yanghui[i] = new int[i+1];
             yanghui[i][0] = 1;
             yanghui[i][i] = 1;
            for (int j = 1; j < yanghui[i].length-1; j++) {
                yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
            }
        }
        for (int[] ele:yanghui){
            for (int e:ele){
                System.out.print(e+"\t");
            }
            System.out.println();
        }
    }
}



