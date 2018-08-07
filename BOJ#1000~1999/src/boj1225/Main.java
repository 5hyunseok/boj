package boj1225;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] input = br.readLine().split(" ");
    String[] arrA = input[0].split("");
    String[] arrB = input[1].split("");
    int[] a = new int[arrA.length];
    int[] b = new int[arrB.length];

    for (int i = 0; i < arrA.length; i++) {
      a[i] = Integer.valueOf(arrA[i]);
    }
    for (int i = 0; i < arrB.length; i++) {
      b[i] = Integer.valueOf(arrB[i]);
    }

    long sum = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < b.length; j++) {
        sum += a[i] * b[j];
      }
    }
    System.out.println(sum);

  }
}