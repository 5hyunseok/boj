package boj1157;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        int[] count = new int[26];
        String input = br.readLine().toLowerCase();
        for(int i=0; i<input.length(); i++) count[((int) input.charAt(i) - 97)]++;

        int maxIndex = -1;
        int maxCount = -1;
        for(int i=0; i<26; i++) {
            if(maxCount < count[i]) {
                maxCount = count[i];
                maxIndex = i;
            }
        }
        int howManyMax = 0;
        for(int i=0; i<26; i++) if (count[i] == maxCount) howManyMax++;
        if(howManyMax > 1) System.out.println("?");
        else System.out.println((char)(maxIndex + 97 - 32));
    }
}
