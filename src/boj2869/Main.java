package boj2869;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        String[] input = br.readLine().split(" ");
        int a = Integer.valueOf(input[0]);
        int b = Integer.valueOf(input[1]);
        int v = Integer.valueOf(input[2]);
        int sum = 0;
        int dayCount = 0;
        while(sum < v) {
            sum += a;
            dayCount++;
            if(sum >= v) break;
            sum -= b;
        }
        System.out.println(dayCount);
    }
}
