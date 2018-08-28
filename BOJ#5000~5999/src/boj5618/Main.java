package boj5618;

import java.io.*;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.valueOf(br.readLine());
    TreeSet<Integer> treeSet = new TreeSet<>();
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    for (int i = 0; i < n; i++) {
      treeSet.add(Integer.valueOf(st.nextToken()));
    }

    for (int i = 1; i <= treeSet.first(); i++) {
      boolean isCommonDivider = true;
      for (int j : treeSet) {
        if (j % i != 0) {
          isCommonDivider = false;
        }
      }
      if (isCommonDivider) {
        System.out.println(i);
      }
    }


  }
}
