package com.company.quiz;

import java.util.*;

public class Problem71 {

    public static int GCD(int a, int b){
        int r = b%a;
        if(r!=0){
            return GCD(r,a);
        }
        return a;
    }
    public static void main(String[] args) {
        Map<String,Double> map = new HashMap<>();

        for(int i=1;i<=1000000;i++){
            for(int j=1;j<i;j++){
                if(GCD(j,i)==1){
                    map.put(j + "/" + i,(double)j/i);
                }
            }
        }

        List<Map.Entry<String,Double>> entries = new ArrayList<>(map.entrySet());
        entries.sort((o1,o2)->o1.getValue().compareTo(o2.getValue()));

        for(int i=0;i<entries.size();i++){
            if(entries.get(i).getKey().equals("3/7")){
                System.out.println(entries.get(i-1).getKey());
                break;
            }
        }


    }
}
