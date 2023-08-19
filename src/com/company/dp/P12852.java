package com.company.dp;

import java.io.*;
import java.util.*;

public class P12852 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int dp[] = new int[N+1];

        dp[N] = 0;

        for(int i=N-1;i>=1;i--){
            dp[i] = dp[i+1] + 1;

            if(i*2<=N){
                dp[i] = Math.min(dp[i],dp[i*2]+1);
            }
            if(i*3<=N){
                dp[i] = Math.min(dp[i],dp[i*3]+1);
            }
        }

        int answer = dp[1];

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        answer--;
        int temp = 1;

        for(int i=2;i<=N;i++){
            if(dp[i]==answer){
                if(i==temp*3 || i==temp*2 || i==temp+1){
                    temp = i;
                    stack.push(i);
                    answer--;
                }
            }
        }

        System.out.println(dp[1]);
        while(!stack.isEmpty()){
            int num = stack.pop();
            System.out.print(num + " ");
        }


    }
}
