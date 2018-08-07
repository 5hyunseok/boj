package boj1075;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.valueOf(br.readLine());
    int f = Integer.valueOf(br.readLine());

    n -= (n % 100);
    for (int i = 0; i < 100; i++) {
      if((n+i) % f == 0) {
        System.out.println(String.format("%02d", i));
        break;
      }
    }
  }
}

