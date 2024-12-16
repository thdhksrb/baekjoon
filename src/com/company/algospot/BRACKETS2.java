package com.company.algospot;

import java.io.*;
import java.util.*;

public class BRACKETS2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int C = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(C-->0){
            String input = br.readLine();
            String result = checkCorrect(input) ? "YES" : "NO";

            sb.append(result);
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    static boolean checkCorrect(String str){

        Deque<Character> stack = new ArrayDeque<>();

        for(int i=0;i<str.length();i++){
            if(stack.isEmpty() || !match(stack.peek(),str.charAt(i))){
                stack.push(str.charAt(i));
            }else{
                stack.pop();
            }
        }
        return stack.isEmpty();

    }

    static boolean match(char a, char b){
        if(a=='(' && b==')') return true;
        if(a=='{' && b=='}') return true;
        if(a=='[' && b==']') return true;

        return false;
    }
}
