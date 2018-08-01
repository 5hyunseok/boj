package boj2747;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        int n = Integer.valueOf(br.readLine());

        int a = 0;
        int b = 1;

        for(int i=1; i<n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println(b);
    }
}
