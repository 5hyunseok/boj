package boj1568;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long n = Integer.valueOf(br.readLine());

    long time = 0;
    while (n > 0) {
      time += getK(n) - 1;
      if (getSum(getK(n)) == n) {
        time++;
        break;
      } else {
        n -= getSum(getK(n) - 1);
      }
    }
    System.out.println(time);
  }

  public static long getK(long n) {
    return (long) ((Math.sqrt(n * 8 + 1) - 1) / 2) + 1;
  }

  public static long getSum(long k) {
    return (k * (k + 1)) / 2;
  }
}