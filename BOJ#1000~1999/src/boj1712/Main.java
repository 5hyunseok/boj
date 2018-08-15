package boj1712;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int a = Integer.valueOf(st.nextToken());
    int b = Integer.valueOf(st.nextToken());
    int c = Integer.valueOf(st.nextToken());
    if (b >= c) {
      System.out.println(-1);
    } else {
      System.out.println(a / (c - b) + 1);
    }
  }
}