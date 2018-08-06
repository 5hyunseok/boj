package boj1003;

import java.io.*;

public class Main {

  public static int[][] f;

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int caseNum = Integer.valueOf(br.readLine());
    f = new int[41][2];
    f[0] = new int[]{1, 0};
    f[1] = new int[]{0, 1};
    while (caseNum > 0) {
      int n = Integer.valueOf(br.readLine());
      int[] res = fibonacci(n);
      System.out.println(res[0] + " " + res[1]);
      caseNum--;
    }
  }

  public static int[] fibonacci(int n) {
    if (n == 0) {
      return f[0];
    } else if (n == 1) {
      return f[1];
    }
    if (f[n][0] == 0 && f[n][1] == 0) {
      if (f[n - 2][0] == 0 && f[n - 2][1] == 0) {
        f[n - 2] = fibonacci(n - 2);
      }
      if (f[n - 1][0] == 0 && f[n - 1][1] == 0) {
        f[n - 1] = fibonacci(n - 1);
      }
      f[n] = new int[]{f[n - 1][0] + f[n - 2][0], f[n - 1][1] + f[n - 2][1]};
    }

    return f[n];
  }
}
