package com.company.dp;

import java.util.Scanner;

public class P1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        long dp[][] = new long[41][2];

        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        for(int i=0;i<T;i++){
            int N = sc.nextInt();
            for(int j=2;j<=N;j++){
                dp[j][0] = dp[j-1][0] + dp[j-2][0];
                dp[j][1] = dp[j-1][1] + dp[j-2][1];
            }
            System.out.println(dp[N][0] + " " + dp[N][1]);
        }
    }
}
