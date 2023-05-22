package com.company.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class P11497 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i=0;i<T;i++){
            int N = sc.nextInt();
            int arr[] = new int[N];
            for(int j=0;j<N;j++){
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            int arr2[] = new int[N];
            int left = 0;
            int right = N-1;

            for(int k=0;k<N;k++){
                if(k%2==0){
                    arr2[left] = arr[k];
                    left++;
                }else{
                    arr2[right] = arr[k];
                    right--;
                }
            }

            int max = 0;
            for(int k=1;k<N;k++){
                max = Math.max(max, Math.abs(arr2[k] - arr2[k-1]));
            }
            max = Math.max(max, Math.abs(arr2[0] - arr2[N-1]));
            System.out.println(max);

        }


    }
}
