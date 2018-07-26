package boj1427;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        char[] input = br.readLine().toCharArray();
        Arrays.sort(input);
        for(int i=input.length-1; i>=0; i--) System.out.print(input[i]);
    }
}
