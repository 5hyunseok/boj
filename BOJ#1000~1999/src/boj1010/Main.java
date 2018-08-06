package boj1010;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int caseNum = Integer.valueOf(br.readLine());
    for (int i = 0; i < caseNum; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int n = Integer.valueOf(st.nextToken());
      int m = Integer.valueOf(st.nextToken());

      // mCn
      if (n > (m / 2)) {
        n = m - n;
      }
      double result = 1;
      for (int j = 1; j <= n; j++) {
        result *= (m - j + 1);
        result /= j;
      }
      System.out.println((int) result);

    }
  }
}
