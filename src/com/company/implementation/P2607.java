package com.company.implementation;

import java.io.*;
import java.util.*;

public class P2607 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] alphabet = new int[26];

        String input = br.readLine();
        int originLength = input.length();

        for(int i=0;i<input.length();i++){
            alphabet[input.charAt(i) - 'A']++;
        }

        int answer = 0;
        for(int i=0;i<N-1;i++){
            input = br.readLine();
            int count = 0;
            int[] compare = alphabet.clone();
            for(int j=0;j<input.length();j++){
                if(compare[input.charAt(j)-'A'] == 0){
                    count++;
                }else{
                    compare[input.charAt(j)-'A']--;
                }
            }
            if(originLength - 1 == input.length()){
                if(count == 0){
                    answer++;
                }
            }else if((originLength + 1 == input.length())||(originLength == input.length())){
                if(count <=1){
                    answer++;
                }
            }
        }

        System.out.println(answer);

    }
}
