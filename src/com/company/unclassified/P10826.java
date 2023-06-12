package com.company.unclassified;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class P10826 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger dp[] = new BigInteger[10001];
        dp[0] = BigInteger.ZERO;
        dp[1] = BigInteger.ONE;

        int n = sc.nextInt();

        for(int i=2;i<=n;i++){
            dp[i] = dp[i-2].add(dp[i-1]);
        }

        System.out.println(dp[n]);

    }
}
