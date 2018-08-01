package boj2748;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        int n = Integer.valueOf(br.readLine());

        long a = 0;
        long b = 1;

        for(int i=1; i<n; i++) {
            long c = a + b;
            a = b;
            b = c;
        }
        System.out.println(b);
    }
}