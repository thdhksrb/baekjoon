package com.company.implementation;

import java.io.*;
import java.util.*;

public class P13335 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 트럭 수
        int w = Integer.parseInt(st.nextToken()); // 다리 길이
        int L = Integer.parseInt(st.nextToken()); // 최대 하중

        StringTokenizer str = new StringTokenizer(br.readLine());

        Queue<Integer> bridge = new LinkedList<Integer>();
        Queue<Integer> truck = new LinkedList<Integer>();
        int weight = 0;
        int time = 0;

        for(int i=0;i<n;i++){
            truck.add(Integer.parseInt(str.nextToken()));
        }

        for(int i=0;i<w;i++){
            bridge.add(0);
        }

        while(!truck.isEmpty()){
            weight -= bridge.poll();

            if(weight+truck.peek()<=L){
                weight += truck.peek();
                bridge.add(truck.poll());
            }else{
                bridge.add(0);
            }
            time++;

        }
        time += w;

        System.out.println(time);

    }
}
