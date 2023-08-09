package com.company.unclassified;

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        int[][] arr = {{456,526},{324,222},{324,21}};

        Arrays.sort(arr,(s1,s2) -> s1[0]==s2[0] ? s1[1]-s2[1] : s1[0]-s2[0]);

        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

