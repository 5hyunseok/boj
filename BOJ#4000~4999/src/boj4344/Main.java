package boj4344;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.valueOf(br.readLine());
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int m = Integer.valueOf(st.nextToken());
      LinkedList<Integer> points = new LinkedList<>();
      int sum = 0;
      for (int j = 0; j < m; j++) {
        int point = Integer.valueOf(st.nextToken());
        sum += point;
        points.add(point);
      }
      double avg = (double) sum / m;
      int upCount = 0;
      for (int p : points) {
        if (p > avg) {
          upCount++;
        }
      }
      System.out.println(String.format("%.3f", ((double) upCount / m) * 100) + "%");

    }
  }
}
