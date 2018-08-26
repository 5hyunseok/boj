package boj5026;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.valueOf(br.readLine());
    for (int i = 0; i < n; i++) {
      String s = br.readLine();
      if (s.equals("P=NP")) {
        System.out.println("skipped");
      } else {
        StringTokenizer st = new StringTokenizer(s, "+");
        System.out.println(Integer.valueOf(st.nextToken()) + Integer.valueOf(st.nextToken()));
      }
    }

  }
}