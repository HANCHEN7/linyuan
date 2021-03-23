package com.atguigu.homework;

public class MathTools {
    public int add(int a, int b){
        return (a+b);
    }
    public int subtract(int a,int b){
        return (a-b);
    }
    public int mutiply(int a, int b){
        return (a*b);
    }
    public int divide(int a, int b){
        return (a/b);
    }
    public int remainder(int a, int b){
        return (a%b);
    }
    public int max(int a, int b){
        return (a>b?a:b);
    }
    public int min(int a, int b){
        return (a<b?a:b);
    }
    public boolean equals(int a, int b){
        return (a==b);
    }
    public boolean isEven(int a){
        return (a % 2 == 0);
    }
    public boolean isPrimeNumer(int a){
        if (a <= 1){
            return false;
        }
        for (int i = 1; i < a; i++) {
            if (a%i==0){
                return false;
            }
        }
        return true;
    }
    public int round(double d){
        int i = (int)((d*10)%10);
        if(i<5){
            return (int)d;
        }else {
            return (int)++d;
        }
    }
}
