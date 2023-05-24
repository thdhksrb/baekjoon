package com.company.dfs_bfs;

import java.util.Scanner;

public class P11724 {
    static int arr[][];
    static boolean visit[];
    static int N,M;

    public static void dfs(int x){
        if(visit[x] == true){
            return;
        }else{
            visit[x] = true;
            for(int i=1;i<=N;i++){
                if(arr[x][i] == 1){
                    dfs(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N+1][N+1];
        visit = new boolean[N+1];

        for(int i=0;i<M;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            arr[a][b] = arr[b][a] = 1;

        }

        int count = 0;
        for(int i=1;i<=N;i++){
            if(visit[i]==false){
                dfs(i);
                count++;
            }
        }
        System.out.println(count);



    }
}
