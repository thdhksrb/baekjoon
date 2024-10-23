package com.company.unclassified;

import java.io.*;
import java.util.*;

public class P1759 {
    static int L;
    static int C;
    static char[] input;
    static char[] output;
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));



        StringTokenizer st = new StringTokenizer(br.readLine());

        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        input = new char[C];
        output = new char[L];

        st = new StringTokenizer(br.readLine());

        for(int i=0;i<C;i++){
            input[i] = st.nextToken().charAt(0);
        }
        Arrays.sort(input);

        dfs(0,0);
        bw.flush();
        bw.close();


    }

    static void dfs(int length,int idx) throws IOException{

        if(length==L){

            if(isValid(output)){
                for(char c : output){
                    bw.write(String.valueOf(c));
                }
                bw.newLine();
                return;
            }
            return;

        }

        for(int i=idx;i<C;i++){
            output[length] = input[i];
            dfs(length+1,i+1);
        }


    }

    static boolean isValid(char[] arr){

        int ja = 0; // 2개 이상
        int mo = 0; // 1개 이상
        for(char c : arr){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                mo++;
            }else{
                ja++;
            }
        }
        if(mo>=1 && ja>=2){
            return true;
        }else{
            return false;
        }

    }
}
