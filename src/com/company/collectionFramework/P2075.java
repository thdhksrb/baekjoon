package com.company.collectionFramework;

import java.io.*;
import java.util.*;

public class P2075 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer str;

        Queue<Integer> q = new PriorityQueue<>();


        for(int i=0;i<N;i++){
            str = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                q.add(Integer.parseInt(str.nextToken()));
            }
        }

        for(int i=1;i<N*N-N+1;i++){
            q.poll();
        }
        System.out.println(q.poll());


    }
}
