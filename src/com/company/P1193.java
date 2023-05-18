package com.company;

import java.util.Scanner;

public class P1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int num = 1;  //분모
        for(int i=1;;i++){
            x -= i;
            if(x<=0){
                x += i;
                break;
            }
            num += 1;
        }

        if(num%2==0){
            System.out.println(x+"/"+(num-x+1));
        }else{
            System.out.println((num-x+1)+"/"+x);
        }



    }
}
