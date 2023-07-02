package com.company.implementation;

import java.io.*;
import java.util.*;

public class P17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        char[] arr = new char[input.length()];
        char[] answer = new char[input.length()];
        int start,last;

        for(int i=0;i<input.length();i++){
            arr[i] = input.charAt(i);
        }

        for(int i=0;i<input.length();i++){

            if(arr[i]==' '){
                answer[i] = arr[i];
                continue;
            }else if(arr[i]=='<'){
                while(i<input.length()){
                    answer[i] = arr[i];
                    if(arr[i] == '>'){
                        break;
                    }
                    i++;
                }

            }else{
                start = i;
                while(i<input.length() && arr[i] != '<' && arr[i] != ' '){
                    i++;
                }
                i--;
                last = i;
                int temp = last;
                for(int j=start;j<=last;j++){
                    answer[j] = arr[temp--];
                }
            }

        }

        for(char ch : answer){
            System.out.print(ch);
        }


    }
}
