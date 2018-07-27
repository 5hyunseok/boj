package boj2420;

import java.io.*;
import java.math.BigDecimal;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        String[] input = br.readLine().split(" ");
        BigDecimal b1 = new BigDecimal(input[0]);
        BigDecimal b2 = new BigDecimal(input[1]);
        if(b1.compareTo(b2) == 1) System.out.println(b1.subtract(b2));
        else System.out.println(b2.subtract(b1));
    }
}
