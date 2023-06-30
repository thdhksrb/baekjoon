package com.company.unclassified;

import java.io.*;
import java.util.*;

public class P11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();

        for(int i=1;i<=N;i++){
            q.add(i);
        }

        int arr[] = new int[N];
        int sequence = 0;
        while(!q.isEmpty()){
            for(int i=1;i<=K-1;i++){
                q.add(q.poll());
            }
            arr[sequence++] = q.poll();

        }

        System.out.print("<");
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length-1]);
        System.out.print(">");

    }
}
