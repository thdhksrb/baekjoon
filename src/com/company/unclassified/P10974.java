package com.company.unclassified;

import java.util.*;

public class P10974 {

    static int N;
    static int[] output;
    static int[] num;
    static boolean[] visit;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        output = new int[N];
        num = new int[N];
        visit = new boolean[N];

        for(int i=0;i<N;i++){
            num[i] = i+1;
        }

        dfs(0);


    }

    static void dfs(int length){

        if(length==N){
            for(int number :output){
                System.out.print(number + " ");
            }
            System.out.println();
            return;
        }

        for(int i=0;i<N;i++){

            if(visit[i]){
                continue;
            }else{
                output[length] = num[i];
                visit[i] = true;
                dfs(length+1);
                visit[i] = false;
            }


        }
    }
}
