package com.company.dfs_bfs;

import java.util.Scanner;

public class P1012 {

    static int M,N;
    static int map[][];
    static boolean visit[][];
    static int[] dx = {0,1,-1,0};
    static int[] dy = {1,0,0,-1};

    static void dfs(int x, int y){
        visit[x][y] = true;

        for(int i=0;i<4;i++){
            int cx = x+dx[i];
            int cy = y+dy[i];

            if(cx>=0 && cy>=0 && cx<M && cy<N){
                if(!visit[cx][cy] && map[cx][cy]==1){
                    dfs(cx,cy);
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int t=0;t<T;t++){ //테스트 수

            M = sc.nextInt();
            N = sc.nextInt();
            int K = sc.nextInt();
            int count = 0;

            map = new int[M][N];
            visit = new boolean[M][N];

            for(int i=0;i<K;i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                map[a][b] = 1;
            }

            for(int x=0;x<M;x++){
                for(int y=0;y<N;y++){
                    if(map[x][y] == 1 && visit[x][y] != true){
                        dfs(x,y);
                        count++;
                    }
                }
            }
            System.out.println(count);


        }

    }
}
