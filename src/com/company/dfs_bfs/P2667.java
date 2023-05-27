package com.company.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class P2667 {
    static char[][] map;
    static boolean[][] visit;
    static int count = 0;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};
    static int N;
    static ArrayList<Integer> list;

    static void dfs(int x, int y){

        visit[x][y] = true;

        for(int i=0;i<4;i++){
            int cx = x+dx[i];
            int cy = y+dy[i];

            if(cx>=1 && cy>=1 && cx<=N && cy<=N){
                if(map[cx][cy]=='1' && !visit[cx][cy]){
                    dfs(cx,cy);
                    count++;
                }
            }
        }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new char[N+1][N+1];
        visit = new boolean[N+1][N+1];

        for(int i=1;i<=N;i++){
            String str = br.readLine();
            for(int j=1;j<=N;j++){
                map[i][j] = str.charAt(j-1);
            }
        }

        list = new ArrayList<>();
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                if(!visit[i][j] && map[i][j] == '1'){
                    count = 1;
                    dfs(i,j);
                    list.add(count);

                }
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for(int i : list){
            System.out.println(i);
        }


    }
}
