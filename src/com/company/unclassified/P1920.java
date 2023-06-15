package com.company.unclassified;

import java.io.*;
import java.util.*;

public class P1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Map<Integer,Integer> map = new HashMap<>();
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            map.put(Integer.parseInt(st1.nextToken()),1);
        }

        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            if(map.containsKey(Integer.parseInt(st2.nextToken()))){
                bw.write("1");
            }else{
                bw.write("0");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
