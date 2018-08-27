package boj5176;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.valueOf(br.readLine());

    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int p = Integer.valueOf(st.nextToken());
      int m = Integer.valueOf(st.nextToken());
      boolean[] booked = new boolean[m + 1];

      int canNotParticipate = 0;
      for (int j = 0; j < p; j++) {
        int num = Integer.valueOf(br.readLine());
        if (!booked[num]) {
          booked[num] = true;
        } else {
          canNotParticipate++;
        }
      }
      System.out.println(canNotParticipate);
    }

  }
}
