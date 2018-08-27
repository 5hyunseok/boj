package boj5218;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.valueOf(br.readLine());
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      char[] arrA = st.nextToken().toCharArray();
      char[] arrB = st.nextToken().toCharArray();
      System.out.print("Distances: ");
      for (int j = 0; j < arrA.length; j++) {
        if ((int) arrA[j] <= (int) arrB[j]) {
          System.out.print((int) arrB[j] - (int) arrA[j]);
        } else {
          System.out.print((int) arrB[j] + 26 - (int) arrA[j]);
        }
        System.out.print(" ");
      }
      System.out.print("\n");
    }
  }
}
