package com.company.implementation;

import java.io.*;
import java.util.*;

public class P10709 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(str.nextToken());
        int W = Integer.parseInt(str.nextToken());
        int arr[][] = new int[H][W];

        for(int i=0;i<H;i++){
            String input = br.readLine();
            int num = 0;
            boolean flag = false;
            for(int j=0;j<W;j++){
                char c = input.charAt(j);
                if(c=='c'){
                    arr[i][j] = 0;
                    num = 0;
                    flag = true;
                }else{
                    if(flag){
                        arr[i][j] = num;
                    }else{
                        arr[i][j] = -1;
                    }
                }
                num++;
            }

        }

        for(int i=0;i<H;i++){
            for(int j=0;j<W;j++){
                bw.write(arr[i][j] + " ");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();

    }
}
