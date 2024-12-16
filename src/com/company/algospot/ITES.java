package com.company.algospot;

import java.io.*;

public class ITES {
    static long[] A;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int C = Integer.parseInt(br.readLine());
        while (C-- > 0) {
            String[] input = br.readLine().split(" ");
            long K = Long.parseLong(input[0]);
            int N = Integer.parseInt(input[1]);
            A = new long[N];
            createInput(N);

            int startIndex = 0, endIndex = 0, answer = 0;
            long sum = 0;
            while (endIndex < N) {
                if (sum < K) {
                    sum += A[endIndex++];
                } else {
                    if (sum == K) answer++;
                    sum -= A[startIndex++];
                }
            }
            bw.write(String.valueOf(answer));
            bw.newLine();

        }
        bw.flush();
        bw.close();


    }

    static void createInput(int N){

        long num = 1983;

        for (int i = 0; i < N; i++) {
            A[i] = num % 10000 + 1;
            num = (num * 214013 + 2531011) % (1L << 32);
        }

    }
}
