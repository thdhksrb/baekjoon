package com.company.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class P11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        int sum = 0;
        int sum2 = 0;

        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int i=0;i<N;i++){
            sum2 += arr[i];
            sum += sum2;
        }

        System.out.println(sum);
    }
}
