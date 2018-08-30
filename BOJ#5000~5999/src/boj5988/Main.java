package boj5988;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.valueOf(br.readLine());
    for (int i = 0; i < n; i++) {
      String s = br.readLine();
      if (Integer.valueOf(s.substring(s.length() - 1, s.length())) % 2 == 0) {
        System.out.println("even");
      } else {
        System.out.println("odd");
      }

    }
  }
}
