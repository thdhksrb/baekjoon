package com.company.algospot;

import java.io.*;
import java.util.*;
// 다시풀기
// R2가 R1 에 포함되는 조건 (R1 > R2) AND (R1 - R2 > 중심 사이의 거리)
public class FORTRESS {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int C = Integer.parseInt(br.readLine());

        while(C-->0){
            int N = Integer.parseInt(br.readLine());
            for(int i=0; i<N; i++){



            }

        }


    }


    static boolean isContain(String big, String small){

        StringTokenizer st = new StringTokenizer(big);
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(small);
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        if(R <= r) return false;
        if(Math.pow(R-r,2) <= Math.pow(x1-x2,2) + Math.pow(y1-y2,2)){
            return false;
        }

        return true;
    }
}
