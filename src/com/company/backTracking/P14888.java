package com.company.backTracking;

import java.io.*;
import java.util.*;

public class P14888 {

    static int N;
    static int arr[];
    static ArrayList<String> signList = new ArrayList<>();
    static ArrayList<Integer> list = new ArrayList<>();
    static String answerList[];
    static boolean visit[];

    static void dfs(int depth){
        if(depth == N-1){
            int answer = arr[0];
            for(int i=0;i<N-1;i++){
                if(answerList[i].equals("plus")){
                    answer += arr[i+1];
                }else if(answerList[i].equals("minus")){
                    answer -= arr[i+1];
                }else if(answerList[i].equals("multiply")){
                    answer *= arr[i+1];
                }else if(answerList[i].equals("divide")){
                    answer /= arr[i+1];
                }
            }
            list.add(answer);

            return;

        }

        for(int i=0;i<N-1;i++){
            if(!visit[i]){
                visit[i] = true;
                answerList[depth] = signList.get(i);
                dfs(depth +1);
                visit[i] = false;
            }
        }


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }

        int plus = sc.nextInt();
        for(int i=0;i<plus;i++){
            signList.add("plus");
        }
        int minus = sc.nextInt();
        for(int i=0;i<minus;i++){
            signList.add("minus");
        }
        int multiply = sc.nextInt();
        for(int i=0;i<multiply;i++){
            signList.add("multiply");
        }
        int divide = sc.nextInt();
        for(int i=0;i<divide;i++){
            signList.add("divide");
        }

        answerList = new String[N-1];
        visit = new boolean[N-1];


        dfs(0);
        Collections.sort(list);

        System.out.println(list.get(list.size()-1));
        System.out.println(list.get(0));

    }
}
