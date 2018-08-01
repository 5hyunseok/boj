package boj2902;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        String[] input = br.readLine().split("-");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<input.length; i++) sb.append(input[i].charAt(0));
        System.out.println(sb.toString());
    }
}
