package com.company.unclassified;

import java.util.*;
import java.io.*;

public class P4673 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean check[] = new boolean[100000];

        int num = 1;

        while(num<10000){

            if(num<10){
                check[num + num] = true;
            }else if(num<100){
                check[num + num%10 + num/10] = true;
            }else if(num<1000){
                check[num + num%10 + num/10%10 + num/100%10] = true;
            }else{
                check[num + num%10 + num/10%10 + num/100%10 + num/1000%10] = true;
            }

            num++;
        }

        for(int i=1;i<10000;i++){
            if(!check[i]){
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();

    }
}
