package boj1284;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

    String s = null;
    while ((s = br.readLine()) != null) {
      if (s.equals("0")) {
        break;
      }
      int width = 0;
      char[] charArray = s.toCharArray();
      for (int i = 0; i < charArray.length; i++) {
        width++;
        if (charArray[i] == '0') {
          width += 4;
        } else if (charArray[i] == '1') {
          width += 2;
        } else {
          width += 3;
        }
      }
      System.out.println(++width);
    }

  }
}

