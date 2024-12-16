package com.company.algospot;

import java.io.*;
import java.util.*;

// 0-1 0-2 0-3 1-4
// 0 시작 이틀 뒤
// 0 번 마을에 숨어있을 확률 : 1/3*1/2 + 1/3*1/1 + 1/3*1/1
// 4 번 마을에 숨어있을 확률 : 1/3*1/2

// solve(마을(s), 남아있는 횟수(n)) = (1/이전마을의 이웃)*solve(이전 마을 , n-1) + (1/이전마을의 이웃)*solve(이전 마을, n-1) + **
// solve(0,0) = 1
// solve(0,2) = (1/2)*solve(1,1) + (1/1)*solve(2,1) + (1/1)*solve(3,1)
//            = (1/2)*((1/3)*solve(0,0) + (1/1)solve(4,0) ) + (1/3)*solve(0,0) + (1/3)*solve(0,0)

//solve(2,2) = (1/3)*solve(0,1) = (1/3)*(  solve(1,0) + solve(2,0) + solve(3,0) )
//solve(4,2) = 1/2*solve(1,1) = 1/2*((1/3)*solve(0,0) + *solve(4,0))


public class NUMB3RS {
    static boolean[][] map;
    static double[][] dp1;   // solve 캐시
    static int[] dp2; // countNeighbor 캐시
    static int n,d,p;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tCase = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while(tCase-->0){
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken()); // 마을의 수
            d = Integer.parseInt(st.nextToken()); // 탈출 후 지난 일수
            p = Integer.parseInt(st.nextToken()); // 교도소가 있는 마을 번호
            map = new boolean[n][n];
            dp1 = new double[n][d+1];
            for(double[] arr:dp1){
                Arrays.fill(arr,-1.0);
            }
            dp2 = new int[n+1];
            Arrays.fill(dp2,-1);

            for(int i=0;i<n;i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0;j<n;j++){
                    map[i][j] = st.nextToken().equals("1") ? true : false;
                }
            }

            int t = Integer.parseInt(br.readLine()); // 계산 할 마을의 수
            st = new StringTokenizer(br.readLine());
            while(t-->0){
                int target = Integer.parseInt(st.nextToken());
                double answer = solve(target,d);
                sb.append(answer + " ");

            }
            sb.append("\n");


        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();


    }
    static double solve(int s, int count){

        if(count==0){  //기저 조건
            if(s==p) return 1.0;
            return 0;
        }

        if(dp1[s][count]>0) return dp1[s][count];

        double ret = 0;

        for(int i=0;i<map.length;i++){
            if(map[s][i]){
                ret += (1.0/countNeighbor(i))*solve(i,count-1);
            }
        }

        dp1[s][count] = ret;

        return dp1[s][count];
    }

    static int countNeighbor(int n){

        if(dp2[n]!=-1) return dp2[n];
        int ret = 0;
        for(int i=0;i<map.length;i++){
            if(map[n][i]){
                ret++;
            }
        }

        dp2[n] = ret;

        return dp2[n];
    }



}
