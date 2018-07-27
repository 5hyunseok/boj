package boj2442;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        int n = Integer.valueOf(br.readLine());
        for(int i=1; i<=n; i++) {
            for(int j=0; j<n-i; j++) System.out.print(" ");
            for(int j=0; j<(2*i-1); j++) System.out.print("*");
            System.out.println();
        }
    }
}

