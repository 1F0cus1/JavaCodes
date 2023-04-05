package com.cyf.method;

import java.util.Scanner;

public class MethodDemo1 {
    public static void main(String[] args) {
        getMax();
    }

    public static void getMax() {
        int num1 = 10;
        int num2 = 20;
        int max = num1 > num2 ? num1 : num2;
        System.out.println(max);
    }
}
