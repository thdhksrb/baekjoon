package com.company.unclassified;

import java.io.*;
import java.util.*;

public class P9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer str;

        for(int i=0;i<T;i++){
            int answer = 1;
            Map<String,Integer> map = new HashMap<>();
            int n = Integer.parseInt(br.readLine());
            for(int j=0;j<n;j++){
                str = new StringTokenizer(br.readLine());
                str.nextToken();
                String type = str.nextToken();
                map.put(type,map.getOrDefault(type,0)+1);
            }
            for(String key:map.keySet()){
                answer *= map.get(key)+1;
            }
            System.out.println(answer-1);
        }


    }
}
