package com.company.unclassified;

import java.io.*;
import java.util.*;

public class P1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        Integer arr[] = new Integer[str.length()];

        for(int i=0;i<arr.length;i++){
            arr[i] = str.charAt(i) - '0';
        }

        Arrays.sort(arr,Collections.reverseOrder());

        for(int i : arr){
            bw.write(String.valueOf(i));
        }
        bw.flush();
        bw.close();

    }
}
