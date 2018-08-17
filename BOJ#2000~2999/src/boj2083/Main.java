package boj2083;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String s = null;
    while ((s = br.readLine()) != null) {
      if (s.equals("# 0 0")) {
        break;
      }

      StringTokenizer st = new StringTokenizer(s, " ");
      System.out.print(st.nextToken());
      if (Integer.valueOf(st.nextToken()) > 17 || Integer.valueOf(st.nextToken()) >= 80) {
        System.out.print(" Senior\n");
      } else {
        System.out.print(" Junior\n");
      }
    }
  }
}
