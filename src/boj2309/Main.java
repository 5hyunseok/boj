package boj2309;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        int[] heights = new int[9];
        for(int i=0; i<9; i++) heights[i] = Integer.valueOf(br.readLine());
        Arrays.sort(heights);
        int[] remove = new int[2];

        wholeLoop:
        for(int i=0; i<9; i++) {
            for(int j=i+1; j<9; j++) {
                int sum = 0;
                for(int k=0; k<9; k++) if (k != i && k != j) sum += heights[k];
                if(sum == 100) {
                    remove[0] = i;
                    remove[1] = j;
                    break wholeLoop;
                }
            }
        }

        for(int i=0; i<9; i++) if (i != remove[0] && i != remove[1]) System.out.println(heights[i]);
    }
}
