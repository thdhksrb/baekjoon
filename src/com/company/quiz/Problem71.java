package com.company.quiz;

import java.util.*;

public class Problem71 {

    public static int GCD(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {

        int up = 0;   //분자
        int down = 1; //분모

        for (int d = 2; d <= 1000000; d++) { //새로운 분모 순환
            int n = (3 * d - 1) / 7; //가장 비슷한 분자
            if (GCD(n, d) == 1 && n * down > up * d) {
                up = n;   //분자
                down = d; //분모
            }
        }

        System.out.println(up);


    }
}
