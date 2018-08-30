package boj11006;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.valueOf(br.readLine());
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int a = Integer.valueOf(st.nextToken());
      int b = Integer.valueOf(st.nextToken());
      System.out.println((2 * b - a) + " " + (a - b));
    }
  }
}
