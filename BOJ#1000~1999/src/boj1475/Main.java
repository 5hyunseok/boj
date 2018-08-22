package boj1475;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    char[] input = br.readLine().toCharArray();

    int[] numCount = new int[9];
    long setCount = 0;

    for (int j = 0; j < input.length; j++) {
      int target = (int)input[j] - 48;

      if (target == 9) {
        target = 6;
      }
      if (numCount[target] == 0) {
        setCount++;
        for (int i = 0; i < 9; i++) {
          numCount[i]++;
        }
        numCount[6]++;
      }
      numCount[target]--;
    }
    System.out.println(setCount);
  }
}
