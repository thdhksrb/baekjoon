package com.company.backTracking;

import java.util.Scanner;

public class P15649 {

    static int N,M;
    static int arr[];
    static boolean visit[];

    static void dfs(int depth){
        if(depth == M){
            for(int i:arr){
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        for(int i=0;i<N;i++){
            if(!visit[i]){
                visit[i] = true;
                arr[depth] = i+1;
                dfs(depth+1);
                visit[i] = false;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[M];
        visit = new boolean[N];
        dfs(0);
    }
}
