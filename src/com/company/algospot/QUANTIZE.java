package com.company.algospot;

import java.io.*;
import java.util.*;

public class QUANTIZE { //책 풀이 참고

    static int[] num, pSum, pSqSum;
    static int N,S;
    static int[][] dp;


    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int C = Integer.parseInt(br.readLine().trim());
        StringTokenizer st;
        while(C-->0){
            st = new StringTokenizer(br.readLine().trim());
            N = Integer.parseInt(st.nextToken());  //수열 길이
            S = Integer.parseInt(st.nextToken());  //사용할 숫자 개수

            num = new int[N];
            pSum = new int[N];   //부분 합
            pSqSum = new int[N];  //부분 제곱의 합
            dp = new int[101][11];
            for(int[] a : dp){
                Arrays.fill(a,-1);
            }

            st = new StringTokenizer(br.readLine().trim());

            for(int i=0;i<N;i++){
                num[i] = Integer.parseInt(st.nextToken());
            }
            precalc();
            int result = quantize(0,S);
            bw.write(String.valueOf(result));
            bw.newLine();

        }
        bw.flush();
        bw.close();


    }

    static void precalc(){
        Arrays.sort(num);
        pSum[0] = num[0];
        pSqSum[0] = num[0]*num[0];

        for(int i=1;i<N;i++){
            pSum[i] = pSum[i-1] + num[i];
            pSqSum[i] = pSqSum[i-1] + num[i]*num[i];
        }

    }

    static int minError(int lo, int hi){ // 오차 합 계산

        int sum = pSum[hi] - (lo == 0 ? 0 : pSum[lo-1]);
        int sqSum = pSqSum[hi] - (lo == 0 ? 0 : pSqSum[lo-1]);

        int m = (int)Math.round((double)sum/(hi-lo+1));

        int ret = sqSum - 2*m*sum + m*m*(hi-lo+1);
        return ret;

    }

    static int quantize(int from, int parts){

        if(from==N) return 0; // 기저 사례

        if(parts==0) return 987654321; //숫자가 남았을 때

        int ret = dp[from][parts];
        if(ret != -1){
            return ret;
        }
        ret = 987654321;
        for(int partSize=1; partSize<=N-from; partSize++) {
            ret = Math.min(ret, minError(from, from+partSize-1) + quantize(from + partSize, parts-1));
            dp[from][parts] = ret;
        }

        return ret;
    }
}
