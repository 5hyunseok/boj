package boj1417;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.valueOf(br.readLine());
    int[] votes = new int[n];

    for (int i = 0; i < n; i++) {
      votes[i] = Integer.valueOf(br.readLine());
    }

    int count = 0;
    while (true) {

      int maxIdx = -1;
      int max = -1;

      for (int i = 0; i < n; i++) {
        if (votes[i] >= max) {
          maxIdx = i;
          max = votes[i];
        }
      }

      if (maxIdx == 0) {
        break;
      } else {
        votes[maxIdx]--;
        votes[0]++;
        count++;
      }
    }

    System.out.println(count);
  }
}
