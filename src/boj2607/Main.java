package boj2607;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        int n = Integer.valueOf(br.readLine());
        char[] given = br.readLine().toCharArray();
        int[] givenCount = new int[26];
        for(int i=0; i<given.length; i++) givenCount[(int)given[i]-65]++;

        int count = 0;
        for(int i=0; i<n-1; i++) {
            String input = br.readLine();
            if(Math.abs(input.length() - given.length) > 1) continue;
            char[] charInput = input.toCharArray();
            int[] charCount = new int[26];
            for(int j=0; j<charInput.length; j++) charCount[(int)charInput[j]-65]++;
            int diffSum = 0;
            boolean isSim = true;
            for(int j=0; j<26; j++) {
                if(Math.abs(givenCount[j] - charCount[j]) > 1) {
                    isSim = false;
                    break;
                }
                diffSum += Math.abs(givenCount[j] - charCount[j]);
            }
            if(isSim && diffSum < 3) count++;
        }
        System.out.println(count);
    }
}
