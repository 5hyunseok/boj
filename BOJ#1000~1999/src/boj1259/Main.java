package boj1259;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String s = null;
    while ((s = br.readLine()) != null) {
      if (s.equals("0")) {
        break;
      }

      char[] input = s.toCharArray();
      boolean isPD = true;
      for (int i = 0; i < input.length / 2; i++) {
        if (input[i] != input[input.length - 1 - i]) {
          isPD = false;
          break;
        }
      }
      if (isPD) {
        System.out.println("yes");
      } else {
        System.out.println("no");
      }
    }
  }
}

