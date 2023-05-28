package com.company.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P2178 {

    static int map[][];
    static boolean visit[][];
    static int dx[] = {-1,1,0,0};
    static int dy[] = {0,0,-1,1};
    static int N,M;

    static void bfs(int x,int y){
        Queue<node> queue = new LinkedList<>();
        queue.add(new node(x,y));

        while(!queue.isEmpty()){
            node node = queue.poll();
            for(int i=0;i<4;i++){
                int cx = node.x + dx[i];
                int cy = node.y + dy[i];

                if(cx<0 || cy<0 || cx>=N || cy>=M){
                    continue;
                }
                if(visit[cx][cy] || map[cx][cy] == 0){
                    continue;
                }

                queue.add(new node(cx,cy));
                map[cx][cy] = map[node.x][node.y] + 1;
                visit[cx][cy] = true;

            }

        }


    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visit = new boolean[N][M];

        for(int i=0;i<N;i++){
            String str = br.readLine();
            for(int j=0;j<M;j++){
                map[i][j] = str.charAt(j) - '0';
            }
        }

        visit[0][0] = true;
        bfs(0,0);
        System.out.println(map[N-1][M-1]);

    }
}

class node{
    int x;
    int y;
    node(int x,int y){
        this.x = x;
        this.y = y;

    }
}
