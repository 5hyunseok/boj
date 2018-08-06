package boj11050;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int n = Integer.valueOf(st.nextToken());
    int k = Integer.valueOf(st.nextToken());
    if (k < n / 2) {
      k = n - k;
    }

    double res = 1;

    for (int i = 1; i <= k; i++) {
      res *= (n - i + 1);
      res /= i;
    }
    System.out.println((int)res);
  }
}