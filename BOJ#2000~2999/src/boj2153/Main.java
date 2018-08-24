package boj2153;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

    boolean[] primes = new boolean[1050];

    for (int i = 1; i < 1050; i++) {
      primes[i] = true;
    }
    for (int i = 2; i * i < 1050; i++) {
      if (primes[i]) {
        for (int j = i * i; j < 1050; j += i) {
          primes[j] = false;
        }
      }
    }

    String s = br.readLine();
    char[] arr = s.toCharArray();
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      if ((int) arr[i] > 96) {
        sum += (int) arr[i] - 96;
      } else {
        sum += (int) arr[i] - 38;
      }
    }
    System.out.println("It is " + (primes[sum] ? "" : "not ") + "a prime word.");

  }
}
