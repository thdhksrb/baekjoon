package com.company.unclassified;

import java.io.*;
import java.util.*;

public class P10610 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.nextLine();
        Integer arr[] = new Integer[N.length()];

        for(int i=0;i<N.length();i++){
            arr[i] = N.charAt(i) - '0';
        }

        Arrays.sort(arr,Collections.reverseOrder());

        int sum = 0;

        for(int i:arr){
            sum += i;
        }
        if(sum%3==0 && arr[N.length()-1]==0){
            for(int i:arr){
                System.out.print(i);
            }
        }else{
            System.out.println("-1");
        }

    }
}
