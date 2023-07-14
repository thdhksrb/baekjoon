package com.company.unclassified;

import java.io.*;
import java.util.*;

public class P16434 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 방의 개수
        long Hatk = Long.parseLong(st.nextToken());  // 용사 공격력
        long HmaxHP = 0;
        long curHP = 0;

        for(int i=0;i<N;i++){
            StringTokenizer str = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(str.nextToken());
            long a = Long.parseLong(str.nextToken());
            long h = Long.parseLong(str.nextToken());

            if(t==1){
                curHP += (long)(Math.ceil(((double)h/Hatk))-1)*a;
                HmaxHP = Math.max(curHP,HmaxHP);
            }else{
                Hatk += a;
                curHP = Math.max(curHP - h,0);
            }

        }

        System.out.println(HmaxHP + 1);

    }
}
