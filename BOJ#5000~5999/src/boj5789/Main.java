package boj5789;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
        int n = Integer.valueOf(br.readLine());
        for(int i=0; i<n; i++) {
            String input = br.readLine();
            System.out.println(input.charAt(input.length()/2 -1) == input.charAt(input.length()/2) ? "Do-it" : "Do-it-Not");
        }
    }
}
