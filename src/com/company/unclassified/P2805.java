package com.company.unclassified;

import java.io.*;
import java.util.*;

public class P2805 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long M = Long.parseLong(st.nextToken());

        StringTokenizer str = new StringTokenizer(br.readLine());
        Long arr[] = new Long[N];
        for(int i=0;i<N;i++){
            arr[i] = Long.parseLong(str.nextToken());
        }

        Arrays.sort(arr,Collections.reverseOrder());

        long start = 0;
        long end = arr[0];

        while(start <= end){
            long mid = (start + end) / 2;
            long sum = 0;

            for(long tree : arr){
                if(tree > mid){
                    sum += tree - mid;
                }
            }

            if(sum>=M){
                start = mid + 1;
            }else{
                end = mid - 1;
            }

        }
        System.out.println(end);


    }
}
