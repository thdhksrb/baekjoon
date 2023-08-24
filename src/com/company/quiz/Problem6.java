package com.company.quiz;

import java.io.*;
import java.util.*;

public class Problem6 {
    public static void main(String[] args) {
        int N = 100;

        long squareSum = 0; //제곱의 합
        long sumSquare = 0; //합의 제곱

        for(int i=1;i<=N;i++){
            squareSum += Math.pow(i,2);
            sumSquare += i;
        }
        sumSquare = (long)Math.pow(sumSquare,2);

        long answer = Math.abs(sumSquare-squareSum);

        System.out.println(answer);
    }
}
