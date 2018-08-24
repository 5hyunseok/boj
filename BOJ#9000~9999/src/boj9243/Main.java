package boj9243;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.valueOf(br.readLine());
    char[] s = br.readLine().toCharArray();
    char[] t = br.readLine().toCharArray();

    boolean isCorrect = true;
    if (n % 2 == 0) {
      for (int i = 0; i < s.length; i++) {
        if (s[i] != t[i]) {
          isCorrect = false;
        }
      }
    } else {
      for (int i = 0; i < s.length; i++) {
        if (s[i] == t[i]) {
          isCorrect = false;
        }
      }
    }
    System.out.print("Deletion ");
    System.out.print(isCorrect ? "succeeded" : "failed");

  }
}