package com.company.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Integer arrA[] = new Integer[N];
        Integer arrB[] = new Integer[N];
        int sum = 0;

        for(int i=0;i<N;i++){
            arrA[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++){
            arrB[i] = sc.nextInt();
        }

        Arrays.sort(arrA);
        Arrays.sort(arrB, Collections.reverseOrder());

        for(int i=0;i<N;i++){
            sum += arrA[i]*arrB[i];
        }

        System.out.println(sum);

    }
}
