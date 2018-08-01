package boj10797;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        int d = Integer.valueOf(br.readLine());
        String[] input = br.readLine().split(" ");
        int count = 0;
        for(int i=0; i<5; i++) if (d == Integer.valueOf(input[i])) count++;
        System.out.println(count);
    }
}
