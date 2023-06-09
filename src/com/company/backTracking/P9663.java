package com.company.backTracking;

import java.io.*;
import java.util.*;

public class P9663 {
    static int N;
    static int arr[];
    static int count = 0;

    static void dfs(int depth){
        if(depth == N){
            count++;
            return;
        }
        for(int i=0;i<N;i++){
            arr[depth] = i;
            if(check(depth)){
                dfs(depth+1);
            }
        }


    }

    static boolean check(int depth){
        for(int i=0;i<depth;i++){
            if(arr[i] == arr[depth]){
                return false;
            }else if(Math.abs(arr[depth] - arr[i]) == Math.abs(depth - i)){
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        arr = new int[N];

        dfs(0);

        System.out.println(count);

    }
}
