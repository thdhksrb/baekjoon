package com.company.quiz;

import java.io.*;
import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        long num = 600851475143L;

        long max = 0;

        for(long i=2;i<=num;i++){
            while (num%i == 0) {
                num /= i;
                max = i;
            }
        }
        if (num > 1) {
            max = num;
        }
        System.out.println(max);


    }
}
