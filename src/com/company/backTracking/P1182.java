package com.company.backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1182 {
    static int N,S;
    static int arr[];
    static int count = 0;

    static void dfs(int depth,int num){
        if(depth == N){
            return;
        }

        if((arr[depth] + num) == S){
            count++;
        }

        dfs(depth+1,num);
        dfs(depth+1,num+arr[depth]);


    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer NS = new StringTokenizer(br.readLine());

        N = Integer.parseInt(NS.nextToken());
        S = Integer.parseInt(NS.nextToken());
        arr = new int[N];
        StringTokenizer str = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(str.nextToken());
        }

        dfs(0,0);

        System.out.println(count);



    }
}
