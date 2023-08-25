package com.company.quiz;

import java.io.*;
import java.util.*;

public class Problem9 {
    public static void main(String[] args) {
        for(int a=1;a<1000;a++){
            for(int b=1;b<1000;b++){
                if(a*a+b*b==(1000-a-b)*(1000-a-b)){
                    System.out.println(a*b*(1000-a-b));
                    return;
                }
            }
        }

    }
}
