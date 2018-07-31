package boj8393;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
        int n = Integer.valueOf(br.readLine());
        System.out.println(n*(n+1)/2);
    }
}