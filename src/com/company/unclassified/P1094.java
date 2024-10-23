package com.company.unclassified;

import java.util.Scanner;

public class P1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = 64;

        int answer = 0;

        while(y>=1){
            if(x>=y){
                answer += 1;
                x -= y;
            }
            y /= 2;
        }


        System.out.println(answer);

    }
}
