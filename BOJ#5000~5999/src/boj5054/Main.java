package boj5054;

import java.io.*;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.valueOf(br.readLine());

    for (int i = 0; i < n; i++) {
      int m = Integer.valueOf(br.readLine());
      TreeSet<Integer> stores = new TreeSet<>();
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      for (int j = 0; j < m; j++) {
        stores.add(Integer.valueOf(st.nextToken()));
      }
      System.out.println((stores.last() - stores.first()) * 2);
    }

  }
}