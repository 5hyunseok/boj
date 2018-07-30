package boj2475;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));
        int validation = 0;
        String[] input = br.readLine().split(" ");
        for(int i=0; i<5; i++) validation += Math.pow(Integer.valueOf(input[i]), 2);
        System.out.println(validation % 10);
    }
}
