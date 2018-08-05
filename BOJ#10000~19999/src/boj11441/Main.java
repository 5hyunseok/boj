package boj11441;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.valueOf(br.readLine());
    int[] arr = new int[n];
    String[] arrString = br.readLine().split(" ");

    for (int i = 0; i < arrString.length; i++) {
      arr[i] = Integer.valueOf(arrString[i]);
    }

    int caseNum = Integer.valueOf(br.readLine());
    for (int i = 0; i < caseNum; i++) {
      String[] input = br.readLine().split(" ");
      int a = Integer.valueOf(input[0]) - 1;
      int b = Integer.valueOf(input[1]) - 1;

      int count = 0;
      for (int j = a; j <= b; j++) {
        count += arr[j];
      }
      System.out.println(count);
    }
  }
}
