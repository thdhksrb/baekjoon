package com.company.implementation;

import java.util.*;

public class P1475 {
    public static void main(String[] args) throws NullPointerException {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<=8;i++){
            map.put(i,0);
        }

        boolean flag = false;

        for(int i=0;i<N.length();i++){
            int num = N.charAt(i) - '0';

            if(num==6||num==9){
                Integer value = map.get(6);

                if(!flag){
                    map.put(6,value+1);
                }
                flag = !flag;

            }else{
                Integer value = map.get(num);

                map.put(num,value+1);
            }

        }

        int max = 0;

        for(int i=0;i<=8;i++){
            int value = map.get(i);
            if(max<value){
                max = value;
            }
        }
        System.out.println(max);

    }
}
