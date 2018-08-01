package boj2502;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        String[] input = br.readLine().split(" ");
        int d = Integer.valueOf(input[0]);
        int k = Integer.valueOf(input[1]);

        int a = 1;
        int b = 1;
        for(int i=0; i<d-3; i++) {
            int temp = a;
            a = b;
            b += temp;
        }
        int maxFirst = k / a;
        int maxSecond = k / b;
        for(int i=0; i<maxFirst; i++) {
            for(int j=i+1; j<maxSecond; j++) {
                if((i * a + j * b) == k) {
                    System.out.println(i);
                    System.out.println(j);
                    break;
                }
            }
        }
    }
}
