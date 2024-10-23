package com.company.unclassified;

import java.io.*;
import java.util.*;

public class P10816 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<N;i++){
            int n = Integer.parseInt(st.nextToken());
            map.put(n,map.getOrDefault(n,0)+1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i=0;i<M;i++){
            int n = Integer.parseInt(st.nextToken());
            bw.write(map.getOrDefault(n,0)+" ");

        }
        bw.flush();
        bw.close();

    }
}
