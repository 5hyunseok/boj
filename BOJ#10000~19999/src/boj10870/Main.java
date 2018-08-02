package boj10870;

import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        int n = Integer.valueOf(br.readLine());

        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");
        BigInteger c = new BigInteger("0");
        for(int i=0; i<n-1; i++) {
            c = a.add(b);
            a = b;
            b = c;
        }
        if(n == 1) System.out.println(1);
        else System.out.println(c);
    }
}
