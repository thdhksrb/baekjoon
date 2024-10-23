package com.company.unclassified;

import java.io.*;
import java.util.*;

public class P10845 {

    static int[] arr = new int[10000];
    static int front = 0;
    static int back = 0;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0;i<N;i++){
            String input = br.readLine();
            st = new StringTokenizer(input);

            switch(st.nextToken()){
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    push(num);
                    break;
                case "pop":
                    pop();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
                case "front":
                    front();
                    break;
                case "back":
                    back();
                    break;
            }

        }

        bw.flush();
        bw.close();

    }
    static void push(int a){
        arr[back++] = a;
    }
    static void pop() throws IOException{
        if(back>front){
            bw.write(arr[front++]+"\n");
        }else{
            bw.write("-1\n");
        }
    }
    static void size() throws IOException{
        bw.write((back-front)+"\n");
    }
    static void empty() throws IOException{
        if(back>front){
            bw.write("0\n");
        }else{
            bw.write("1\n");
        }
    }
    static void front() throws IOException{
        if(back>front){
            bw.write(arr[front]+"\n");
        }else{
            bw.write("-1\n");
        }

    }
    static void back() throws IOException{
        if(back>front){
            bw.write(arr[back-1]+"\n");
        }else{
            bw.write("-1\n");
        }

    }

}
