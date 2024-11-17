package com.company.algospot;

import java.io.*;

public class BOGGLE {  //시간 초과 (재귀 -> dp 로 변경 필요)

    static char[][] map;
    static int[] dx;
    static int[] dy;
    static boolean flag = false;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        map = new char[5][5];
        dx = new int[] {-1,-1,-1,0,0,1,1,1};
        dy = new int[] {-1,0,1,1,-1,1,0,-1};
        int C = Integer.parseInt(br.readLine());


        for(int i=0;i<C;i++){

            for(int j=0;j<5;j++){
                String str = br.readLine();
                for(int k=0;k<5;k++){
                    map[j][k] = str.charAt(k);
                }
            }

            int N = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<N;j++){
                flag = false;
                sb.append(checkWord(br.readLine()));
            }

            bw.write(String.valueOf(sb));

        }
        bw.flush();
        bw.close();

    }
    static String checkWord(String word){

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(word.charAt(0) == map[i][j]){
                    dfs(i,j,word,1);
                }
            }
        }
        if(flag){
            return word + " YES" + "\n";
        }
        return word + " NO" + "\n";
    }

    static boolean dfs(int x, int y, String word, int depth){
        if(depth >= word.length()){
            flag = true;
            return true;
        }

        for(int i=0;i<8;i++){
            int cx = x + dx[i];
            int cy = y + dy[i];

            if(cx>=0 && cx<5 && cy>=0 && cy<5){
                if(map[cx][cy] == word.charAt(depth)){
                    dfs(cx,cy,word,depth+1);
                }
            }

        }
        return false;
    }
}
