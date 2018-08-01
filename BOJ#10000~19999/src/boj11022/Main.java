package boj11022;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        int n = Integer.valueOf(br.readLine());
        for(int i=0; i<n; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.valueOf(input[0]);
            int b = Integer.valueOf(input[1]);
            int res = a + b;
            System.out.println("Case #" + (i+1) + ": " + a + " + " + b + " = " + res);
        }
    }
}

