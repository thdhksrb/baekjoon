package com.company.algospot;

import java.io.*;
//분할 정복
// x(bwwb) -> x(wbbw)
// x(bw(x(wbbw))b) -> x(x(bwwb))bbw
// x(xwwwb)(xw(xwbbb)ww)(x(x(xwwbb)bww)wwb)b
// 1234 -> 3412
// x가 나올 때 그 뒤의 4글자를 3412로 바꾼다
public class QUADTREE {

    static String input;
    static int index;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int C = Integer.parseInt(br.readLine());

        while(C-->0){
            input = br.readLine();
            index = 0;
            bw.write(reversePrint());
            bw.newLine();
        }
        bw.flush();
        bw.close();

    }

    ///wbwb

    public static String reversePrint(){
        if(input.charAt(index)!='x'){   // 기저조건 - x가 아니라면 그대로 출력
            return input.charAt(index++) + "";
        }else{
            index++;
            String[] str = new String[4];
            str[0]= reversePrint();
            str[1]= reversePrint();
            str[2]= reversePrint();
            str[3]= reversePrint();
            return "x" + str[2] + str[3] + str[0] + str[1]; // 순서를 1234 -> 3412로 바꾼다
        }
    }
}
