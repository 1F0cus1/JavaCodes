package com.cyf.method;

import java.util.Scanner;

public class MethodDemo1 {
    public static void main(String[] args) {
        System.out.println("开始");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int Max = getMax(a,b);
        System.out.println("最大值是"+Max);
    }

    public static int getMax(int num1,int num2) {

        int max = num1 > num2 ? num1 : num2;
        return max;
    }
}