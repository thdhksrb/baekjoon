package com.company.algospot;

import java.io.*;
import java.util.*;

public class PICNIC { // 다시

    static boolean[] visit;
    static int count,n,m;
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

            dfs(0);

            bw.write(String.valueOf(count));
            bw.newLine();

        }

        bw.flush();
        bw.close();


    }

    static void dfs(int depth){
        if(depth >= n/2){
            count++;
            return;
        }

        int firstStudent = -1;
        for(int i=0;i<n;i++){
            if(!visit[i]){
                firstStudent = i;
                break;
            }
        }

        if(firstStudent == -1) return;

        for(int[] pair: arr){
            int a = pair[0];
            int b = pair[1];

            if(!visit[a] && !visit[b]){
                visit[a] = visit[b] = true;
                dfs(depth + 1);
                visit[a] = visit[b] = false;

            }
        }
    }
}
