package boj1193;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int x = Integer.valueOf(br.readLine());

    int n = (1 + (int) Math.sqrt(1 + 8 * x - 8)) / 2;
    int an = 1 + n * (n - 1) / 2;

    if (n % 2 != 0) {
      int a = n;
      int b = 1;
      for (int i = 0; i < x - an; i++) {
        a--;
        b++;
      }
      System.out.println(a + "/" + b);
    } else {
      int a = 1;
      int b = n;
      for (int i = 0; i < x - an; i++) {
        a++;
        b--;
      }
      System.out.println(a + "/" + b);
    }
  }
}
