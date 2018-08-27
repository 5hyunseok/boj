package boj5355;

import java.io.*;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.valueOf(br.readLine());
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      BigDecimal bd = new BigDecimal(st.nextToken());
      while (st.hasMoreElements()) {
        String s = st.nextToken();
        if (s.equals("@")) {
          bd = bd.multiply(new BigDecimal("3"));
        } else if (s.equals("%")) {
          bd = bd.add(new BigDecimal("5"));
        } else if (s.equals("#")) {
          bd = bd.subtract(new BigDecimal("7"));
        }
      }
      System.out.println(bd.setScale(2, BigDecimal.ROUND_UNNECESSARY));
    }
  }
}
