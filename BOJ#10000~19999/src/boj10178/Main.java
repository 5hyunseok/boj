package boj10178;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.valueOf(br.readLine());
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      BigInteger candyNum = new BigInteger(st.nextToken());
      BigInteger siblingNum = new BigInteger(st.nextToken());
      BigInteger[] res = candyNum.divideAndRemainder(siblingNum);
      StringBuilder sb = new StringBuilder();
      sb.append("You get ");
      sb.append(res[0].toString());
      sb.append(" piece(s) and your dad gets ");
      sb.append(res[1].toString());
      sb.append(" piece(s).");
      System.out.println(sb.toString());
    }
  }
}
