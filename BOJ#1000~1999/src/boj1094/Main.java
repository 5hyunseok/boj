package boj1094;

import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.valueOf(br.readLine());
    LinkedList<Integer> poles = new LinkedList<>();
    poles.add(64);
    while (sum(poles) > n) {
      Collections.sort(poles);
      int shortest = poles.pollFirst();
      poles.add(shortest / 2);
      if (sum(poles) < n) {
        poles.add(shortest / 2);
      }
    }

    System.out.println(poles.size());
  }

  public static int sum(LinkedList<Integer> list) {
    int sum = 0;
    for (Integer i : list) {
      sum += i;
    }
    return sum;
  }
}
