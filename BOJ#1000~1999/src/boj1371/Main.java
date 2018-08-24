package boj1371;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

    int[] count = new int[26];
    String s = null;
    while ((s = br.readLine()) != null) {
      char[] chars = s.toCharArray();
      for (int i = 0; i < chars.length; i++) {
        if (chars[i] != ' ') {
          count[(int) chars[i] - 97]++;
        }
      }
    }
    int max = -1;
    for (int i = 25; i >= 0; i--) {
      if (count[i] >= max) {
        max = count[i];
      }
    }
    for (int i = 0; i < 26; i++) {
      if (count[i] == max) {
        System.out.print((char) (i + 97));
      }
    }
  }
}
