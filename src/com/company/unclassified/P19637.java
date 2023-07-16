package com.company.unclassified;

import java.io.*;
import java.util.*;

public class P19637 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer str = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(str.nextToken());
        int M = Integer.parseInt(str.nextToken());

        String[] name = new String[N];
        int[] num = new int[N];

        for(int i=0;i<N;i++){
            str = new StringTokenizer(br.readLine());

            name[i] = str.nextToken();
            num[i] = Integer.parseInt(str.nextToken());
        }

        for(int i=0;i<M;i++){
            int input = Integer.parseInt(br.readLine());


            if(input <= num[0]){
                bw.write(name[0]);
                bw.newLine();
                continue;
            }
            int start = 1;
            int last = N-1;
            int middle = 0;

            while(start<=last){
                middle = (start+last)/2;

                if(input<=num[middle]&&input>num[middle-1]){
                    break;
                }else if(input<=num[middle]){
                    last = middle - 1;
                }else{
                    start = middle + 1;
                }
            }

            bw.write(name[middle]);
            bw.newLine();


        }
        bw.flush();
        bw.close();


    }
}
