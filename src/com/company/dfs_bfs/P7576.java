package com.company.dfs_bfs;

import java.io.*;
import java.util.*;

public class P7576 {

    static int arr[][];
    static Queue<tomato> q = new LinkedList<>();
    static int dx[] = {-1,1,0,0};
    static int dy[] = {0,0,1,-1};
    static int count = 0;
    static int M,N;

    static void bfs(){
        while(!q.isEmpty()){
            tomato toma = q.poll();
            int x = toma.x;
            int y = toma.y;

            for(int i=0;i<4;i++){
                int cx = x + dx[i];
                int cy = y + dy[i];

                if(cx>=1 && cx<=M && cy>=1 && cy<=N){

                }



            }
        }

    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        arr = new int[N+1][M+1];

        for(int i=1;i<=N;i++){
            StringTokenizer str = new StringTokenizer(br.readLine());
            for(int j=1;j<=M;j++){
                arr[i][j] = Integer.parseInt(str.nextToken());
                if(arr[i][j]==1){
                    q.add(new tomato(j,i));
                }

            }
        }

        bfs();


    }
}

class tomato{
    int x;
    int y;
    tomato(int x,int y){
        this.x = x;
        this.y = y;
    }
}
