package boj11320;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.valueOf(br.readLine());
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int m = Integer.valueOf(st.nextToken()) / Integer.valueOf(st.nextToken());
      int res = 0;
      for (int j = 1; j <= m; j++) {
        res += j;
        if (j != m) {
          res += j;
        }
      }
      System.out.println(res);
    }
  }
}
