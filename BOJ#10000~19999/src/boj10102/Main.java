package boj10102;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

    int n = Integer.valueOf(br.readLine());
    String[] votes = br.readLine().split("");
    int countA = 0;
    for (int i = 0; i < n; i++) {
      if (votes[i].equals("A")) {
        countA++;
      }
    }

    if (n % 2 == 0) {
      if (countA > (n / 2)) {
        System.out.println("A");
      } else if (countA < (n / 2)) {
        System.out.println("B");
      } else {
        System.out.println("Tie");
      }
    } else {
      if (countA > (n / 2)) {
        System.out.println("A");
      } else {
        System.out.println("B");
      }
    }
  }
}
