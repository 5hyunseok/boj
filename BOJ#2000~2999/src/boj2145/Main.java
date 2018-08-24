package boj2145;

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

      while (true) {
        int sum = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
          sum += Integer.valueOf(Character.toString(arr[i]));
        }

        if (sum < 10) {
          System.out.println(sum);
          break;
        } else {
          s = Integer.toString(sum);
        }
      }
    }
  }
}
