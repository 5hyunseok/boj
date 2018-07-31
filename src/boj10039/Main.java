package boj10039;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        int sum = 0;
        for(int i=0; i<5; i++) {
            int n = Integer.valueOf(br.readLine());
            sum += (n > 40) ? n : 40;
        }
        System.out.println(sum/5);
    }
}
