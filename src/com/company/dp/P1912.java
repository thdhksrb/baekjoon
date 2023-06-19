package com.company.dp;

import java.io.*;
import java.util.*;

public class P1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];
        int dp[] = new int[n];
        boolean check[] = new boolean[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = arr[0];
        Arrays.fill(check,false);
        if(arr[0]<0){
            check[0] = true;
        }


        for(int i=1;i<n;i++){
            if(arr[i]>=0){
                if(check[i-1]){
                    dp[i] = arr[i];
                }else{
                    dp[i] = dp[i-1] + arr[i];
                }
            }else{
                if(dp[i-1]+arr[i]>=0){
                    if(check[i-1]){
                        dp[i] = arr[i];
                    }else{
                        dp[i] = dp[i-1] + arr[i];
                    }
                }else{
                    check[i]=true;
                    if(check[i-1]){
                        dp[i] = arr[i];
                    }else{
                        dp[i] = dp[i-1] + arr[i];
                    }
                }
            }
        }

        int max = dp[0];
        for(int i=1;i<dp.length;i++){
            if(dp[i]>max){
                max = dp[i];
            }
        }

        System.out.println(max);

    }
}
