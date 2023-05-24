package com.company.dfs_bfs;

import java.util.Arrays;
import java.util.Scanner;

public class J1457 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int K = sc.nextInt();

        int squares[][] = new int[K][4];
        for(int i=0;i<K;i++){
            for(int j=0;j<4;j++){
                squares[i][j] = sc.nextInt();
            }
        }

        int paper[][] = new int[M][N];

        //종이에 사각형 기록
        for(int[] square : squares){
            for(int i=square[0];i<square[2];i++){
                for(int j=square[1];j<square[3];j++){
                    paper[j][i] = 1;
                }
            }
        }

        int count = 100;
        for(int x=0;x<M;x++){
            for(int y=0;y<N;y++){
                if(paper[x][y]==0){
                    checker(paper,x,y,count++);
                }
            }
        }

        int result[] = new int[count-100];
        for(int x=0;x<M;x++){
            for(int y=0;y<N;y++){
                int num = paper[x][y];

                if(num != 1){
                    result[count - num - 1]++;
                }
            }
        }

        Arrays.sort(result);
        System.out.println(count - 100);
        for(int i : result){
            System.out.print(i + " ");
        }

    }

    public static void checker(int[][] squares, int x, int y, int count){
        if(x<0 || y<0 || x>=squares.length || y>=squares[0].length){
            return;
        }

        if(squares[x][y] == 0){
            squares[x][y] = count;
            checker(squares,x-1,y,count);
            checker(squares,x+1,y,count);
            checker(squares,x,y-1,count);
            checker(squares,x,y+1,count);
        }

    }
}
