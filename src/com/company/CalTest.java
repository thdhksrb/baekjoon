package com.company;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class CalTest {
    public static void main(String[] args) {
        int[][] arr = {{3,2},{12,5}};

        Arrays.sort(arr, (o1,o2) -> o2[1]- o1[1]);

        for(int[] i : arr){
            for(int j : i){
                System.out.println(j);
            }
        }

    }
}
