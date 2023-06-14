package com.company.unclassified;

import java.io.*;
import java.util.*;

public class P1929 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = sc.nextInt();
        int N = sc.nextInt();

        boolean check = false;

        for(int i=M;i<=N;i++){
            if(i==1){
                continue;
            }
            int center = (int)Math.sqrt(i)+1;
            for(int j=2;j<center;j++){
                if(i%j==0){
                    check = true;
                    break;
                }
            }
            if(!check){
                bw.write(String.valueOf(i));
                bw.newLine();
            }
            check = false;
        }

        bw.flush();
        bw.close();

    }
}
