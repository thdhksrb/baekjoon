package com.company.algospot;

import java.io.*;
import java.util.*;

public class CLOCKSYNC {   //알고스팟 제출 정답처리 확인

    static int[][] switchArr = {
                                {0,1,2},
                                {3,7,9,11},
                                {4,10,14,15},
                                {0,4,5,6,7},
                                {6,7,8,10,12},
                                {0,2,14,15},
                                {3,14,15},
                                {4,5,7,14,15},
                                {1,2,3,4,5},
                                {3,4,5,9,13}
                                };
    static int MIN;
    static int[] arr = new int[16];
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int C = Integer.parseInt(br.readLine());

        StringTokenizer st;
       while(C-->0){
            MIN = Integer.MAX_VALUE;
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<16;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            solve(0,0);


            if(MIN == Integer.MAX_VALUE){
                bw.write("-1");                       //min값 업데이트가 안되었다면 -1
            }else{
                bw.write(String.valueOf(MIN));
            }
            bw.newLine();


        }
        bw.flush();
        bw.close();
    }

    static void solve(int idx, int cnt){
    if(isAnswer()){
        if(cnt<MIN){
            MIN = cnt;    //min값 업데이트
        }
        return;
    }
    if(idx > 9) return;   //스위치 갯수

    for(int i=0;i<4;i++){  //스위치 누른 횟수
        solve(idx+1, cnt+i);         // 해당 스위치IDX 를 0~3번까지 눌러보고 누른 횟수로 solve 재귀 호출
                                            // cnt 누적해서 isAnswer()일 때 MIN값 보다 작다면 업데이트
                                                // 1. solve()함수가 왜 아래의 for문의 시간을 바꾸기 전에 호출되는지
                                                // 2. solve()함수를 호출 하고 시계의 상태를 원래 상태로 왜 되돌리지 않는지
        for(int num : switchArr[idx]){
            arr[num] += 3;
            if(arr[num] == 15){
                arr[num] = 3;
            }
        }
    }
}
    static boolean isAnswer(){
        for(int i : arr){
            if(i != 12){
                return false;
            }
        }
        return true;
    }
}
