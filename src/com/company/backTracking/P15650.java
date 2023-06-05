package com.company.backTracking;

import java.util.Scanner;

public class P15650 {
    static int N,M;
    static boolean visit[];
    static int arr[];
    static void dfs(int depth,int k){
        if(depth == M){

            for(int i : arr){
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        for(int i=k;i<=N;i++){
            if(!visit[i-1]){
                visit[i-1] = true;
                arr[depth] = i;
                dfs(depth+1,i);
                visit[i-1] = false;
            }
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        visit = new boolean[N];
        arr = new int[M];

        dfs(0,1);


    }
}
