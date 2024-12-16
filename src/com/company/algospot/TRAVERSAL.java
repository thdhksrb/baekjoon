package com.company.algospot;

import java.io.*;
import java.util.*;

//preorder  27 16 9 12 54 36 72
//inorder   9 12 16 27 36 54 72
//  preorder 첫번째 기준(root) 9 12 16 는 왼쪽  36 54 72는 오른쪽
//  9 12 16 중 16이 루트
//postorder

public class TRAVERSAL {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int C = Integer.parseInt(br.readLine());

        StringTokenizer st1;
        StringTokenizer st2;
        while(C-->0){
            int N = Integer.parseInt(br.readLine());

            List<Integer> preOrder = new ArrayList<>();
            List<Integer> inOrder = new ArrayList<>();
            st1 = new StringTokenizer(br.readLine());
            st2 = new StringTokenizer(br.readLine());
            for(int i=0; i<N; i++){
                preOrder.add(Integer.parseInt(st1.nextToken()));
                inOrder.add(Integer.parseInt(st2.nextToken()));
            }

            List<Integer> postOrder = getPostOrder(preOrder, inOrder);

            for(int i : postOrder){
                bw.write(String.valueOf(i) + " ");
            }
            bw.newLine();

        }
        bw.flush();
        bw.close();


    }

    static List<Integer> getPostOrder(List<Integer> preOrder, List<Integer> inOrder){


        if(preOrder.size()==0 || inOrder.size()==0) return new ArrayList<>();
        int root = preOrder.get(0);
        int rootIndex = inOrder.indexOf(Integer.valueOf(root));


        List<Integer> left = inOrder.subList(0,rootIndex);
        List<Integer> right = inOrder.subList(rootIndex+1,inOrder.size());

        List<Integer> newList = new ArrayList<>();

        if(left.size()<=1){
            newList.addAll(left);
        }else{
            newList.addAll(getPostOrder(preOrder.subList(1,left.size()+1),left));
        }

        if(right.size()<=1){
            newList.addAll(right);
        }else{
            newList.addAll(getPostOrder(preOrder.subList(left.size()+1,preOrder.size()),right));
        }

        newList.add(root);

        return newList;


    }
}
