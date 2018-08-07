package boj1065;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

    int n = Integer.valueOf(br.readLine());

    int count = 0;
    for (int i = 1; i <= n; i++) {
      if (i <= 99) {
        count++;
      } else if (i <= 999) {
        int a = i / 100;
        int b = (i - (i / 100) * 100) / 10;
        int c = i % 10;
        if (b - a == c - b) {
          count++;
        }
      }
    }
    System.out.println(count);
  }
}
