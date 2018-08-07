package boj1120;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    String a = st.nextToken();
    String b = st.nextToken();

    int minDiff = Integer.MAX_VALUE;
    for (int i = 0; i < b.length() - a.length() + 1; i++) {
      int diff = getDiff(a, b.substring(i, b.length()));
      if (diff < minDiff) {
        minDiff = diff;
      }
    }
    System.out.println(minDiff);
  }

  public static int getDiff(String a, String b) {
    char[] arrA = a.toCharArray();
    char[] arrB = b.toCharArray();

    int diffSum = 0;
    for (int i = 0; i < arrA.length; i++) {
      if (arrA[i] != arrB[i]) {
        diffSum++;
      }
    }
    return diffSum;
  }
}
