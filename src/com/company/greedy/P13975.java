package com.company.greedy;

import java.io.*;
import java.util.*;

public class P13975 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++){
            PriorityQueue<Long> q = new PriorityQueue<>();
            long sum = 0;

            int K = Integer.parseInt(br.readLine());
            StringTokenizer str = new StringTokenizer(br.readLine());
            for(int j=0;j<K;j++){
                q.add(Long.parseLong(str.nextToken()));
            }
            while(!q.isEmpty()){
                long a = q.poll();
                try{
                    long b = q.poll();
                    sum += a+b;
                    q.add(a+b);
                }catch(Exception e){

                }

            }
            System.out.println(sum);


        }

    }
}
