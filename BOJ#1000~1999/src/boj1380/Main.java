package boj1380;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int scenarioNum = 1;
    while (true) {
      String s = br.readLine();
      if (s.equals("0")) {
        break;
      }
      int n = Integer.valueOf(s);
      String[] names = new String[n + 1];
      int[] countNames = new int[n + 1];
      for (int i = 1; i < n + 1; i++) {
        names[i] = br.readLine();
      }
      for (int i = 0; i < 2 * n - 1; i++) {
        countNames[Integer.valueOf(br.readLine().split(" ")[0])]++;
      }

      int idx = -1;
      for (int i = 1; i < n + 1; i++) {
        if (countNames[i] == 1) {
          idx = i;
          break;
        }
      }
      System.out.println(scenarioNum + " " + names[idx]);
      scenarioNum++;

    }
  }
}
