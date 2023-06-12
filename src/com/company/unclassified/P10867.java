package com.company.unclassified;

import java.io.*;
import java.util.*;

public class P10867 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Integer,Integer> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()){
            map.put(Integer.parseInt(st.nextToken()),1);
        }

        for(int i=-1000;i<=1000;i++){
            if(map.containsKey(i)){
                bw.write(i + " ");
            }
        }

        bw.flush();
        bw.close();


    }
}
