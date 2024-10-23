package com.company.unclassified;

import java.util.*;

public class P1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int answer = 0;

        sc.nextLine();

        for(int i=0;i<n;i++){
            answer += check(sc.nextLine());
        }

        System.out.println(answer);

    }

    public static int check(String word){
        List<Character> list = new ArrayList<>();
        Set<Character> set = new HashSet<>();

        list.add(word.charAt(0));
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)!=word.charAt(i-1)){
                list.add(word.charAt(i));
            }
        }

        for(int i=0;i<list.size();i++){
            set.add(list.get(i));
        }

        if(list.size()==set.size()){
            return 1;
        }else{
            return 0;
        }

    }

}


