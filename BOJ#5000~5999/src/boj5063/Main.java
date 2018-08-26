package boj5063;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.valueOf(br.readLine());
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int r = Integer.valueOf(st.nextToken());
      int e = Integer.valueOf(st.nextToken());
      int c = Integer.valueOf(st.nextToken());
      if(r > (e-c)) {
        System.out.println("do not advertise");
      } else if (r == (e-c)) {
        System.out.println("does not matter");
      } else {
        System.out.println("advertise");
      }
    }
  }
}