package boj2204;

import java.io.*;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      int n = Integer.valueOf(br.readLine());
      if (n == 0) {
        break;
      }

      TreeSet<String> treeSet = new TreeSet<>((Comparator<String>) (o1, o2) -> {
        return o1.toLowerCase().compareTo(o2.toLowerCase());
      });
      for (int i = 0; i < n; i++) {
        treeSet.add(br.readLine());
      }
      System.out.println(treeSet.first());
    }


  }
}
