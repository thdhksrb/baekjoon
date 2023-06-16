package com.company.unclassified;

import java.util.*;

public class P2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();

        for(int i=1;i<=N;i++){
            q.add(i);
        }

        while(true){
            int num1 = q.poll();
            if(q.isEmpty()){
                System.out.println(num1);
                break;
            }
            int num2 = q.poll();
            if(q.isEmpty()){
                System.out.println(num2);
                break;
            }
            q.add(num2);
        }

    }
}
