package boj1526;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.valueOf(br.readLine());

    while (true) {
      if (isGeumMinSu(n)) {
        System.out.println(n);
        break;
      }
      n--;
    }
  }

  public static boolean isGeumMinSu(int n) {
    while (n > 0) {
      if (n % 10 != 4 && n % 10 != 7) {
        return false;
      }
      n /= 10;
    }
    return true;
  }
}
