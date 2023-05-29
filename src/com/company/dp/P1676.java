package com.company.dp;

import java.util.Scanner;

public class P1676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int answer = 0;

        int a = N/5;
        int b = N/25;
        int c = N/125;

        answer = a + b + c;


        System.out.println(answer);
    }
}
