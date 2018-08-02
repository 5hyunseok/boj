package boj11726;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.valueOf(br.readLine());
    int[] f = new int[n + 2];
    f[1] = 1;
    f[2] = 2;
    for (int i = 3; i < n + 1; i++) {
      f[i] = f[i - 1] + f[i - 2];
      f[i] %= 10007;
    }
    System.out.println(f[n]);
  }
}
