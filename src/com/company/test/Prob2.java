package com.company.test;

import java.io.*;
import java.util.*;

public class Prob2 {

    static Map<String,Integer> map = new LinkedHashMap<>();
    static List<String> list = new ArrayList<>();
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static void enqueue(String s){
        map.put(s,map.getOrDefault(s,0)+1);
        list.add(s);
    }
    static void dequeue() throws IOException {

        String max = null;
        int maxNum = 1;

        if(list.isEmpty()){
            bw.write("*");
            bw.newLine();
        }else{
            for(Map.Entry<String,Integer> entry : map.entrySet()){
                String key = entry.getKey();
                int num = entry.getValue();

                if(num>maxNum){
                    max = key;
                    maxNum = num;
                }

            }
            if(max!=null){
                bw.write(max);
                map.remove(max);
                list.remove(max);
            }else{
                bw.write(list.get(0));
                list.remove(0);
                map.remove(list.get(0));

            }

            bw.newLine();
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            String method = st.nextToken();
            String alpha = "";
            if(st.hasMoreTokens()){
                alpha = st.nextToken();
            }

            if(method.equals("enqueue")){
                enqueue(alpha);
            }else if(method.equals("dequeue")){
                dequeue();
            }


        }
        bw.flush();
        bw.close();


    }
}
