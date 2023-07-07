package com.company.unclassified;

import java.io.*;
import java.util.*;

public class P1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Map<String,Integer> map = new HashMap<>();

        for(int i=0;i<N;i++){
            String book = br.readLine();
            if(map.containsKey(book)){
                map.put(book,map.get(book) + 1);
            }else{
                map.put(book,1);
            }
        }

        Comparator<Map.Entry<String,Integer>> comparator = new Comparator<>(){

            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(o2.getValue().compareTo(o1.getValue()) !=0){
                    return o2.getValue().compareTo(o1.getValue());
                }

                return o1.getKey().compareTo(o2.getKey());
            }
        };

        Map.Entry<String, Integer> firstEntry = Collections.min(map.entrySet(), comparator);


        System.out.println(firstEntry.getKey());

    }
}
