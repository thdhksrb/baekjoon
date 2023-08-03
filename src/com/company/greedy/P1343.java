package com.company.greedy;

import java.util.*;

public class P1343 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String ans = "";

        str = str.replaceAll("XXXX","AAAA");
        str = str.replaceAll("XX","BB");

        if(str.contains("X")){
            System.out.println(-1);
        }else{
            System.out.println(str);
        }

    }
}
