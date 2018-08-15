package boj1598;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int a = Integer.valueOf(st.nextToken());
    int b = Integer.valueOf(st.nextToken());

    System.out.println(Math.abs(getCol(a) - getCol(b)) + Math.abs(getRow(a) - getRow(b)));
  }

  static int getRow(int n) {
    return n % 4 == 0 ? 4 : n % 4;
  }

  static int getCol(int n) {
    return (int) (n + 3) / 4;
  }
}
