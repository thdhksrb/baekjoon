package com.company.algospot;

import java.io.*;
import java.util.*;
//동적계획법
//이진 탐색
public class JLIS {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int c = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while(c-->0){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());  // A길이
            int m = Integer.parseInt(st.nextToken());  // B길이
            int[] A = new int[n];
            int[] B = new int[m];
            int[] dp = new int[n+m];  //LIS 길이 구하기(이진탐색) A,B 병합 버전

            st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                A[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<m;i++){
                B[i] = Integer.parseInt(st.nextToken());
            }



        }


    }
}
