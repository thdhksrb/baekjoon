package com.company.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1388 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] arr= new char[N][M];

        for(int i=0;i<N;i++){
            String str = br.readLine();
            for(int j=0;j<M;j++){
                arr[i][j] = str.charAt(j);
            }
        }

        int count = 0;

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(arr[i][j] == '-'){
                    count++;
                    while(j<M && arr[i][j] == '-'){
                        j++;
                    }
                }
            }
        }

        for(int j=0;j<M;j++){
            for(int i=0;i<N;i++){
                if(arr[i][j] == '|'){
                    count++;
                    while(i<N && arr[i][j] == '|'){
                        i++;
                    }
                }
            }
        }

        System.out.println(count);

    }
}
