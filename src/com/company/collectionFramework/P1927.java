package com.company.collectionFramework;

import java.io.*;
import java.util.PriorityQueue;

public class P1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> q = new PriorityQueue<>();

        for(int i=0;i<N;i++){
            int x = Integer.parseInt(br.readLine());
            if(x==0){
                if(q.isEmpty()){
                    bw.write("0");
                    bw.newLine();
                }else{
                    bw.write(q.poll().toString());
                    bw.newLine();
                }
            }else{
                q.add(x);
            }
        }

        bw.flush();
        bw.close();
    }
}
