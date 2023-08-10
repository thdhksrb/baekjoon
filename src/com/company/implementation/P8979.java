package com.company.implementation;

import java.io.*;
import java.util.*;

public class P8979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str;

        str = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(str.nextToken());
        int K = Integer.parseInt(str.nextToken());

        int arr[][] = new int[N][4];

        for(int i=0;i<N;i++){
            str = new StringTokenizer(br.readLine());

            int country = Integer.parseInt(str.nextToken());
            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());
            int c = Integer.parseInt(str.nextToken());
            arr[i][0] = country;
            arr[i][1] = a;
            arr[i][2] = b;
            arr[i][3] = c;
        }

        Arrays.sort(arr,(o1,o2)->{
            if (o1[1] != o2[1]) {
                return o2[1] - o1[1];
            } else if (o1[2] != o2[2]) {
                return o2[2] - o1[2];
            } else if (o1[3] != o2[3]) {
                return o2[3] - o1[3];
            } else if (o1[0] == K) {
                return -1;
            }
            return 0;
                }

        );

        for(int i=0;i<N;i++){
            if(arr[i][0]==K){
                System.out.println(i+1);
                return;
            }
        }

    }
}
