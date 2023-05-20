package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int arr[][] = new int[N][3];

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = 1;
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(i==j)
                    continue;

                if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]){
                    arr[i][2]++;
                }
            }
        }

        for(int i=0;i<N;i++){
            System.out.print(arr[i][2] + " ");
        }

    }
}
