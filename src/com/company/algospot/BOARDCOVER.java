package com.company.algospot;

import java.io.*;
import java.util.*;

public class BOARDCOVER {

    static int[][][] type = {{{0,0},{1,0},{0,1}},
                            {{0,0},{0,1},{1,1}},
                            {{0,0},{1,0},{1,-1}},
                            {{0,0},{1,0},{1,1}}};
    static int H,W;
    static boolean[][] map;
    static int answer, block;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        int C = Integer.parseInt(br.readLine());
        for(int i=0;i<C;i++){
            st = new StringTokenizer(br.readLine());
            H = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());

            map = new boolean[H][W];

            int count = 0;

            for(int x=0;x<H;x++){
                String input = br.readLine();
                for(int y=0;y<W;y++){
                    if(input.charAt(y) == '#'){
                        map[x][y] = true;
                    }else{
                        map[x][y] = false;
                        count++;
                    }
                }
            }
            if(count % 3 != 0){
                bw.write("0");
                bw.newLine();
            }else{
                block = count/3;
                answer = 0;
                dfs(0);

                bw.write(String.valueOf(answer));
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }

    static boolean set(int x, int y, int typeNum, boolean status){
        boolean flag = true;

        for(int i=0;i<3;i++){
            int cx = x + type[typeNum][i][0];
            int cy = y + type[typeNum][i][1];

            if(cx<0 || cx>=H || cy<0 || cy>=W || map[cx][cy] == status){
                flag = false;

            }
        }
        if(flag){
            for(int i=0;i<3;i++) {
                int cx = x + type[typeNum][i][0];
                int cy = y + type[typeNum][i][1];
                map[cx][cy] = status;
            }
        }
        return flag;
    }


    static void dfs(int depth){
        if(depth >= block){
            answer++;
            return;
        }

        int x = -1;
        int y = -1;

        for(int i=0;i<H;i++){
            for(int j=0;j<W;j++){
                if(!map[i][j]){
                    x = i;
                    y = j;
                    break;
                }
            }
            if(x != -1) break;
        }

        for(int i=0;i<4;i++){
            if(set(x,y,i,true)){
                dfs(depth+1);
                set(x,y,i,false);
            }
        }

    }
}
