package com.company.dfs_bfs;

import java.io.*;
import java.util.*;

public class P2468 {
    static int N;
    static int map[][];
    static boolean visit[][];
    static int count;
    static int dx[] = {-1,1,0,0};
    static int dy[] = {0,0,-1,1};

    static void dfs(int depth,int x,int y){

        if(!visit[x][y] && map[x][y]>depth){
            visit[x][y] = true;
            for(int i=0;i<4;i++){
                int cx = x + dx[i];
                int cy = y + dy[i];
                if(cx>=1 && cx<=N && cy>=1 && cy<=N){
                    if(!visit[cx][cy]){
                        dfs(depth,cx,cy);
                    }
                }

            }
        }
        return;


    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N+1][N+1];

        for(int i=1;i<=N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1;j<=N;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = 1;

        for(int i=1;i<=100;i++){
            visit = new boolean[N+1][N+1];
            count = 0;
            for(int j=1;j<=N;j++){
                for(int k=1;k<=N;k++){
                    if(!visit[j][k] && map[j][k]>i){
                        dfs(i,j,k);
                        count++;
                    }
                }
            }
            if(count>max){
                max = count;
            }

        }
        System.out.println(max);


    }
}
