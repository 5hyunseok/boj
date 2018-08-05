package boj9093;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));
    int n = Integer.valueOf(br.readLine());
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      String[] input = br.readLine().split(" ");
      for (int j = 0; j < input.length; j++) {
        char[] chars = input[j].toCharArray();
        for (int k = chars.length - 1; k >= 0; k--) {
          sb.append(chars[k]);
        }
        sb.append(" ");
      }
      sb.append("\n");
    }
    System.out.println(sb.toString());
  }
}
