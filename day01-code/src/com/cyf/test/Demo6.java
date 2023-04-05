package com.cyf.test;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个数");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int tempMax = num1 > num2 ? num1 : num2;
        int max = tempMax > num3 ? tempMax :num3;
        System.out.println("最大的数是:"+max);
    }
}
