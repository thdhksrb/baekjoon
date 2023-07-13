package com.company.unclassified;

import java.io.*;
import java.util.*;

public class P20115 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Double> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            list.add(Double.parseDouble(st.nextToken()));
        }

        Collections.sort(list,Collections.reverseOrder());

        double sum = list.get(0);

        for(int i=1;i<N;i++) {
            sum += list.get(i)/2;
        }

        if(sum*10%10==0){
            long answer = (long)sum;
            System.out.println(answer);
        }else{
            System.out.println(sum);
        }

    }
}
