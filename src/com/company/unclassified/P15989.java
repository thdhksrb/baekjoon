package com.company.unclassified;

import java.io.*;
import java.util.*;

public class P15989 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            int n = sc.nextInt();
            int answer = 0;
            for(int x=0;x<=n/3;x++){
                for(int y=0;y<=n/2;y++){
                    if(3*x+2*y<=n){
                        answer++;
                    }
                }
            }
            System.out.println(answer);
        }
    }
}
