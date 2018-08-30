package boj5717;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s;
    while ((s = br.readLine()) != null) {
      if (s.equals("0 0")) {
        break;
      }
      StringTokenizer st = new StringTokenizer(s, " ");
      System.out.println(Integer.valueOf(st.nextToken()) + Integer.valueOf(st.nextToken()));
    }
  }
}
