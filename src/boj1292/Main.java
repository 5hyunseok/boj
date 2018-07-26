package boj1292;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));
        String[] input = br.readLine().split(" ");

        int sum = 0;
        for(int i=Integer.valueOf(input[0]); i<=Integer.valueOf(input[1]); i++)
            sum += (int) ((Math.sqrt((i - 1) * 8 + 1) + 1) / 2);
        System.out.println(sum);
    }
}
