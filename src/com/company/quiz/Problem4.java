package com.company.quiz;

import java.io.*;
import java.util.*;

public class Problem4 {
    public static void main(String[] args) {

        int max = 0;
        for(int i=999;i>=100;i--){
            for(int j=999;j>=100;j--){
                int num = i*j;
                String str = String.valueOf(num);
                char[] chr = new char[str.length()];
                for(int k=0;k<str.length();k++){
                    chr[k] = str.charAt(str.length()-k-1);
                }
                String result = String.valueOf(chr);
                int numResult = Integer.parseInt(result);
                if(num==numResult){
                    max = Math.max(num,max);
                }

            }
        }

        System.out.println(max);


    }
}
