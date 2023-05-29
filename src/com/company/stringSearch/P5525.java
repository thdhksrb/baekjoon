package com.company.stringSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        char[] input = br.readLine().toCharArray();

        int answer = 0;
        int count = 0;

        for(int i=1;i<M-1;i++){
            if(input[i-1]=='I' && input[i]=='O' && input[i+1]=='I'){
                count++;
                if(count==N){
                    count--;
                    answer++;
                }
                i++;

            }else{
                count = 0;
            }
        }

        System.out.println(answer);


    }
}
