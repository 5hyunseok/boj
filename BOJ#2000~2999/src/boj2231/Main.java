package boj2231;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.valueOf(br.readLine());

    for (int i = 1; i <= n; i++) {
      if(i == n) {
        System.out.println(0);
      }
      int sum = i;
      String s = Integer.toString(sum);
      for (int j = 0; j < s.length(); j++) {
        sum += Integer.valueOf(s.substring(j, j + 1));
      }
      if (sum == n) {
        System.out.println(i);
        break;
      }
    }
  }
}
