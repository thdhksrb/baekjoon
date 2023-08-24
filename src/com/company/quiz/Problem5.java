package com.company.quiz;

import java.io.*;
import java.util.*;

public class Problem5 {
    public static int LCM(int a,int b){
        int A = a;
        int B = b;
        while(b!=0){
            int temp = a%b;
            a = b;
            b = temp;
        }
        return A*B/a;

    }

    public static void main(String[] args) {

        int min = 1;
        for(int i=2;i<20;i++){
            min = LCM(min,i);
        }
        System.out.println(min);

    }
}
