package boj1357;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int a = Integer.valueOf(new StringBuilder(st.nextToken()).reverse().toString());
    int b = Integer.valueOf(new StringBuilder(st.nextToken()).reverse().toString());
    String result = new StringBuilder(Integer.toString(a + b)).reverse().toString();
    while (true) {
      if (result.charAt(0) != '0') {
        break;
      } else {
        result = result.substring(1, result.length());
      }
    }
    System.out.println(result);
  }
}
