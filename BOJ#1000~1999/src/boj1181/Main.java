package boj1181;

import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));
    int n = Integer.valueOf(br.readLine());
    HashSet<String> strings = new HashSet<>();
    LinkedList<String> stringSet = new LinkedList<>();
    for (int i = 0; i < n; i++) {
      strings.add(br.readLine());
    }
    for (String s : strings) {
      stringSet.add(s);
    }
    Collections.sort(stringSet, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        if (o1.length() == o2.length()) {
          return o1.compareTo(o2);
        } else {
          return o1.length() < o2.length() ? -1 : 1;
        }
      }
    });
    for (String s : stringSet) {
      System.out.println(s);
    }
  }
}
