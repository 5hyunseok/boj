package boj2578;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        int[] bingoBoard = new int[25+1];
        boolean[] marked = new boolean[25+1];
        for(int i=0; i<5; i++) {
            String[] input = br.readLine().split(" ");
            for(int j=1; j<6; j++) bingoBoard[5 * i + j] = Integer.valueOf(input[j-1]);
        }

        int[] mcSay = new int[25+1];
        for(int i=0; i<5; i++) {
            String[] input = br.readLine().split(" ");
            for(int j=1; j<6; j++) mcSay[5 * i + j] = Integer.valueOf(input[j-1]);
        }

        for(int i=1; i<26; i++) {
            for(int j=1; j<26; j++) {
                if(mcSay[i] == bingoBoard[j]) {
                    marked[j] = true;
                    break;
                }
            }

            //check
            int howManyBingo = 0;
            for(int j=0; j<5; j++) {
                boolean bingo = true;
                for(int k=1; k<6; k++) {
                    if(!marked[5*j + k]) bingo = false;
                }
                if(bingo) howManyBingo++;
            }
            for(int j=0; j<5; j++) {
                boolean bingo = true;
                for(int k=1; k<6; k++) {
                    if(!marked[5*(k-1) + (j+1)]) bingo = false;
                }
                if(bingo) howManyBingo++;
            }
            boolean bingo = true;
            for(int j=0; j<5; j++) {
                if(!marked[6*j+1]) bingo = false;
            }
            if(bingo) howManyBingo++;
            bingo = true;
            for(int j=0; j<5; j++) {
                if(!marked[4*j+5]) bingo = false;
            }
            if(bingo) howManyBingo++;
            if(howManyBingo >= 3) {
                System.out.println(i);
                break;
            }
        }
    }
}
