package com.company.unclassified;


import java.util.Scanner;

public class P2941 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] str = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        String answer = input;

        for(String s:str){
            answer = answer.replace(s,"1");
        }

        System.out.println(answer.length());
    }
}
