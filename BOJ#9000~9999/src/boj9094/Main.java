package boj9094;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));
    int n = Integer.valueOf(br.readLine());
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int k = Integer.valueOf(st.nextToken());
      int m = Integer.valueOf(st.nextToken());

      int count = 0;
      for (int j = 1; j < k - 1; j++) {
        for (int l = j + 1; l < k; l++) {
          double res = (double) (j * j + l * l + m) / (j * l);
          if (res == (int) res) {
            count++;
          }
        }
      }
      System.out.println(count);
    }

  }
}
