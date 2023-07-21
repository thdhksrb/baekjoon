package com.company.unclassified;

import java.io.*;
import java.util.*;

public class P13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int road[] = new int[N-1];
        int city[] = new int[N];

        StringTokenizer str = new StringTokenizer(br.readLine());

        for(int i=0;i<N-1;i++){
            road[i] = Integer.parseInt(str.nextToken());
        }

        str = new StringTokenizer(br.readLine());

        for(int i=0;i<N;i++){
            city[i] = Integer.parseInt(str.nextToken());
        }


        long money = 0;
        long min = city[0];

        for(int i=0;i<N-1;i++){
            long length = road[i];
            money += length*min;
            min = Math.min(min,city[i+1]);

        }

        System.out.println(money);

    }
}
