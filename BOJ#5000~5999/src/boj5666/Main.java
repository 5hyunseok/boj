package boj5666;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String s = null;
    while ((s = br.readLine()) != null) {
      if (s.equals("")) {
        break;
      }
      StringTokenizer st = new StringTokenizer(s, " ");
      int h = Integer.valueOf(st.nextToken());
      int p = Integer.valueOf(st.nextToken());
      double e = (double) h / p;
      System.out.println(String.format("%.2f", Math.round(e * 100) / 100.0));
    }
  }
}
