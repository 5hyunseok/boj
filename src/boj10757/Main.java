package boj10757;

import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
        String[] input = br.readLine().split(" ");
        System.out.println(new BigInteger(input[0]).add(new BigInteger(input[1])));
    }
}
