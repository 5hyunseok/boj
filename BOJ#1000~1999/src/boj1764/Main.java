package boj1764;

import java.io.*;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int n = Integer.valueOf(st.nextToken());
    int m = Integer.valueOf(st.nextToken());

    TreeSet<String> neverHeard = new TreeSet<>();
    TreeSet<String> neverHeardOrSeen = new TreeSet<>();
    for (int i = 0; i < n; i++) {
      neverHeard.add(br.readLine());
    }

    for (int i = 0; i < m; i++) {
      String s = br.readLine();
      if (neverHeard.contains(s)) {
        neverHeardOrSeen.add(s);
      }
    }

    System.out.println(neverHeardOrSeen.size());
    for (String s : neverHeardOrSeen) {
      System.out.println(s);
    }

  }
}
