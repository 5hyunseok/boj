package boj10180;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

    int n = Integer.valueOf(br.readLine());
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int m = Integer.valueOf(st.nextToken());
      double distance = Double.valueOf(st.nextToken());
      int reachingCount = 0;
      for (int j = 0; j < m; j++) {
        st = new StringTokenizer(br.readLine(), " ");
        int v = Integer.valueOf(st.nextToken());
        int f = Integer.valueOf(st.nextToken());
        int c = Integer.valueOf(st.nextToken());

        double left = (distance / v) * c;
        double right = f;
        if (left <= right) {
          reachingCount++;
        }
      }
      System.out.println(reachingCount);
    }
  }
}
