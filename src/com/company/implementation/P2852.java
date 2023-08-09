package com.company.implementation;

import java.io.*;
import java.util.*;

public class P2852 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer str;

        int scoreA = 0;
        int scoreB = 0;

        int timeA = 0;
        int timeB = 0;


        int arr[][] = new int[N][2];

        for(int i=0;i<N;i++){
            str = new StringTokenizer(br.readLine());
            int team = Integer.parseInt(str.nextToken());
            String time[] = str.nextToken().split(":");
            int minute = Integer.parseInt(time[0])*60 + Integer.parseInt(time[1]);

            arr[i][0] = team;
            arr[i][1] = minute;
        }

        int prevTime = arr[0][1];
        int winningteam = 0;

        if(arr[0][0]==1){
            scoreA++;
            winningteam = 1;
        }else{
            scoreB++;
            winningteam = 2;
        }

        for(int i=1;i<N;i++){

            if(arr[i][0]==1){
                scoreA++;
                if(winningteam==0){
                    winningteam = 1;
                    prevTime = arr[i][1];
                }
            }else{
                scoreB++;
                if(winningteam==0){
                    winningteam = 2;
                    prevTime = arr[i][1];
                }
            }

            if(scoreA==scoreB){
                if(winningteam==1){
                    timeA += arr[i][1] - prevTime;
                    winningteam = 0;
                }else{
                    timeB += arr[i][1] - prevTime;
                    winningteam = 0;
                }

            }
        }

        if(winningteam==1){
            timeA += 48*60 - prevTime;
        }else if(winningteam==2){
            timeB += 48*60 - prevTime;
        }

        System.out.printf("%02d:%02d",timeA/60,timeA%60);
        System.out.println();
        System.out.printf("%02d:%02d",timeB/60,timeB%60);


    }
}
