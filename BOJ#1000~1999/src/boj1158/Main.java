package boj1158;

import java.io.*;
import java.util.LinkedList;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int n = Integer.valueOf(input[0]);
    int m = Integer.valueOf(input[1]);

    LinkedList<Integer> circle = new LinkedList<>();
    for (int i = 1; i < n + 1; i++) {
      circle.add(i);
    }
    int toRemove = 0;
    System.out.print("<");
    while (circle.size() > 0) {
      toRemove += m - 1;
      toRemove %= circle.size();
      if (circle.size() > 1) {
        System.out.print(circle.remove(toRemove) + ", ");
      } else {
        System.out.print(circle.remove(toRemove));
      }
    }
    System.out.print(">");
  }
}
