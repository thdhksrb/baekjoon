package com.company.algospot;

import java.io.*;
import java.util.BitSet;

public class FANMEETING { //비트연산 - 시간초과  bitSet

    static BitSet bitGroup, bitFan;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int C = Integer.parseInt(br.readLine());

        while(C-->0){

            int count = 0;
            String group = br.readLine();
            String fan = br.readLine();

            bitGroup = new BitSet(group.length());
            bitFan = new BitSet(fan.length());

            for(int i=0;i<group.length();i++){
                if(group.charAt(i)=='M'){
                    bitGroup.set(i);
                }
            }
            for(int i=0;i<fan.length();i++){
                if(fan.charAt(i)=='M'){
                    bitFan.set(i);
                }
            }


            for(int i=0;i<fan.length()-group.length()+1;i++){
                BitSet temp = (BitSet)bitFan.clone();
                temp.and(bitGroup);
                if(temp.cardinality()==0) {
                    count++;
                }
                rightShift();
            }
            System.out.println(count);
        }
    }

    static void rightShift(){
        for(int i=bitFan.size()-1;i>0;i--){
            bitFan.set(i,bitFan.get(i-1));
        }
        bitFan.set(0,false);
    }
}
