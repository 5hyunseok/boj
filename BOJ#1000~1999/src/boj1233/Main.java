package boj1233;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int s1 = Integer.valueOf(st.nextToken());
    int s2 = Integer.valueOf(st.nextToken());
    int s3 = Integer.valueOf(st.nextToken());

    // 3 ~ s1+s2+s3
    int[] count = new int[s1 + s2 + s3 + 1];
    for (int i = 1; i <= s1; i++) {
      for (int j = 1; j <= s2; j++) {
        for (int k = 1; k <= s3; k++) {
          count[i + j + k]++;
        }
      }
    }
    int max = -1;
    int maxIdx = -1;
    for (int i = 0; i <= s1 + s2 + s3; i++) {
      if (count[i] > max) {
        max = count[i];
        maxIdx = i;
      }
    }
    System.out.println(maxIdx);
  }
}
