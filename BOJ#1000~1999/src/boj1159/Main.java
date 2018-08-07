package boj1159;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.valueOf(br.readLine());
    int[] count = new int[26];

    for (int i = 0; i < n; i++) {
      count[(int) br.readLine().charAt(0) - 97]++;
    }

    boolean isThereATeam = false;
    for (int i = 0; i < 26; i++) {
      if (count[i] >= 5) {
        isThereATeam = true;
        System.out.print((char) (i + 97));
      }
    }
    if (!isThereATeam) {
      System.out.print("PREDAJA");
    }

  }
}