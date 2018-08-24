package boj10177;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.valueOf(br.readLine());
    for (int i = 0; i < n; i++) {
      boolean isMagicSquare = true;
      int m = Integer.valueOf(br.readLine());
      int[][] arr = new int[m][m];

      for (int j = 0; j < m; j++) {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int k = 0; k < m; k++) {
          arr[j][k] = Integer.valueOf(st.nextToken());
        }
      }

      int magicSum = 0;
      // init magic sum
      for (int j = 0; j < m; j++) {
        magicSum += arr[0][j];
      }

      for (int j = 0; j < m; j++) {
        int checkSum = 0;
        int checkSum2 = 0;
        for (int k = 0; k < m; k++) {
          checkSum += arr[j][k];
          checkSum2 += arr[k][j];
        }
        if (checkSum != magicSum) {
          isMagicSquare = false;
          break;
        }
        if (checkSum2 != magicSum) {
          isMagicSquare = false;
          break;
        }
      }

      int checkSum3 = 0;
      int checkSum4 = 0;
      for (int j = 0; j < m; j++) {
        checkSum3 += arr[j][j];
        checkSum4 += arr[j][m - 1 - j];
      }
      if (checkSum3 != magicSum) {
        isMagicSquare = false;
      }
      if (checkSum4 != magicSum) {
        isMagicSquare = false;
      }

      if (isMagicSquare) {
        System.out.println("Magic square of size " + m);
      } else {
        System.out.println("Not a magic square");
      }
    }
  }
}
