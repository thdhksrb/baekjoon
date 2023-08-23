package com.company.collectionFramework;

import java.io.*;
import java.util.*;

public class P22233 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(str.nextToken());
        int M = Integer.parseInt(str.nextToken());

        Set<String> memo = new HashSet<>();


        for(int i=0;i<N;i++){
            memo.add(br.readLine());
        }

        for(int i=0;i<M;i++){
            String[] blog = br.readLine().split(",");
            for(int j=0;j<blog.length;j++){
                memo.remove(blog[j]);
            }
            System.out.println(memo.size());
        }
    }
}
