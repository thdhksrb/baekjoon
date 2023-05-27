package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int count = 0;

        String arr[] = new String[N];
        String arr2[] = new String[M];

        for(int i=0;i<N;i++){
            arr[i] = br.readLine();
        }

        for(int i=0;i<M;i++){
            arr2[i] = br.readLine();
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(arr2[j].equals(arr[i])){
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}
