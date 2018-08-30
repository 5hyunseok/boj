package boj10871;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int n = Integer.valueOf(st.nextToken());
    int x = Integer.valueOf(st.nextToken());
    st = new StringTokenizer(br.readLine(), " ");
    for (int i = 0; i < n; i++) {
      int N = Integer.valueOf(st.nextToken());
      if (x > N) {
        System.out.print(N + " ");
      }
    }
  }
}
