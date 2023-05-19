package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        String arr[] = new String[T];

        for(int i=0;i<T;i++){
            arr[i] = br.readLine();
        }

        for(String s : arr){
            String split[] = s.split("");
            int count = 0;
            String answer = "YES";
            for(int i=0;i<split.length;i++){
                if(split[i].equals("(")){
                    count ++;
                }else if(split[i].equals(")")){
                    count --;
                }
                if(count<0){
                    answer = "NO";
                    break;
                }
            }
            if(count !=0){
                answer = "NO";
            }
            System.out.println(answer);
        }

    }
}
