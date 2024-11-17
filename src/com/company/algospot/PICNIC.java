package com.company.algospot;

import java.io.*;
import java.util.*;

public class PICNIC {

    static boolean[] visit;
    static int count,n,m;  //N : 학생수 M : 페어 수
    static int[][] arr;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int C = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i=0;i<C;i++){
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            arr = new int[m][2];
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                arr[j][0] = Integer.parseInt(st.nextToken());
                arr[j][1] = Integer.parseInt(st.nextToken());
            }

            count = 0;
            visit = new boolean[n];
            Arrays.fill(visit,false);

            dfs(0,0);

            bw.write(String.valueOf(count));
            bw.newLine();

        }

        bw.flush();
        bw.close();


    }

    static void dfs(int depth, int x){
        if(depth >= n/2){
            count++;
            return;
        }
        for(int i=x;i<m;i++){

            if(!visit[arr[i][0]] && !visit[arr[i][1]]){
                visit[arr[i][0]] = visit[arr[i][1]] = true;
                dfs(depth+1,i+1);
                visit[arr[i][0]] = visit[arr[i][1]] = false;
            }
        }

    }
}
