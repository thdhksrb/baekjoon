package com.company.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Test1 {
    static int area[][];
    static boolean visit[][];
    static int dx[] = {-1,1,0,0};
    static int dy[] = {0,0,-1,1};
    static int N;
    static int count = 0;

    static void dfs(int x, int y){

        visit[x][y] = true;

        for(int i=0;i<4;i++){
            int cx = x + dx[i];
            int cy = y + dy[i];
            if(cx>=1 && cy>=1 && cx<=N && cy<=N){
                if(!visit[cx][cy] && area[cx][cy]==1){
                    dfs(cx,cy);
                    count++;
                }
            }
        }
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        area = new int[N+1][N+1];
        visit = new boolean[N+1][N+1];
        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=N;j++){
                area[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                if(!visit[i][j]&&area[i][j]==1){
                    count = 1;
                    dfs(i,j);
                    list.add(count);
                }
            }
        }

        Collections.sort(list);

        System.out.println(list.size());
        for(int i : list){
            System.out.print(i + " ");
        }


    }
}
