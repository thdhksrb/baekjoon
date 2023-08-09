package com.company.unclassified;

import java.util.*;

public class SynapSoft5 {
    public static void main(String[] args) {
        String input = "0, 0, 1";    //입력
        String[] str = input.split(", ");
        List<Integer> number = new LinkedList<>();    //값 삭제를 자주하므로 링크드리스트 사용
        int sum = 0;

        for(int i=0;i<str.length;i++){
            number.add(Integer.parseInt(str[i]));
        }

        Collections.sort(number);

        int maxLength = 0;   // 두 자연수 중 최대 길이
        boolean even = true; // 입력 전체길이가 짝수일 때

        if(str.length%2==1){
            maxLength = str.length/2+1;
            even = false;
        }else{
            maxLength = str.length/2;
        }

        int zero = 0;        // 0의 개수

        for(int num : number){
            if(num == 0){
                zero++;
            }
        }

        maxLength--;

        if(str.length - zero < 2){
            System.out.println(-1);
            System.exit(0);
        }else{
            if(even){                             // 전체 길이가 짝수일때
                sum += Math.pow(10,maxLength)*number.get(zero);    // 합을 구하는 문제이므로 자리수가 같다면 상관이 없음 -> 자연수 두개로 나누지 않고 더함
                number.remove(zero);
                sum += Math.pow(10,maxLength--)*number.get(zero);
                number.remove(zero);
                while(!number.isEmpty()){
                    sum += Math.pow(10,maxLength)*number.get(0);
                    number.remove(0);
                    sum += Math.pow(10,maxLength--)*number.get(0);
                    number.remove(0);
                }
            }else{                                // 전체 길이가 홀수일때
                sum += Math.pow(10,maxLength--)*number.get(zero);
                number.remove(zero);
                sum += Math.pow(10,maxLength)*number.get(zero);
                number.remove(zero);
                while(!number.isEmpty()){
                    sum += Math.pow(10,maxLength--)*number.get(0);
                    number.remove(0);
                    if(!number.isEmpty()) {
                        sum += Math.pow(10, maxLength) * number.get(0);
                        number.remove(0);
                    }
                }

            }
        }
        System.out.println(sum);
    }
}
