package boj2338;

import java.io.*;
import java.math.BigDecimal;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));
        BigDecimal b1 = new BigDecimal(br.readLine());
        BigDecimal b2 = new BigDecimal(br.readLine());
        System.out.println(b1.add(b2));
        System.out.println(b1.subtract(b2));
        System.out.println(b1.multiply(b2));
    }
}
