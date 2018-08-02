package boj10820;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = null;
    while ((s = br.readLine()) != null) {
      int lowerCount = 0;
      int upperCount = 0;
      int numCount = 0;
      int blankCount = 0;
      char[] input = s.toCharArray();
      for (int i = 0; i < input.length; i++) {
        int ascii = (int) input[i];
        if (ascii >= 48 && ascii <= 57) {
          numCount++;
        } else if (ascii == 32) {
          blankCount++;
        } else if (ascii >= 97 && ascii <= 122) {
          lowerCount++;
        } else {
          upperCount++;
        }
      }
      System.out.println(lowerCount + " " + upperCount + " " + numCount + " " + blankCount);
    }
  }
}