package boj1264;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String s = null;
    while ((s = br.readLine()) != null) {
      if (s.equals("#")) {
        break;
      }
      char[] input = s.toLowerCase().toCharArray();
      int cnt = 0;
      for (int i = 0; i < input.length; i++) {
        if (input[i] == 'a' || input[i] == 'e' || input[i] == 'i' || input[i] == 'o'
            || input[i] == 'u') {
          cnt++;
        }
      }
      System.out.println(cnt);
    }
  }
}
