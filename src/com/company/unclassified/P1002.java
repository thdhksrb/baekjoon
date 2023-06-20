package com.company.unclassified;

import java.io.*;
import java.util.*;

public class P1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());


            int length = (int)((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)); // 제곱 형태 double == 비교 불가

            if(x1==x2 && y1==y2 && r1==r2){
                if(r1==0){
                    bw.write("1");
                }else{
                    bw.write("-1");
                }
            }else if(length > Math.pow((r1+r2),2)){  //만나지 않을 때
                bw.write("0");
            }else if(length < Math.pow((r2-r1),2)){ //한 원이 안에 있을 때
                bw.write("0");
            }else if(length == Math.pow((r2-r1),2)){ //내접할 때
                bw.write("1");
            }else if(length == Math.pow((r1+r2),2)){ //외접할 때
                bw.write("1");
            }else{
                bw.write("2");
            }

            bw.newLine();


        }
        bw.flush();
        bw.close();


    }
}
