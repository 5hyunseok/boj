package boj1384;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int groupNum = 1;
    while (true) {
      String s = br.readLine();
      if (s.equals("0")) {
        break;
      }
      int n = Integer.valueOf(Integer.valueOf(s));
      String[] names = new String[n];
      Vector<Vector<Integer>> nasty = new Vector<>();
      for (int i = 0; i < n; i++) {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        names[i] = st.nextToken();
        for (int j = i + (n-1); j > i; j--) {
          if (st.nextToken().equals("N")) {
            Vector<Integer> v = new Vector<>();
            v.add(i);
            v.add(j % n);
            nasty.add(v);
          }
        }
      }
      System.out.println("Group " + groupNum);
      for (Vector<Integer> v : nasty) {
        System.out.println(names[v.get(1)] + " was nasty about " + names[v.get(0)]);
      }
      if (nasty.size() == 0) {
        System.out.println("Nobody was nasty");
      }
      System.out.println();
      groupNum++;
    }
  }
}
