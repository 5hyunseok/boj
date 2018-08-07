package boj10103;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.valueOf(br.readLine());
    int cyPoint = 100;
    int sdPoint = 100;
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int cy = Integer.valueOf(st.nextToken());
      int sd = Integer.valueOf(st.nextToken());
      if (cy > sd) {
        sdPoint -= cy;
      } else if (cy < sd) {
        cyPoint -= sd;
      }
    }
    System.out.println(cyPoint + "\n" + sdPoint);
  }
}
