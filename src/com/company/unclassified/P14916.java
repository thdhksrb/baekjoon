package com.company.unclassified;

import java.io.*;
import java.util.*;

public class P14916 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = 0; // 2원짜리 개수
        int b = 0; // 5원짜리 개수
        int answer = 0;
        b = n/5;

        if(n==1 || n==3){
            answer = -1;
        }
        else if((n-b*5)%2==0){
            a = (n-b*5)/2;
            answer = a+b;
        }else{
            b--;
            a = (n-b*5)/2;
            answer = a+b;
        }

        System.out.println(answer);



    }
}
