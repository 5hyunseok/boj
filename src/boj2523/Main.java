package boj2523;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        int n = Integer.valueOf(br.readLine());
        for(int i=1; i<n; i++) {
            for(int j=0; j<i; j++) System.out.print("*");
            System.out.println();
        }
        for(int i=n; i>0; i--) {
            for(int j=0; j<i; j++) System.out.print("*");
            System.out.println();
        }
    }
}
