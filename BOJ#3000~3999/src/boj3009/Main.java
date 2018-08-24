package boj3009;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));
    int[][] point = new int[3][2];
    for (int i = 0; i < 3; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      point[i][0] = Integer.valueOf(st.nextToken());
      point[i][1] = Integer.valueOf(st.nextToken());
    }

    double[] inc = new double[3];
    for (int i = 0; i < 3; i++) {
      if ((point[(i + 1) % 3][0] - point[i][0]) == 0) {
        inc[i] = Double.MAX_VALUE;
      } else {
        inc[i] =
            (double) (point[(i + 1) % 3][1] - point[i][1]) / (point[(i + 1) % 3][0] - point[i][0]);
      }
    }
    int centerIdx = -1;
    for (int i = 0; i < 3; i++) {
      if ((inc[i] == 0 && inc[(i + 1) % 3] == Double.MAX_VALUE) || (inc[i] == Double.MAX_VALUE
          && inc[(i + 1) % 3] == 0) || (inc[i] * inc[(i + 1) % 3] == -1)) {
        centerIdx = (i + 1) % 3;
      }
    }
    int x = 0;
    int y = 0;
    for (int i = 0; i < 3; i++) {
      if (i == centerIdx) {
        x -= point[i][0];
        y -= point[i][1];
      } else {
        x += point[i][0];
        y += point[i][1];
      }
    }
    System.out.println(x + " " + y);
  }
}