package com.company.greedy;

import java.util.Scanner;

public class P1789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long S = sc.nextLong();
        long num = 1;
        long count = 0;
        while(true){
            count++;
            if((S-num)<=num){
                break;
            }
            S -= num;
            num++;

        }

        System.out.println(count);
    }
}
