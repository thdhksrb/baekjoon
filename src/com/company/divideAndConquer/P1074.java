package com.company.divideAndConquer;

import java.util.Scanner;

public class P1074 {

    static int solve(int n,int r,int c, int x, int y){
        if(n==1){
            return 2*r + c;
        }
        int half = (int) Math.pow(2,n-1);
        int size = half*half;

        if (r<half && c<half) {
            return solve(n-1, r, c, x, y); //1
        } else if (r<half && c>=half) {
            return size + solve(n-1, r, c-half, x, y+half); //2
        } else if (r>=half && c<half) {
            return 2*size + solve(n-1, r-half, c, x+half, y); //3
        } else {
            return 3*size + solve(n-1, r-half, c-half, x+half, y+half); //4
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();

        int answer = solve(N,r,c,0,0);

        System.out.println(answer);
    }
}
