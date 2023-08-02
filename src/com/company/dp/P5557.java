package com.company.dp;

import java.io.*;
import java.util.*;

public class P5557 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer str = new StringTokenizer(br.readLine());

        int arr[] = new int[N+1];

        for(int i=1;i<=N;i++){
            arr[i] = Integer.parseInt(str.nextToken());
        }

        long dp[][] = new long[21][N];

        dp[arr[1]][1] = 1;

        for(int i=2;i<=N-1;i++){
            for(int j=0;j<=20;j++){

                long a = 0;
                long b = 0;
                if(j+arr[i]>=0 && j+arr[i]<=20){
                    a = dp[j+arr[i]][i-1];
                }
                if(j-arr[i]>=0 && j-arr[i]<=20){
                    b = dp[j-arr[i]][i-1];
                }
                dp[j][i] = a + b;
            }
        }

        System.out.println(dp[arr[N]][N-1]);

    }
}
