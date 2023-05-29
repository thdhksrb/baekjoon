package com.company.implementation;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class P11723 {
    static Set<String> set = new HashSet<>();
    static BufferedWriter bw;

    static void add(String x){
        set.add(x);
    }

    static void remove(String x){
        set.remove(x);
    }
    static void check(String x) throws IOException {
        if(set.contains(x)){
            bw.write("1");
            bw.newLine();
        }else{
            bw.write("0");
            bw.newLine();
        }
    }
    static void toggle(String x){
        if(set.contains(x)){
            set.remove(x);
        }else{
            set.add(x);
        }
    }
    static void all(){
        for(int i=1;i<=20;i++){
            set.add(String.valueOf(i));
        }
    }
    static void empty(){
        set.clear();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int M = Integer.parseInt(br.readLine());
        for(int i=0;i<M;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            String str = st.nextToken();
            if(st.hasMoreTokens()){
                String num = st.nextToken();

                if(str.equals("add")){
                    add(num);
                }else if(str.equals("check")){
                    check(num);
                }else if(str.equals("remove")){
                    remove(num);
                }else if(str.equals("toggle")){
                    toggle(num);
                }
            }else{
                if(str.equals("all")){
                    all();
                }else if(str.equals("empty")){
                    empty();
                }
            }


        }
        bw.flush();
        bw.close();


    }
}
