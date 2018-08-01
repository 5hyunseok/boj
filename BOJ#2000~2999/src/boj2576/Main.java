package boj2576;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<7; i++) {
            int a = Integer.valueOf(br.readLine());
            if(a % 2 > 0) {
                sum += a;
                if(min > a) min = a;
            }
        }
        if(sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
