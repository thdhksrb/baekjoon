package com.company.unclassified;

import java.io.*;
import java.util.*;

public class P1699 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int dp[] = new int[100001];

        for(int i=1;i<=N;i++){
            if(Math.sqrt(i)==Math.floor(Math.sqrt(i))){
                dp[i] = 1;
            }else{
                dp[i] = dp[1] + dp[i-1];
                for(int j=2;j<=i/2;j++){
                    dp[i] = Math.min(dp[i],dp[j] + dp[i-j]);
                }
            }
        }

        System.out.println(dp[N]);

    }
}
