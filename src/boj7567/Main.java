package boj7567;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        String[] input = br.readLine().split("");
        int sum = 0;
        String prev = "-";
        for(int i=0; i<input.length; i++) {
            if(input[i].equals(prev)) sum += 5;
            else sum += 10;
            prev = input[i];
        }
        System.out.println(sum);
    }
}
