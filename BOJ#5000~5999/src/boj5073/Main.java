package boj5073;

import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = null;
    while ((s = br.readLine()) != null) {
      if (s.equals("0 0 0")) {
        break;
      }
      LinkedList<Integer> sides = new LinkedList<>();
      StringTokenizer st = new StringTokenizer(s, " ");
      for (int i = 0; i < 3; i++) {
        sides.add(Integer.valueOf(st.nextToken()));
      }
      Collections.sort(sides);
      if (sides.get(2) >= (sides.get(0) + sides.get(1))) {
        System.out.println("Invalid");
      } else {
        if (sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2))) {
          System.out.println("Equilateral");
        } else if (sides.get(0).equals(sides.get(1)) || sides.get(1).equals(sides.get(2)) || sides
            .get(2).equals(sides.get(0))) {
          System.out.println("Isosceles");
        } else {
          System.out.println("Scalene");
        }
      }
    }
  }
}