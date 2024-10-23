package com.company.unclassified;

import java.io.*;
import java.util.*;

public class P10972 {

    static int[] arr;
    static int N;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        arr = new int[N];

        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int pivot = findPivot(); // 2
        int change = pivot+1;

        for(int i=pivot+1;i<N;i++){
            if(arr[i]>arr[pivot]){
                if(arr[change]>arr[i]){
                    change = i;
                }
            }
        }

        int temp = arr[pivot];
        arr[pivot] = arr[change];
        arr[change] = temp;

        StringBuilder sb = new StringBuilder();

        int[] arr2 = Arrays.copyOfRange(arr,pivot+1,N);
        Arrays.sort(arr2);

        for(int i=0;i<=pivot;i++){
            sb.append(arr[i] + " ");
        }
        for(int i : arr2){
            sb.append(i + " ");
        }
        sb.delete(sb.length()-1,sb.length());

        System.out.println(sb.toString());

    }

    static int findPivot(){

        int pivot = -1;

        for(int i=N-1;i>=1;i--){
            if(arr[i-1]<arr[i]){
                pivot = i-1;
                break;
            }
        }
        if(pivot == -1){
            System.out.println("-1");
            System.exit(0);
        }

        return pivot;
    }


}
