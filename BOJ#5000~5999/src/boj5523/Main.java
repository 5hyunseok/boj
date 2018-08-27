package boj5523;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.valueOf(br.readLine());
    int winA = 0;
    int winB = 0;
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int a = Integer.valueOf(st.nextToken());
      int b = Integer.valueOf(st.nextToken());
      if (a > b) {
        winA++;
      } else if (a < b) {
        winB++;
      }
    }
    System.out.println(winA + " " + winB);
  }
}