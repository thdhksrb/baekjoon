package com.company.collectionFramework;

import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class P11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<N;i++){
            int num = Integer.parseInt(br.readLine());
            if(num==0){
                if(q.isEmpty()){
                    bw.write("0");
                    bw.newLine();
                }else{
                    bw.write(q.poll().toString());
                    bw.newLine();
                }
            }else{
                q.add(num);
            }

        }
        bw.flush();
        bw.close();
    }
}
