package com.company.stringSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String,String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for(int i=0;i<N;i++){
            String str = br.readLine();
            map.put(str,str);
        }

        for(int i=0;i<M;i++){
            String str = br.readLine();
            if(map.containsKey(str)){
                list.add(str);
            }
        }

        Collections.sort(list);

        System.out.println(list.size());
        for(String s:list){
            System.out.println(s);
        }

    }
}
