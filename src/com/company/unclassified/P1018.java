package com.company.unclassified;

import java.io.*;
import java.util.*;

public class P1018 {

    static String arr[][];

    public static int check(int x,int y){

        int count1 = 0;
        int count2 = 0;

        for(int i=x;i<8+x;i++){
            for(int j=y;j<8+y;j++){
                if((i+j)%2==0){
                    if(arr[i][j].equals("W")){
                        count1++;
                    }else{
                        count2++;
                    }
                }else{
                    if(arr[i][j].equals("B")){
                        count1++;
                    }else{
                        count2++;
                    }
                }
            }
        }


        return Math.min(count1,count2);

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(str.nextToken());
        int M = Integer.parseInt(str.nextToken());

        arr = new String[N][M];

        for(int i=0;i<N;i++){
            String input = br.readLine();
            for(int j=0;j<M;j++){
                arr[i][j] = String.valueOf(input.charAt(j));
            }
        }

        int min = check(0,0);

        for(int i=0;i<N-7;i++){
            for(int j=0;j<M-7;j++){
                min = Math.min(min,check(i,j));
            }
        }

        System.out.println(min);

    }
}
