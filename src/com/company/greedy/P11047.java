package com.company.greedy;


import java.util.Scanner;

public class P11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int arr[] = new int[N];
        int count = 0;

        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<N;i++){
            if(K>=arr[N-i-1]){
                count += K/arr[N-i-1];
                K %= arr[N-i-1];
            }
        }
        System.out.println(count);

    }
}
