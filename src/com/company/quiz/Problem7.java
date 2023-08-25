package com.company.quiz;

import java.io.*;
import java.util.*;

public class Problem7 {
    public static void main(String[] args) {

        int count = 1;
        for(int i=3;;i+=2){
            boolean flag = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                count++;
            }
            if(count==10001){
                System.out.println(i);
                return;
            }
        }


    }
}
