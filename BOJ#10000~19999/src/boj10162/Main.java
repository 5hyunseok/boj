package boj10162;

import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.valueOf(br.readLine());

    // 300 60 10
    int countA = 0;
    while(n >= 300) {
      n-=300;
      countA++;
    }

    int countB = 0;
    while(n>=60) {
      n-=60;
      countB++;
    }

    int countC = 0;
    while(n>0) {
      n-=10;
      countC++;
    }

    System.out.println(n == 0 ? String.format("%s %s %s", countA, countB, countC) : -1);
  }
}
