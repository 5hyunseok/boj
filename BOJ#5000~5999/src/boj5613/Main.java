package boj5613;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.valueOf(br.readLine());
    String s = null;
    while ((s = br.readLine()) != null) {
      if (s.equals("+")) {
        n += Integer.valueOf(br.readLine());
      } else if (s.equals("-")) {
        n -= Integer.valueOf(br.readLine());
      } else if (s.equals("*")) {
        n *= Integer.valueOf(br.readLine());
      } else if (s.equals("/")) {
        n /= Integer.valueOf(br.readLine());
      } else if (s.equals("=")) {
        System.out.println(n);
        break;
      }
    }
  }
}
