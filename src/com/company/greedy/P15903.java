package com.company.greedy;

import java.util.PriorityQueue;
import java.util.Scanner;

public class P15903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        long answer = 0;
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for(int i=0;i<n;i++){
            pq.add(sc.nextLong());
        }

        if(m!=0) {
            for (int i = 0; i < m; i++) {
                long num1 = pq.poll();
                long num2 = pq.poll();
                pq.add(num1 + num2);
                pq.add(num1 + num2);
            }
        }


        while(pq.size()!=0){
            answer += pq.poll();
        }
        System.out.println(answer);

    }
}
