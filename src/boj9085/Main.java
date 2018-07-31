package boj9085;

import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
        int caseNum = Integer.valueOf(br.readLine());
        for(int i=0; i<caseNum; i++) {
            int n = Integer.valueOf(br.readLine());
            String[] input = br.readLine().split(" ");
            BigInteger sum = new BigInteger("0");
            for(int j=0; j<n; j++) sum = sum.add(new BigInteger(input[j]));
            System.out.println(sum);
        }
    }
}
