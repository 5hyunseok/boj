package boj5363;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.valueOf(br.readLine());
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      StringBuilder last = new StringBuilder();
      last.append(st.nextToken());
      last.append(" ");
      last.append(st.nextToken());
      while (st.hasMoreTokens()) {
        System.out.print(st.nextToken() + " ");
      }
      System.out.print(last.toString() + "\n");
    }
  }
}
