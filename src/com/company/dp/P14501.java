package com.company.dp;

import java.io.*;
import java.util.*;

public class P14501 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;

        int[][] input = new int[N+1][2];
        int[] dp = new int[N+1];
        Arrays.fill(dp,0);

        for(int i=1;i<=N;i++){
            st = new StringTokenizer(br.readLine());
            input[i][0] = Integer.parseInt(st.nextToken());
            input[i][1] = Integer.parseInt(st.nextToken());
        }

        dp[0] = 0;

        for(int i=0;i<N;i++){
            if(i+input[i+1][0]<=N){
                dp[i+input[i+1][0]] = Math.max(dp[i] + input[i+1][1],dp[i+input[i+1][0]]);
            }
            dp[i+1] = Math.max(dp[i],dp[i+1]);
        }

        System.out.println(dp[N]);





    }
}
