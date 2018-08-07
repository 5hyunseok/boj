package boj11944;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    String input = st.nextToken();
    int N = Integer.valueOf(input);
    char[] n = input.toCharArray();
    int m = Integer.valueOf(st.nextToken());

    int i = 0;
    int l = n.length;
    while (m > 0 && (i/l) < N) {
      System.out.print(n[i % l]);
      i++;
      m--;
    }
  }
}