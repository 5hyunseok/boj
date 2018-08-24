package boj10173;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String s = null;
    while ((s = br.readLine()) != null) {
      if (s.equals("EOI")) {
        break;
      }

      if (s.toLowerCase().contains("nemo")) {
        System.out.println("Found");
      } else {
        System.out.println("Missing");
      }
    }
  }
}
