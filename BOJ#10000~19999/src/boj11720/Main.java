package boj11720;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        int n = Integer.valueOf(br.readLine());
        String[] input = br.readLine().split("");
        int sum = 0;
        for(int i=0; i<n; i++) sum += Integer.valueOf(input[i]);

        System.out.println(sum);
    }
}

