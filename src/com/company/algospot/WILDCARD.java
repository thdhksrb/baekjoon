package com.company.algospot;

import java.io.*;
import java.util.*;
//동적계획법
//풀이 참조
public class WILDCARD {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int C = Integer.parseInt(br.readLine());

        while(C-->0){
            String word = br.readLine();             //와일드 카드 문자열
            int N = Integer.parseInt(br.readLine());
            String[] input = new String[N];
            List<String> answer = new ArrayList();
            for(int i=0;i<N;i++){
                input[i] = br.readLine();
                if(check(word, input[i])){ // check() 가 true일 경우 list에 추가
                    answer.add(input[i]);
                }
            }
            Collections.sort(answer);    //list 정렬
            for(String s : answer){
                bw.write(s);
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
    static boolean check(String word, String input){

        int wordLength = word.length();
        int inputLength = input.length();

        int[][] dp = new int[wordLength+1][inputLength+1];

        dp[0][0] = 1; //초기값 세팅     i,j 1부터

        for(int i=1;i<wordLength+1;i++){
            for(int j=0;j<inputLength+1;j++){

                if(word.charAt(i-1)=='?'){
                    if(j==0) continue;
                    if(dp[i-1][j-1]==1){
                        dp[i][j] = 1;
                    }
                }else if(word.charAt(i-1)=='*'){
                    if(dp[i-1][j]==1){
                        for(int k=j;k<inputLength+1;k++){
                            dp[i][k] = 1;
                        }
                        break;               //1을 쭉 세팅하고 break
                    }
                }else{
                    if(j==0) continue;
                    if(dp[i-1][j-1]==1 && word.charAt(i-1)==input.charAt(j-1)){
                        dp[i][j] = 1;
                    }
                }
            }
        }
        if(dp[wordLength][inputLength] == 1){
            return true;
        }
        return false;
    }
}
