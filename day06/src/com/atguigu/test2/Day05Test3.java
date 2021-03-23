package com.atguigu.test2;

import java.util.Scanner;

public class Day05Test3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你班共有几组：");
        int i = sc.nextInt();
        int [][] iArr = new int[i][];
        for (int j = 0; j < i; j++) {
            System.out.print("请输入第"+(j+1)+"组共有几名同学：");
            iArr[j] = new int[sc.nextInt()];
        }
        double [] s = new double[iArr.length];
        for (int j = 0; j < iArr.length; j++) {
            int sum = 0;
            for (int k = 0; k < iArr[j].length; k++) {
                System.out.print("请输入第"+(j+1)+"组第"+(k+1)+"名同学的成绩：");
                int i1 = sc.nextInt();
                iArr[j][k] = i1;
                sum += i1;
            }
            s[j] = sum/iArr[j].length;
        }
        int [][] m = new int[iArr.length][2];
        for (int j = 0; j < iArr.length; j++) {
            m[j][0] = iArr[j][0];
            m[j][1] = iArr[j][0];
            for (int ele:iArr[j]){
                if (m[j][0]<ele){
                    m[j][0] = ele;
                }
                if (m[j][1]>ele){
                    m[j][1] = ele;
                }
            }
        }
        for(int j = 0; j <iArr.length; j++){
            System.out.print("第"+(j+1)+"组成绩：");
            for(int k = 0; k<iArr[j].length; k++){
                System.out.print(iArr[j][k] + "\t");
            }
            System.out.println();
        }
        for (int j = 0;j < m.length;j++){
            System.out.print("第"+(j+1)+"组的最高分和最低分分别为：");
            for (int ele:m[j]){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        for (int j = 0; j < s.length; j++) {
            System.out.println("第"+(j+1)+"组的平均分为："+s[j]);
        }
        int max = iArr[0][0];
        int min = iArr[0][0];
        double sum = 0;
        int count = 0;
        for (int[] ele:iArr){
            for (int e:ele){
                if (max<e){
                    max = e;
                }
                if (min>e){
                    min = e;
                }
                sum += e;
                count++;
            }
        }
        System.out.println("班级最高分："+max+", 最低分："+min+", 平均分为："+(sum/count)+", 班级总人数："+count);
    }
}
