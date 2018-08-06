package boj10101;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.valueOf(br.readLine());
    int b = Integer.valueOf(br.readLine());
    int c = Integer.valueOf(br.readLine());
    if (a + b + c != 180) {
      System.out.println("Error");
    } else if (a == b && b == c) {
      System.out.println("Equilateral");
    } else if ((a == b && b != c) || (a == c && b != c) || (b == c && a != b)) {
      System.out.println("Isosceles");
    } else {
      System.out.println("Scalene");
    }
  }
}
