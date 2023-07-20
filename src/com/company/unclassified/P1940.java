package com.company.unclassified;

import java.io.*;
import java.util.*;

public class P1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        StringTokenizer str = new StringTokenizer(br.readLine());

        int arr[] = new int[N];

        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(str.nextToken());
        }

        int count = 0;

        for(int i=0;i<N;i++){
            int num = M - arr[i];
            for(int j=0;j<N;j++){
                if(j==i){
                    continue;
                }
                if(arr[j]==num){
                    count++;

                }

            }
        }

        System.out.println(count/2);


    }
}
