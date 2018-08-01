package boj1085;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));
        String[] inputA = br.readLine().split(" ");
        int x = Integer.valueOf(inputA[0]);
        int y = Integer.valueOf(inputA[1]);
        int w = Integer.valueOf(inputA[2]);
        int h = Integer.valueOf(inputA[3]);
        System.out.println(Math.min(Math.min(x,y), Math.min(w-x, h-y)));
    }
}
