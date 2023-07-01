package com.company.dp;

import java.io.*;
import java.util.*;

public class P2579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stair[] = new int[n+1];
        int dp[] = new int[n+1];

        for(int i=1;i<=n;i++){
            stair[i] = sc.nextInt();
        }

        dp[1] = stair[1];
        if(n>=2){
            dp[2] = stair[1] + stair[2];
        }
        if(n>=3){
            dp[3] = Math.max(stair[1],stair[2]) + stair[3];
        }

        for(int i=4;i<=n;i++){
            dp[i] = stair[i] + Math.max(dp[i-3]+stair[i-1],dp[i-2]);
        }

        System.out.println(dp[n]);


    }
}
