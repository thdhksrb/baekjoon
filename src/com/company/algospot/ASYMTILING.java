package com.company.algospot;

import java.io.*;
import java.util.*;
//짝수 = f(n) - f(n/2+1)
//홀수 = f(n) - f(n/2)
public class ASYMTILING {

    static int[] dp;
    static int MOD = 1000000007;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int C = Integer.parseInt(br.readLine());

        while(C-->0){
            int n = Integer.parseInt(br.readLine());
            dp = new int[n+1];
            Arrays.fill(dp,-1);
            int result = (n%2)==0 ? (tiling(n) - tiling(n/2+1) + MOD)%MOD : ((tiling(n) - tiling(n/2)) + MOD)%MOD;
            bw.write(String.valueOf(result));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    static int tiling(int n){
        if(n <= 1) return 1; //기저사례

        if(dp[n]!=-1) return dp[n];

        dp[n] = (tiling(n-1) + tiling(n-2))%MOD;

        return dp[n];
    }
}
