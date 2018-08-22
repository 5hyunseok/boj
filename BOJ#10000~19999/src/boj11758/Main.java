package boj11758;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] pos = new int[6];
    for (int i = 0; i < 6; i += 2) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      pos[i] = Integer.valueOf(st.nextToken());
      pos[i + 1] = Integer.valueOf(st.nextToken());
    }

    int s = (pos[2] - pos[0]) * (pos[5] - pos[1]) - (pos[3] - pos[1]) * (pos[4] - pos[0]);
    if (s > 0) {
      System.out.println(1);
    } else if (s < 0) {
      System.out.println(-1);
    } else {
      System.out.println(0);
    }

  }
}
