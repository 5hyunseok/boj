package boj2480;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int a = Integer.valueOf(input[0]);
    int b = Integer.valueOf(input[1]);
    int c = Integer.valueOf(input[2]);

    int price = 0;
    if (a == b && b == c) {
      price = 10000 + a * 1000;
    } else if (a == b && b != c) {
      price = 1000 + a * 100;
    } else if (a != b && b == c) {
      price = 1000 + b * 100;
    } else if (a == c && a != b) {
      price = 1000 + a * 100;
    } else {
      price = Math.max(Math.max(a, b), c) * 100;
    }
    System.out.println(price);
  }
}