package boj2590;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        int[] num = new int[6+1];
        for(int i=1; i<6+1; i++) num[i] = Integer.valueOf(br.readLine());

        int numOfBoard = 0;
        int[] remainder = new int[3+1];

        // 6개짜리
        for(int i=0; i<num[6]; i++) numOfBoard++;

        // 5개짜리
        for(int i=0; i<num[5]; i++) {
            numOfBoard++;
            remainder[1] += 11;
        }

        // 4개짜리
        for(int i=0; i<num[4]; i++) {
            numOfBoard++;
            remainder[2] += 5;
        }

        // 3개짜리
        int i = num[3];
        int numOfThree = 0;
        while(i > 0) {
            if(numOfThree == 0) numOfBoard++;
            numOfThree++;
            if(numOfThree == 4) {
                numOfThree = 0;
            }
            i--;
        }
        if(numOfThree == 1) {
            remainder[2] += 5;
            remainder[1] += 7;
        } else if(numOfThree == 2) {
            remainder[2] += 3;
            remainder[1] += 6;
        } else if(numOfThree == 3) {
            remainder[2] += 1;
            remainder[1] += 5;
        }

        // 2개짜리
        i = num[2];
        while(i > 0) {
            if(remainder[2] < 1) {
                numOfBoard++;
                remainder[2] += 9;
            }
            remainder[2]--;
            i--;
        }

        // 1개짜리
        i = num[1];
        for(int j=2; j<3+1; j++) remainder[1] += remainder[j] * j * j;
        while(i > 0) {
            if(remainder[1] < 1) {
                numOfBoard++;
                remainder[1] += 36;
            }
            remainder[1]--;
            i--;
        }

        System.out.println(numOfBoard);
    }
}