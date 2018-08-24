package boj9076;

import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.valueOf(br.readLine());
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      LinkedList<Integer> points = new LinkedList<>();
      for (int j = 0; j < 5; j++) {
        points.add(Integer.valueOf(st.nextToken()));
      }
      Collections.sort(points);
      if (points.get(3) - points.get(1) > 3) {
        System.out.println("KIN");
      } else {
        System.out.println(points.get(1) + points.get(2) + points.get(3));
      }
    }
  }
}