package boj2739;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        int n = Integer.valueOf(br.readLine());
        for(int i=1; i<10; i++) System.out.println(n + " * " + i + " = " + (n * i));
    }
}
