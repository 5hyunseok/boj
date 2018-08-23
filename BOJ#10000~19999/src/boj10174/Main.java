package boj10174;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.valueOf(br.readLine());
    for (int i = 0; i < n; i++) {
      char[] chars = br.readLine().toLowerCase().toCharArray();
      int l = chars.length / 2;
      boolean isPalindrome = true;
      for (int j = 0; j < l; j++) {
        if (chars[j] != chars[chars.length - j - 1]) {
          isPalindrome = false;
          break;
        }
      }
      System.out.println(isPalindrome ? "Yes" : "No");
    }
  }
}
