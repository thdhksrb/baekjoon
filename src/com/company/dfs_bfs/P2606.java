package com.company.dfs_bfs;

import java.util.Scanner;

public class P2606 {
    static int map[][];
    static boolean visit[];
    static int count = 0;
    static int computer, linked;

    public static int dfs(int x){
        visit[x] = true;

        for(int i=1;i<=computer;i++){
            if(map[x][i] == 1 && visit[i] == false){
                count++;
                dfs(i);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        computer = sc.nextInt();
        linked = sc.nextInt();

        map = new int[computer+1][computer+1];
        visit = new boolean[computer+1];

        for(int i=0;i<linked;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            map[a][b] = map[b][a] = 1;
        }

        System.out.println(dfs(1));



    }
}
