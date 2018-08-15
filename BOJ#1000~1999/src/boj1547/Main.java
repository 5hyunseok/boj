package boj1547;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.valueOf(br.readLine());
    int ball = 1;

    for (int i = 0; i < n; i++) {

      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int a = Integer.valueOf(st.nextToken());
      int b = Integer.valueOf(st.nextToken());

      if (a == ball && b != ball) {
        ball = b;
      } else if (a != ball && b == ball) {
        ball = a;
      }
    }
    System.out.println(ball);
  }
}