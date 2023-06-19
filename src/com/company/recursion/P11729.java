package com.company.recursion;

import java.io.*;
import java.util.*;

public class P11729 {
    static int answer = 0;

    static StringBuilder sb = new StringBuilder();

    public static void recur(int num,int start, int mid, int end){

        answer++;
        if(num == 1){
            sb.append(start + " " + end + "\n");
            return;
        }

        recur(num-1,start,end,mid);

        sb.append(start + " " + end + "\n");

        recur(num-1,mid,start,end);


    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = sc.nextInt();


        recur(N,1,2,3);

        bw.write(String.valueOf(answer));
        bw.newLine();
        bw.write(sb.toString());

        bw.flush();
        bw.close();


    }
}
