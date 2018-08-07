package boj10093;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    BigInteger a = new BigInteger(st.nextToken());
    BigInteger b = new BigInteger(st.nextToken());

    int diff = 0;
    BigInteger base = null;
    if (a.compareTo(b) < 0) {
      diff = Integer.valueOf(b.subtract(a).toString());
      base = a;
    } else if (a.compareTo(b) > 0) {
      diff = Integer.valueOf(a.subtract(b).toString());
      base = b;
    }

    System.out.println(diff == 0 ? 0 : diff - 1);
    for (int i = 1; i < diff; i++) {
      System.out.print(base.add(new BigInteger(Integer.toString(i))) + " ");
    }
  }
}

