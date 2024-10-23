package com.company.unclassified;

import java.io.*;
import java.util.*;

public class P11651 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] arr= new int[N][2];

        for(int i=0;i<N;i++){
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            for(int j=0;j<2;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }

        }

        Arrays.sort(arr, (o1,o2) -> {

            return o1[1] == o2[1] ? o1[0] -o2[0] : o1[1]-o2[1];
        });

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int[] outputArr : arr){
            for(int output : outputArr){

                bw.write(output+"");
                bw.write(" ");
            }
            bw.newLine();

        }

        bw.flush();
        bw.close();



    }
}
