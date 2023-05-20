package com.company.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class P2217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int ropeNum = N;
        int arr[] = new int[N];
        int sum[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int i=0;i<N;i++){
            sum[i] = arr[i]*ropeNum;
            ropeNum--;
        }

        Arrays.sort(sum);
        System.out.println(sum[N-1]);


    }
}
