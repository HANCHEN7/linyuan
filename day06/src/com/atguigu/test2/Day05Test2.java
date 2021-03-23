package com.atguigu.test2;

public class Day05Test2 {
    public static void main(String[] args) {
        String [][] sArr = new String[2][];
        sArr[0] = new String[]{"黑桃","红桃","梅花","方片"};
        sArr[1] = new String[]{"A","1","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < sArr[1].length; j++) {
                System.out.print(sArr[0][i]+sArr[1][j]+"\t");
            }
            System.out.println();
        }
    }
}
