package com.company.unclassified;

import java.io.*;
import java.util.*;

public class P1051 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int arr[][] = new int[N][M];

        for(int i=0;i<N;i++){
            String str = br.readLine();
            for(int j=0;j<M;j++){
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        int length = Math.min(M,N);

        while(length>1){
            for(int i=0;i<=N-length;i++){
                for(int j=0;j<=M-length;j++){
                    int num = arr[i][j];
                    if((num == arr[i+length-1][j]) && (num == arr[i][j+length-1]) && (num == arr[i+length-1][j+length-1])){
                        System.out.println(length*length);
                        return;
                    }
                }
            }
            length--;
        }

        System.out.println(length*length);

    }
}
