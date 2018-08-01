package boj3046;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        String[] input = br.readLine().split(" ");
        System.out.println(Integer.valueOf(input[1]) * 2 - Integer.valueOf(input[0]));
    }
}