package boj5622;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    char[] chars = br.readLine().toCharArray();
    int elapsed = 0;
    for (int i = 0; i < chars.length; i++) {
      int number = (int) chars[i];
      if (number < 83) {
        elapsed += (number - 59) / 3;
      } else if (number == 83) {
        elapsed += (number - 60) / 3;
      } else if (number >= 84 && number <= 86) {
        elapsed += 8;
      } else if (number >= 87 && number <= 90) {
        elapsed += 9;
      } else {
        elapsed += 10;
      }
      elapsed++;
    }
    System.out.println(elapsed);
  }
}
