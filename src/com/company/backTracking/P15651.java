package com.company.backTracking;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class P15651 {
    static int N,M;
    static int arr[];
    static BufferedWriter bw;

    static void dfs(int depth) throws IOException {
        if(depth == M){
            for(int i:arr){
                bw.write(i+" ");
            }
            bw.newLine();
            return;
        }

        for(int i=0;i<N;i++){
            arr[depth] = i+1;
            dfs(depth+1);
        }

    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[M];
        dfs(0);
        bw.flush();
        bw.close();

    }
}
