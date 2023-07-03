package com.company.implementation;

import java.io.*;
import java.util.*;

public class P5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        exit:
        for(int i=0;i<T;i++){
            String func = br.readLine();
            int length = Integer.parseInt(br.readLine());

            Deque<Integer> deque = new LinkedList<>();

            StringTokenizer st = new StringTokenizer(br.readLine(),"[],");

            for(int j=0;j<length;j++){
                deque.add(Integer.parseInt(st.nextToken()));
            }
            boolean reverseFlag = false;

            for(int k=0;k<func.length();k++){
                if(func.charAt(k)=='R'){
                    reverseFlag = !reverseFlag;
                }else if(func.charAt(k)=='D'){
                    if(deque.isEmpty()){
                        bw.write("error");
                        bw.newLine();
                        continue exit;
                    }else if(reverseFlag){
                        deque.removeLast();
                    }else{
                        deque.removeFirst();
                    }

                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            int size = deque.size();
            if(reverseFlag){
                for(int k=0;k<size-1;k++){
                    sb.append(deque.pollLast())
                            .append(",");
                }
                if(!deque.isEmpty()) {
                    sb.append(deque.pollFirst());
                }
            }else{
                for(int k=0;k<size-1;k++){
                    sb.append(deque.pollFirst())
                            .append(",");
                }
                if(!deque.isEmpty()) {
                    sb.append(deque.pollLast());
                }
            }
            sb.append("]");
            bw.write(String.valueOf(sb));
            bw.newLine();

        }

        bw.flush();
        bw.close();
    }
}
