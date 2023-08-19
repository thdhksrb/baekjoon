package com.company.quiz;

import java.io.*;
import java.util.*;

public class SynapSoft1 {
    public static int Solve(int number){ // 각자리수 제곱합 구하기

        int sum = 0;
        while(number!=0){
            sum += (number%10)*(number%10);
            number/=10;
        }


        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        Set<Integer> set = new HashSet<>();
        int answer = 0;  //개수
        int sum = 0;     //합

        for(int i=1;i<=input;i++){
            Set<Integer> tempSet = new HashSet<>();
            int startNum = i;
            int num = i;
            while(true){
                if(tempSet.contains(num)||set.contains(num)){
                    set.add(i);
                    break;
                }
                tempSet.add(num);
                num = Solve(num);
                if(num==1){
                    sum += i;
                    answer++;
                    break;
                }
                if(num==startNum){
                    set.add(i);
                    break;
                }
            }
        }

        System.out.println(answer);
        System.out.println(sum);


    }

}
