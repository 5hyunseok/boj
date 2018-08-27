package boj5533;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.valueOf(br.readLine());
    int[] points = new int[n];
    LinkedList<LinkedList<Integer>> rounds = new LinkedList<>();
    rounds.add(new LinkedList<>());
    rounds.add(new LinkedList<>());
    rounds.add(new LinkedList<>());

    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      for (int roundNum = 0; roundNum < 3; roundNum++) {
        rounds.get(roundNum).add(Integer.valueOf(st.nextToken()));
      }
    }

    for (int roundNum = 0; roundNum < 3; roundNum++) {
      for (int i = 0; i < n; i++) {
        int players = rounds.get(roundNum).get(i);
        boolean isUnique = true;
        for (int j = 0; j < n; j++) {
          if (j != i) {
            if (rounds.get(roundNum).get(j) == players) {
              isUnique = false;
            }
          }
        }
        if (isUnique) {
          points[i] += players;
        }
      }
    }
    for (int i = 0; i < n; i++) {
      System.out.println(points[i]);
    }
  }
}