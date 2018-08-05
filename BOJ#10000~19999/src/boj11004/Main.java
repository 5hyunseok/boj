package boj11004;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] nk = br.readLine().split(" ");
    int n = Integer.valueOf(nk[0]);
    int k = Integer.valueOf(nk[1]);

    int[] arr = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.valueOf(st.nextToken());
    }
    Arrays.sort(arr);
    System.out.println(arr[k-1]);
  }
}
