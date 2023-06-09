package com.company.backTracking;

import java.io.*;
import java.util.*;

public class P15655 {
    static BufferedWriter bw;
    static int N,M;
    static int arr[];
    static boolean visit[];
    static int answer[];

    static void dfs(int depth, int k) throws IOException{
        if(depth == M){
            for(int num : answer){
                bw.write(num + " ");
            }
            bw.newLine();
            return;
        }

        for(int i=k;i<N;i++){
            if(!visit[i]){
                visit[i] = true;
                answer[depth] = arr[i];
                dfs(depth+1,i+1);
                visit[i] = false;
            }
        }


    }


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[N];
        visit = new boolean[N];
        answer = new int[M];

        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);


        dfs(0,0);

        bw.flush();
        bw.close();


    }
}
