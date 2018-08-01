package boj5086;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        while(true) {
            String[] input = br.readLine().split(" ");
            int a = Integer.valueOf(input[0]);
            int b = Integer.valueOf(input[1]);
            if (a == 0 && b == 0) break;
            System.out.println(a % b == 0 ? "multiple" : b % a == 0 ? "factor" : "neither");
        }
    }
}
