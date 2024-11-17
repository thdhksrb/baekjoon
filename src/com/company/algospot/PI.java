package com.company.algospot;

import java.io.*;
import java.util.*;

public class PI {

    static int[] number; // input
    static int[][] dp;
    static int[] dx = {3,4,5}; // 자를 수 있는 글자 단위
    static int maxVal = Integer.MAX_VALUE;
    static int length;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int C = Integer.parseInt(br.readLine().trim());

        while(C-->0){
            String input = br.readLine().trim();
            length = input.length();
            number = new int[length];
            dp = new int[length/3+1][length+1]; // 최소 3글자이므로 x축 : 자르는 depth
            for(int[] a : dp){
                Arrays.fill(a,maxVal);
            }

            for(int i=0;i<length;i++){
                number[i] = input.charAt(i) - '0';
            }

            dp[0][0] = 0;

            for(int i=0;i<=length/3;i++){
                for(int j=0;j<=length;j++){
                    if(dp[i][j] != maxVal){
                        for(int cx : dx){
                            if((i+1)<=length/3 && (j+cx)<=length)
                            dp[i+1][j+cx] = Math.min(dp[i][j] + score(j,cx),dp[i+1][j+cx]);
                        }
                    }
                }
            }

            int minAnswer = maxVal;
            for(int i=0;i<=length/3;i++){
                minAnswer = Math.min(dp[i][length],minAnswer); //배열 끝 라인 중 최소
            }
            bw.write(String.valueOf(minAnswer));
            bw.newLine();

        }

        bw.flush();

//        for(int i=0;i<length/3+1;i++){
//            for(int j=0;j<length+1;j++){
//                System.out.printf("%10d " , dp[i][j]);
//            }
//            System.out.println();
//        }
        bw.close();



    }

    static int score(int index, int cx){
        boolean one = true;
        boolean twoUp = true;
        boolean twoDown = true;
        boolean four = true;
        boolean five = true;

        int temp = number[index+1] - number[index];
        for(int i=0;i<cx-1;i++){
            if(number[index+i]!=number[index+i+1])
                one = false;
            if(number[index+i]!=number[index+i+1]-1)
                twoUp = false;
            if(number[index+i]!=number[index+i+1]+1)
                twoDown = false;
            if((number[index+i+1] - number[index+i]) != temp)
                five = false;
        }

        for(int i=0;i<cx-2;i++){
            if(number[index+i]!=number[index+i+2])
                four = false;
        }
        if(one) return 1;
        if(twoUp||twoDown) return 2;
        if(four) return 4;
        if(five) return 5;

        return 10;

    }
}
