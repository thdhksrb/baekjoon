package com.company.greedy;

import java.io.*;
import java.util.*;

public class P19941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(str.nextToken());
        int K = Integer.parseInt(str.nextToken());

        char[] table = new char[N];
        boolean[] check = new boolean[N];

        String input = br.readLine();

        for(int i=0;i<N;i++){
            table[i] = input.charAt(i);
        }

        int count = 0;

        for(int i=0;i<N;i++){
            if(table[i] == 'P'){
                for(int j=i-K;j<=i+K;j++){
                    if(j>=0 && j<=N-1 && table[j] == 'H' && !check[j]){
                        check[j] = true;
                        count++;
                        break;
                    }
                }
            }
        }

        System.out.println(count);

    }
}
