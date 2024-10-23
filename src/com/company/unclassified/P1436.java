package com.company.unclassified;

import java.util.*;

public class P1436 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder("");

        for(int i=1;;i++){

            sb = sb.replace(0,sb.length(),i+"");

            if(sb.indexOf("666")!=-1){
                N--;
            }
            if(N==0){
                break;
            }

        }

        System.out.println(sb);

    }
}
