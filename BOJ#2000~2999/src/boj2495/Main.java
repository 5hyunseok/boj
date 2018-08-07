package boj2495;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    for (int i = 0; i < 3; i++) {
      String[] st = br.readLine().split("");
      int[] num = new int[8];
      for (int j = 0; j < 8; j++) {
        num[j] = Integer.valueOf(st[j]);
      }

      int prev = -1;
      int sameCount = 1;
      int max = -1;

      for (int j = 0; j < 8; j++) {
        if (prev == num[j]) {
          sameCount++;
        } else {
          sameCount = 1;
        }
        if (sameCount > max) {
          max = sameCount;
        }
        prev = num[j];
      }

      System.out.println(max);
    }
  }
}
