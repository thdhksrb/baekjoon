package com.company.dp;

import java.util.*;

public class P2193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long dp[][] = new long[N][2];

        dp[0][0] = 0; // 0일 때
        dp[0][1] = 1; // 1일 때

        for(int i=1;i<N;i++){
            dp[i][0] = dp[i-1][0] + dp[i-1][1];
            dp[i][1] = dp[i-1][0];
        }

        System.out.println(dp[N-1][0]+dp[N-1][1]);

    }
}
