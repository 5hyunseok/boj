package boj11655;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] input = br.readLine().toCharArray();
    for (int i = 0; i < input.length; i++) {
      int ascii = (int) input[i];
      if (ascii >= 97 && ascii <= 122) {
        ascii += 13;
        if (ascii > 122) {
          ascii -= 26;
        }
      } else if (ascii >= 65 && ascii <= 90) {
        ascii += 13;
        if (ascii > 90) {
          ascii -= 26;
        }
      }
      System.out.print((char) ascii);
    }
  }
}