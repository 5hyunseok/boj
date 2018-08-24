package boj9226;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = null;
    while ((s = br.readLine()) != null) {
      if (s.equals("#")) {
        break;
      }

      char[] chars = s.toCharArray();
      StringBuilder sb = new StringBuilder();
      StringBuilder pre = new StringBuilder();
      int vowelIdx = Integer.MAX_VALUE;
      for (int i = 0; i < chars.length; i++) {
        if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o'
            || chars[i] == 'u') {
          vowelIdx = i;
          break;
        } else {
          sb.append(chars[i]);
        }
      }
      sb.append("ay");
      for (int i = vowelIdx; i < chars.length; i++) {
        pre.append(chars[i]);
      }
      System.out.println(pre.toString() + sb.toString());
    }

  }
}