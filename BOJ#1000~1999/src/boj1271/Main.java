package boj1271;

import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        String[] input = br.readLine().split(" ");
        BigInteger n = new BigInteger(input[0].trim());
        BigInteger m = new BigInteger(input[1].trim());

        BigInteger[] res = n.divideAndRemainder(m);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}
