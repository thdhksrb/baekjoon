package com.company.dp;

import java.util.Arrays;
import java.util.Scanner;

public class P2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int dp[] = new int[5001];
        Arrays.fill(dp,0);

        dp[3] = dp[5] = 1;


        for(int i=6;i<=N;i++){
            if(dp[i-3]!=0 && dp[i-5]!=0){
                dp[i] = Math.min(dp[i-3]+1,dp[i-5]+1);
            }else if(dp[i-3]!=0){
                dp[i] = dp[i-3] + 1;
            }else if(dp[i-5]!=0){
                dp[i] = dp[i-5] + 1;
            }
        }

        if(dp[N]==0){
            System.out.println(-1);
        }else{
            System.out.println(dp[N]);
        }



    }
}
