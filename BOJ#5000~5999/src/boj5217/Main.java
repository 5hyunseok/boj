package boj5217;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.valueOf(br.readLine());
    for (int i = 0; i < n; i++) {
      StringBuilder sb = new StringBuilder();
      sb.append("Pairs for ");
      int m = Integer.valueOf(br.readLine());
      sb.append(m);
      sb.append(": ");
      for (int j = 0; j < m; j++) {
        for (int k = j + 1; k < m; k++) {
          if (j + k == m) {
            sb.append(j + " " + k + ", ");
          }
        }
      }
      String result = sb.toString();
      if (result.substring(result.length() - 2, result.length() - 1).equals(",")) {
        result = result.substring(0, result.length() - 2);
      }
      System.out.println(result);
    }

  }
}
