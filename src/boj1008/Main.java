package boj1008;

import java.io.*;
import java.math.BigDecimal;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//    BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));
        String[] input = br.readLine().split(" ");
        BigDecimal a = new BigDecimal(input[0].trim());
        BigDecimal b = new BigDecimal(input[1].trim());
        System.out.println(a.divide(b, 12, BigDecimal.ROUND_CEILING));
    }
}


