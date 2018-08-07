package boj10817;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int max = 0;
    int min = 1000;
    int maxIdx = -1;
    int minIdx = -1;
    int[] input = new int[3];
    for (int i = 0; i < 3; i++) {
      input[i] = Integer.valueOf(st.nextToken());
      if (input[i] <= min) {
        min = input[i];
        minIdx = i;
      }
      if (input[i] > max) {
        max = input[i];
        maxIdx = i;
      }
    }

    System.out.println(input[3 - minIdx - maxIdx]);
  }
}
