package boj2440;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        int n = Integer.valueOf(br.readLine());
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) System.out.print("*");
            System.out.println();
        }
    }
}
