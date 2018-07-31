package boj9625;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        int n = Integer.valueOf(br.readLine());
        int a = 1;
        int b = 0;
        for(int i=0; i<n; i++) {
            int x = a;
            int y = b;
            a = y;
            b = x + y;
        }
        System.out.println(a + " " + b);
    }
}
