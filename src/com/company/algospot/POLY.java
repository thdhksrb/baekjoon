package com.company.algospot;

import java.io.*;
import java.util.*;

// poly(n, first)
// -> 첫줄(first)에 first개의 블럭이 있을 때 n개블록을 만들 수 있는 수
// poly(n,first) = first * poly(n-first,1) + (first+1) * poly(n-first,2)
// *** + (n-1) * poly(n-first,n-first)

public class POLY {
    static int[][] dp;
    static int MOD = 10000000;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int CASE = Integer.parseInt(br.readLine());
        while(CASE-->0){

            int n = Integer.parseInt(br.readLine());
            int result = 0;
            dp = new int[n+1][101];
            for(int[] arr : dp){
                Arrays.fill(arr,-1);
            }

            for(int i=1;i<=n;i++){
                result = (result + (poly(n,i)) + MOD) % MOD;
            }
            bw.write(String.valueOf(result));
            bw.newLine();

        }
        bw.flush();
        bw.close();

    }
    static int poly(int n, int first){

        if(n==first) return 1;

        if(dp[n][first] != -1) return dp[n][first];

        int ret = 0;
        for(int i=1;i<=n-first;i++){
            ret = (ret + (first + i- 1) * poly(n-first,i) + MOD) % MOD;
        }

        dp[n][first] = ret;

        return dp[n][first];

    }
}
