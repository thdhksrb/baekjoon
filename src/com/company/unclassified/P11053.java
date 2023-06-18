package com.company.unclassified;

import java.io.*;
import java.util.*;

public class P11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int list[] = new int[N];
        int answer[] = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<N;i++){
            list[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.fill(answer,1);

        for(int i=0;i<N;i++){

            for(int j=0;j<i;j++){
                if(list[i]>list[j] && answer[i]<=answer[j]){
                    answer[i] = answer[j] + 1;
                }

            }
        }

        int max = 0;
        for(int num : answer){
            if(num>max){
                max = num;
            }
        }

        System.out.println(max);


    }
}
