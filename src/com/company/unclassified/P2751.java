package com.company.unclassified;

import java.io.*;
import java.util.Arrays;

public class P2751 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int arr[];

        int n = Integer.parseInt(bf.readLine());

        arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(arr);

        for(int num : arr){
            bw.write(Integer.toString(num));
            bw.newLine();
        }

        bw.close();

    }
}
