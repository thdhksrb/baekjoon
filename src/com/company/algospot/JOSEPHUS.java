package com.company.algospot;

import java.io.*;
import java.util.*;


public class JOSEPHUS {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tCase = Integer.parseInt(br.readLine());

        StringTokenizer st;
        while(tCase-->0){
            st = new StringTokenizer(br.readLine().trim());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            List<Integer> list = new LinkedList<>();
            for(int i=1;i<=N;i++){
                list.add(i);
            }

            int size = list.size();
            int index = 0;
            while(size-->2){
                list.remove(index);
                index += K-1;
                if(index>size-1){
                    index -= size;
                }
            }

            bw.write(list.get(0) + " " + list.get(1));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
