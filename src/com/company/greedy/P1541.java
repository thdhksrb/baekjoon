package com.company.greedy;

import java.util.Scanner;
import java.util.StringTokenizer;

public class P1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int answer = 0;

        String plusMinus[] = input.split("-",2);
        String onlyPlus[] = plusMinus[0].split("\\+");
        for(int i=0;i<onlyPlus.length;i++){
            answer += Integer.parseInt(onlyPlus[i]);
        }
        try{
            String onlyMinus[] = plusMinus[1].split("-|\\+");
            for(int i=0;i<onlyMinus.length;i++){
                answer -= Integer.parseInt(onlyMinus[i]);
            }
        }catch(Exception e){

        }

        System.out.println(answer);


    }
}
