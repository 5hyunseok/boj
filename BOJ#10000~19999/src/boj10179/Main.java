package boj10179;

import java.io.*;
import java.math.BigDecimal;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

    int n = Integer.valueOf(br.readLine());
    for (int i = 0; i < n; i++) {
      BigDecimal input = new BigDecimal(br.readLine());
      System.out.println(
          "$" + input.multiply(new BigDecimal(0.8)).setScale(2, BigDecimal.ROUND_HALF_UP)
              .toString());
    }
  }
}
