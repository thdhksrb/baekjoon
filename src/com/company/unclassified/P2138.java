package com.company.unclassified;

import java.io.*;

// 모든 arr 를 1 로 만드는 걸 count
public class P2138 {    //clocksync 비슷한 유형
    static int[] arr;   //전구 상태
    static int MIN = Integer.MAX_VALUE;
    static int N;
    static int[] dx = {-1,0,1};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        String target = br.readLine();

        arr = new int[N];
        for(int i=0;i<N;i++){
            if(input.charAt(i)==target.charAt(i)){
                arr[i] = 1;                         //같을땐 1
            }else{
                arr[i] = 0;                         //다를땐 0 -> arr모두 1로 바꾸기
            }
        }
        solve(0,0);

        int answer = (MIN == Integer.MAX_VALUE) ? -1 : MIN;
        System.out.println(answer);

    }
    static void solve(int idx, int cnt){
        if(isAnswer()){
            MIN = Math.min(MIN,cnt);
            return;
        }
        if(idx>N-1) return;

        for(int i=0;i<2;i++){
            solve(idx+1,cnt+i);

            for(int j=0;j<3;j++){
                int cx = idx + dx[j];
                if(cx>=0 && cx<N){
                    arr[cx] = (arr[cx] == 1) ? 0 : 1;
                }
            }

        }

    }

    static boolean isAnswer(){    // 모든 전구(arr)가 1일 때 답
        for(int i : arr){
            if(i!=1) return false;
        }
        return true;
    }
}
