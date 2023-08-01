package com.company.unclassified;

import java.io.*;
import java.util.*;

public class P1092 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer str = new StringTokenizer(br.readLine());

        int crane[] = new int[N];
        List<Integer> box = new ArrayList<>();
        for(int i=0;i<N;i++){
            crane[i] = Integer.parseInt(str.nextToken());
        }

        int M = Integer.parseInt(br.readLine());

        str = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            box.add(Integer.parseInt(str.nextToken()));
        }

        Arrays.sort(crane);
        Collections.sort(box,Collections.reverseOrder());

        int time = 0;

        if(crane[N-1]<box.get(0)){
            System.out.println(-1);
            System.exit(0);
        }
        while(!box.isEmpty()){
            for(int i=N-1;i>=0;i--){
                if(box.isEmpty()){
                    break;
                }
                for (int j=0; j<box.size(); j++) {
                    if (crane[i] >= box.get(j)) {
                        box.remove(j);
                        break;
                    }
                }

            }
            time++;

        }
        System.out.println(time);

    }
}
