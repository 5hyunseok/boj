package boj5354;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.valueOf(br.readLine());
    for (int i = 0; i < n; i++) {
      if (i > 0) {
        System.out.println();
      }
      int m = Integer.valueOf(br.readLine());
      if (m == 1) {
        System.out.println("#");
        continue;
      }
      for (int j = 0; j < m; j++) {
        System.out.print("#");
      }
      System.out.print("\n");
      for (int j = 0; j < m - 2; j++) {
        System.out.print("#");
        for (int k = 0; k < m - 2; k++) {
          System.out.print("J");
        }
        System.out.print("#\n");
      }
      for (int j = 0; j < m; j++) {
        System.out.print("#");
      }
      System.out.print("\n");
    }
  }
}
