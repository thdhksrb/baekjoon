package com.company.unclassified;

import java.io.*;
import java.util.*;

public class P1406 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();

        String word = br.readLine();

        for(int i=0;i<word.length();i++){
            leftStack.push(word.charAt(i));
        }

        int M = Integer.parseInt(br.readLine());
        StringTokenizer str;

        for(int i=0;i<M;i++){
            str = new StringTokenizer(br.readLine());
            String input = str.nextToken();

            if(input.equals("P")){ //문자 추가
                char ch = str.nextToken().charAt(0);
                leftStack.push(ch);

            }else if(input.equals("L")){  //왼쪽으로 이동
                if(!leftStack.isEmpty()){
                    char ch = leftStack.pop();
                    rightStack.push(ch);
                }

            }else if(input.equals("D")){ //오른쪽으로 이동
                if(!rightStack.isEmpty()){
                    char ch = rightStack.pop();
                    leftStack.push(ch);
                }

            }else if(input.equals("B")){ //삭제
                if(!leftStack.isEmpty()){

                    leftStack.pop();
                }
            }
        }

        while(!leftStack.isEmpty()){
            rightStack.push(leftStack.pop());
        }
        while(!rightStack.isEmpty()){
            bw.write(rightStack.pop());
        }


        bw.flush();
        bw.close();

    }
}
