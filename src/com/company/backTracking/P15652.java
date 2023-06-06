package com.company.backTracking;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class P15652 {
    static int N,M;
    static BufferedWriter bw;
    static int arr[];

    static void dfs(int depth,int k) throws IOException{
        if(depth == M){
            for(int i:arr){
                bw.write(i + " ");
            }
            bw.newLine();
            return;
        }

        for(int i=k;i<=N;i++){
            arr[depth] = i;
            dfs(depth+1,i);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[M];

        dfs(0,1);
        bw.flush();
        bw.close();


    }
}
