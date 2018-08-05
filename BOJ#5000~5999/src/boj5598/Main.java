package boj5598;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] input = br.readLine().toCharArray();

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < input.length; i++) {
      int asciiNum = (int) input[i] - 3;
      if (asciiNum < 65) {
        asciiNum += 26;
      }
      sb.append((char) (asciiNum));
    }
    System.out.println(sb.toString());
  }
}
