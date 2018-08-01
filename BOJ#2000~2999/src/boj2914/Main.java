package boj2914;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));
        String[] input = br.readLine().split(" ");
        System.out.println(Integer.valueOf(input[0]) * (Integer.valueOf(input[1])-1) + 1);
    }
}
