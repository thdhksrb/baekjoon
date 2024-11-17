package com.company.algospot;

import java.io.*;
import java.util.*;
//분할정복
public class FENCE {

    static int[] arr;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int C = Integer.parseInt(br.readLine());
        StringTokenizer st;

        while(C-->0){
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            arr = new int[N];

            for(int i=0;i<N;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            bw.write(String.valueOf(solve(0,N-1)));
            bw.newLine();

        }
        bw.flush();
        bw.close();
    }

    static int solve(int start, int end){

        if(start==end){
            return arr[start];                    //기저조건
        }

        int mid = (start + end)/2;
        int left = solve(start,mid);              //최대 크기가 있는 구간이 왼쪽에 있을 때
        int right = solve(mid+1,end);             //최대 크기가 있는 구간이 오른쪽에 있을 때

        int answer = Math.max(left,right);

        int leftIdx = mid;                        //걸치는 부분
        int rightIdx = mid + 1;
        int height = Math.min(arr[leftIdx],arr[rightIdx]);

        answer = Math.max(answer,height*2);       //왼쪽 한개 오른쪽 한개 걸칠 때 answer에 사전 입력

        while(start < leftIdx || rightIdx < end){   //idx가 밖으로 나갈때 까지 루프
            // arr[leftIdx-1]<arr[rightIdx+1] => 오른쪽이 클때
            // 크지 않다면 왼쪽이 끝까지 도달 했을 때
            // (rightIdx<end) 루프 조건에 있는데 넣은 이유: 오른쪽이 더 커도 다 찼는지 조건을 한번 더 체크
            if((rightIdx<end) && (leftIdx==start || arr[leftIdx-1]<arr[rightIdx+1])){
                rightIdx++;
                height = Math.min(height,arr[rightIdx]);
            }else{
                leftIdx--;
                height = Math.min(height,arr[leftIdx]);
            }
            answer = Math.max(answer, height*(rightIdx-leftIdx+1));
        }

        return answer;
    }
}