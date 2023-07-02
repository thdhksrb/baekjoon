package com.company.unclassified;

import java.io.*;
import java.util.*;

public class P1654 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int arr[] = new int[K];

        for(int i=0;i<K;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        long start = 1;
        long last = (long)(Math.pow(2,31)-1);

        while(start<=last){
            int count = 0;
            long center = (start + last) / 2;
            for(int i=0;i<K;i++){
                long num = arr[i]/center;
                count += num;
            }
            if(count>=N){
                start = center + 1;
            }else{
                last = center - 1;
            }

        }
        System.out.println(last);

    }
}
