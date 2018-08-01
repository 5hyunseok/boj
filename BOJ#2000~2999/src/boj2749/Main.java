package boj2749;

import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        BigInteger bigN = new BigInteger(br.readLine());
        int n = Integer.valueOf(bigN.divideAndRemainder(new BigInteger("1500000"))[1].toString());

        long a = 0;
        long b = 1;

        while(n > 0) {
            long c = a + b;
            a = b % 1000000;
            b = c % 1000000;
            n--;
        }
        System.out.println(a % 1000000);
    }
}
