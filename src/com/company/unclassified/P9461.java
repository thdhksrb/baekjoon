package com.company.unclassified;

import java.io.*;
import java.util.*;

public class P9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        long dp[] = new long[101];

        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;


        for(int i=0;i<T;i++){
            int N = Integer.parseInt(br.readLine());
            for(int j=4;j<=N;j++){
                dp[j] = dp[j-2] + dp[j-3];
            }

            System.out.println(dp[N]);
        }

    }
}
