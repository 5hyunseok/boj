package boj10827;

import java.io.*;
import java.math.BigDecimal;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        String[] input = br.readLine().split(" ");
        BigDecimal a = new BigDecimal(input[0]);
        int b = Integer.valueOf(input[1]);
        System.out.println(a.pow(b).toPlainString());
    }
}
