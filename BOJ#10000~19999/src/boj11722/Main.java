package boj11722;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.valueOf(br.readLine());
    int[] arr = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.valueOf(st.nextToken());
    }

    int[] l = new int[n];

    for (int i = n - 1; i >= 0; i--) {
      int max = 0;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[i] && l[j] > max) {
          max = l[j];
        }
      }
      l[i] = max + 1;
    }

    int max = -1;
    for (int i = 0; i < n; i++) {
      if (max < l[i]) {
        max = l[i];
      }
    }
    System.out.println(max);

  }
}
