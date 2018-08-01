package boj5347;

import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        int n = Integer.valueOf(br.readLine());
        for(int i=0; i<n; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.valueOf(input[0]);
            int b = Integer.valueOf(input[1]);
            BigInteger bigA = new BigInteger(Integer.toString(a));
            BigInteger bigB = new BigInteger(Integer.toString(b));

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

            BigInteger GCD = new BigInteger(Integer.toString(a));
            System.out.println(bigA.multiply(bigB).divide(GCD));
        }
    }
}
