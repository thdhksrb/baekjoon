package com.company.stringSearch;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String,String> map = new HashMap<>();

        for(int i=0;i<N;i++){
            StringTokenizer str = new StringTokenizer(br.readLine());
            map.put(str.nextToken(),str.nextToken());
        }

        for(int i=0;i<M;i++){
            bw.write(map.get(br.readLine()));
            bw.newLine();
        }
        bw.flush();
        bw.close();



    }
}
