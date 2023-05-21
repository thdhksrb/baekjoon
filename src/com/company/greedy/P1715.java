package com.company.greedy;

import java.util.PriorityQueue;
import java.util.Scanner;

public class P1715 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int count = 0;

        for(int i=0;i<N;i++){
            pq.add(sc.nextInt());
        }

        if(N==1){
            count = 0;
        }else{
            while(pq.size()>1){
                int num1 = pq.poll();
                int num2 = pq.poll();
                count += num1 + num2;
                pq.add(num1+num2);
            }
        }
        System.out.println(count);
    }
}
