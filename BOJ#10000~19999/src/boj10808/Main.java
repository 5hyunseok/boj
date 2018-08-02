package boj10808;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] input = br.readLine().toCharArray();
    int[] count = new int[26];
    for (int i = 0; i < input.length; i++) {
      count[(int) input[i] - 97]++;
    }
    for (int i = 0; i < 26; i++) {
      System.out.print(count[i] + " ");
    }
  }
}
