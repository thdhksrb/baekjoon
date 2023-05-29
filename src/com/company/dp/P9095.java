package com.company.dp;

import java.util.Scanner;

public class P9095 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dp[] = new int[11];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        int T = sc.nextInt();
        for(int i=0;i<T;i++){

            int n = sc.nextInt();

            for(int j=4;j<=n;j++){
                dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
            }

            System.out.println(dp[n]);

        }

    }
}
