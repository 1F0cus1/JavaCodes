package com.cyf.test;

import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int age = sc.nextInt();
        int b = age / 100;
        int s = (age / 10) % 10;
        int g = (age % 100) % 10;

        System.out.println(b);
        System.out.println(s);
        System.out.println(g);
//        System.out.println("请输入身高：");
//        double height = sc.nextDouble();
//
//        System.out.println("请输入性别：");
//        String gender = sc.next();
//
//        System.out.println("请输入婚姻状况：");
//        boolean flag = sc.nextBoolean();
//
//        System.out.println(age);
//        System.out.println(height);
//        System.out.println(gender);
//        System.out.println(flag);
    }
}
