package boj2090;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        int n = Integer.valueOf(br.readLine());

        long molecular = 0;
        long denominator = 1;

        String[] input = br.readLine().split(" ");
        for(int i=0; i<input.length; i++) denominator *= Integer.valueOf(input[i]);
        for(int i=0; i<input.length; i++) molecular += denominator / Integer.valueOf(input[i]);

        long a = molecular;
        long b = denominator;

        if(b>a) {
            long temp = a;
            a = b;
            b = temp;
        }

        while(b!=0){
            long r = a % b;
            a = b;
            b = r;
        }
        long gcd = a;

        molecular /= gcd;
        denominator /= gcd;
        System.out.println(denominator + "/" + molecular);
    }
}