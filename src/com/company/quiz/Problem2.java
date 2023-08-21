package com.company.quiz;

import java.io.*;
import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        long sum = 2;

        long fibo[] = new long[4000000];

        fibo[0] = 1;
        fibo[1] = 2;

        for(int i=2;;i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
            if(fibo[i]>4000000){
                break;
            }
            if(fibo[i]%2==0){
                sum += fibo[i];
            }

        }
        System.out.println(sum);



    }
}
