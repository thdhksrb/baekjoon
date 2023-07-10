package com.company.unclassified;

import java.util.*;

public class P1748 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        int length = input.length();

        int N = Integer.parseInt(input);


        int temp = (int)(999999999 % Math.pow(10,length-1));


        long answer = (N - temp)*length;
        length--;

        while(length>0){
            answer += 9*Math.pow(10,length-1)*length;
            length--;
        }
        System.out.println(answer);


    }
}
