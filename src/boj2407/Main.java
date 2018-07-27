package boj2407;

import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        String[] input = br.readLine().split(" ");
        int n = Integer.valueOf(input[0]);
        int m = Integer.valueOf(input[1]);

        if(m > (n/2)) m = n - m;

        BigInteger molecular = new BigInteger("1");
        BigInteger denominator = new BigInteger("1");

        for(int i=0; i<m; i++){
            molecular = molecular.multiply(new BigInteger(Integer.toString(n-i)));
            denominator = denominator.multiply(new BigInteger(Integer.toString(i+1)));
        }
        System.out.println(molecular.divide(denominator));
    }
}
