package boj1789;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        long s = Long.valueOf(br.readLine());
        long n = (long)(Math.sqrt(s * 8 + 1) - 1) / 2;
        System.out.println(n);
    }
}
