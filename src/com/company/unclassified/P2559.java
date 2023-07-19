package com.company.unclassified;

import java.io.*;
import java.util.*;

public class P2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(str.nextToken());
        int K = Integer.parseInt(str.nextToken());

        int arr[] = new int[N];

        str = new StringTokenizer(br.readLine());

        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(str.nextToken());
        }

        int sum[] = new int[N];

        for(int i=0;i<K;i++){
            sum[K-1] += arr[i];
        }

        int max = -10000001;

        max = Math.max(sum[K-1],max);

        for(int i=K;i<N;i++){
            sum[i] = sum[i-1] + arr[i] - arr[i-K];
            max = Math.max(sum[i],max);
        }

        System.out.println(max);

    }
}
