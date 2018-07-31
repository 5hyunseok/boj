package boj10798;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        String[] input = new String[5];
        int maxLength = -1;
        for(int i=0; i<5; i++) {
            input[i] = br.readLine();
            if(maxLength < input[i].length()) maxLength = input[i].length();
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<maxLength; i++) {
            for(int j=0; j<5; j++) {
                if(input[j].length() > i) sb.append(input[j].charAt(i));
            }
        }

        System.out.println(sb.toString());
    }
}