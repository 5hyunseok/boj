package boj10951;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        String s = null;
        while((s=br.readLine()) != null) {
            String[] input = s.split(" ");
            System.out.println(Integer.valueOf(input[0]) + Integer.valueOf(input[1]));
        }
    }
}
