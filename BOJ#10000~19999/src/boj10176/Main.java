package boj10176;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

    int n = Integer.valueOf(br.readLine());
    for (int i = 0; i < n; i++) {
      boolean isOpposite = true;
      int[] count = new int[26];
      char[] chars = br.readLine().toLowerCase().toCharArray();
      for (int j = 0; j < chars.length; j++) {
        if (chars[j] == '-' || chars[j] == '_') {
          continue;
        }
        count[(int) chars[j] - 97]++;
      }
      for (int j = 0; j < 13; j++) {
        if (count[j] != count[25 - j]) {
          isOpposite = false;
        }
      }
      System.out.println(isOpposite ? "Yes" : "No");
    }
  }
}
