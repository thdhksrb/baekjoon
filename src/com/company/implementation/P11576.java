package com.company.implementation;

import java.io.*;
import java.util.*;

public class P11576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());

        StringTokenizer str = new StringTokenizer(br.readLine());

        int arr[] = new int[m];

        for(int i=0;i<m;i++){
            arr[i] = Integer.parseInt(str.nextToken());
        }

        int num = 0;
        int n = m-1;

        for(int i=0;i<m;i++){
            num += (int)(arr[i]* Math.pow(A,n--));
        }

        int firstNum;
        int length = 0; //자리수

        int temp1 = num;

        while(true){
            firstNum = (temp1/B);
            if(firstNum==0){
                break;
            }
            length++;
            temp1 = firstNum;
        }

        int answer[] = new int[length+1];
        int temp2 = length;

        for(int i=0;i<length;i++){
            answer[i] = (int)(num/Math.pow(B,temp2));
            num -= answer[i]*(int)Math.pow(B,temp2);
            temp2--;
        }
        answer[length] = num;


        for(int i : answer){
            System.out.print(i + " ");
        }

    }
}
