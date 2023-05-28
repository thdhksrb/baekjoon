package com.company.stringSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9935 {    //오답
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String bomb = br.readLine();

        while(str.contains(bomb)){
            str = str.replace(bomb,"");
        }

        if(str.equals("")||str.isEmpty()){
            System.out.println("FRULA");
        }else{
            System.out.println(str);
        }

    }
}
