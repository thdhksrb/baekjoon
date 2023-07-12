package com.company.unclassified;

import java.io.*;
import java.util.*;

public class P2910 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        StringTokenizer input = new StringTokenizer(br.readLine());

        Map<Integer,Integer> map = new LinkedHashMap<>();

        for(int i=0;i<N;i++){
            int num = Integer.parseInt(input.nextToken());
            map.put(num,map.getOrDefault(num,0)+1);

        }

        List<Integer> list = new ArrayList<>(map.keySet());

        Collections.sort(list,new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b){
                return map.get(b).compareTo(map.get(a));
            }
        });

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            Integer element = it.next();
            Integer num = map.get(element);
            for(int i=0;i<num;i++){
                bw.write(element + " ");
            }
        }

        bw.flush();
        bw.close();

    }
}
