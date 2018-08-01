package boj2609;

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
        int A = a;
        int B = b;

        if(b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        while(b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        System.out.println(a);
        System.out.println(A*B/a);
    }
}
