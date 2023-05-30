package com.company.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P4963 {
    static int w,h;
    static int map[][];
    static boolean visit[][];
    static int count = 0;
    static int dx[] = {-1,0,0,1,-1,1,1,-1};
    static int dy[] = {0,1,-1,0,-1,1,-1,1};

    static void dfs(int x,int y){
        visit[x][y] = true;

        for(int i=0;i<8;i++){
            int cx = x + dx[i];
            int cy = y + dy[i];

            if(cx>=1 && cy>=1 && cx<=h && cy<=w){
                if(!visit[cx][cy] && map[cx][cy] == 1){
                    dfs(cx,cy);
                }
            }


        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if(w==0 && h==0){
                break;
            }

            map = new int[h+1][w+1];
            visit = new boolean[h+1][w+1];

            for(int i=1;i<=h;i++){
                StringTokenizer str = new StringTokenizer(br.readLine());
                for(int j=1;j<=w;j++){
                    map[i][j] = Integer.parseInt(str.nextToken());
                }
            }

            count = 0;
            for(int i=1;i<=h;i++){
                for(int j=1;j<=w;j++){
                    if(visit[i][j]==false && map[i][j]==1){
                        dfs(i,j);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }
}
