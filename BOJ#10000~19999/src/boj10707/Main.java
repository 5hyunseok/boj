package boj10707;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.valueOf(br.readLine());
    int b = Integer.valueOf(br.readLine());
    int c = Integer.valueOf(br.readLine());
    int d = Integer.valueOf(br.readLine());
    int p = Integer.valueOf(br.readLine());

    int x = a * p;
    int y = b;

    if (p > c) {
      y += d * (p - c);
    }

    System.out.println(Math.min(x, y));
  }
}
