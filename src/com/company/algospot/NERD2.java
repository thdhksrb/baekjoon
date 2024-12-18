package com.company.algospot;

import java.io.*;
import java.util.*;

// 살아 남은 것은 우하향 곡선을 그림
public class NERD2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int C = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while(C-->0){
            int N = Integer.parseInt(br.readLine());
            TreeMap<Integer,Integer> map = new TreeMap<>();

            int sum = 0;
            for(int i=0;i<N;i++){
                st = new StringTokenizer(br.readLine());
                int p = Integer.parseInt(st.nextToken());
                int q = Integer.parseInt(st.nextToken());

                if(i==0){
                    map.put(p,q);
                    sum++;
                    continue;
                }
                Integer key = map.higherKey(p);  // p보다 오른쪽 있는 키중 가작 작은

                if(key == null){
                    map.put(p,q);
                }else{
                    if(q>map.get(key)){
                        map.put(p,q);
                    }
                }
                Set<Integer> keySet = map.headMap(p).keySet();
                Set<Integer> newSet = new HashSet<>(keySet);   // keySet 그대로 remove 시 map 자료 구조 영향
                for (int j : newSet) {
                    if (map.get(j) < q) {
                        map.remove(j);
                    }
                }
                sum += map.size();
            }
            bw.write(String.valueOf(sum));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
