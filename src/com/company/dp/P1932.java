package com.company.dp;

import java.io.*;
import java.util.*;

public class P1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long input[][] = new long[n][n];
        long dp[][] = new long[n][n];

        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<=i;j++){
                input[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dp[0][0] = input[0][0];

        for(int i=1;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j==0){
                    dp[i][j] = dp[i-1][j] + input[i][j];
                }else if(j==i){
                    dp[i][j] = dp[i-1][j-1] + input[i][j];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j] + input[i][j], dp[i-1][j-1] + input[i][j]);
                }
            }
        }

        long max = 0;

        for(int i=0;i<n;i++){
            if(dp[n-1][i]>max){
                max = dp[n-1][i];
            }
        }
        System.out.println(max);


    }
}
