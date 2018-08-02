package boj9095;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int caseNum = Integer.valueOf(br.readLine());
    while(caseNum > 0) {
      int n = Integer.valueOf(br.readLine());
      int[] count = new int[11];
      count[1] = 1;
      count[2] = 2;
      count[3] = 4;
      for (int i = 4; i < n + 1; i++) {
        count[i] = count[i - 1] + count[i - 2] + count[i - 3];
      }
      System.out.println(count[n]);
      caseNum--;
    }
  }
}
