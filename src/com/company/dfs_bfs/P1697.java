package com.company.dfs_bfs;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P1697 {
    static int N,K;
    static boolean visit[];
    static int map[];

    static int bfs(int x){

        Queue<Integer> queue = new LinkedList<>();

        visit[x] = true;
        queue.add(x);
        while(!queue.isEmpty()){
            if(visit[K]){
                return map[K];
            }
            int index = queue.poll();
            if(index+1<=100000 && !visit[index+1]){
                map[index+1] = map[index] + 1;
                visit[index+1] = true;
                queue.add(index+1);
            }
            if(index-1>=0 && !visit[index-1]){
                map[index-1] = map[index] + 1;
                visit[index-1] = true;
                queue.add(index-1);
            }
            if(index*2<=100000 && !visit[index*2]){
                map[index*2] = map[index] + 1;
                visit[index*2] = true;
                queue.add(index*2);
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        K = sc.nextInt();
        map = new int[100001];
        visit = new boolean[100001];
        Arrays.fill(map,0);

        int answer = bfs(N);
        System.out.println(answer);

    }
}
