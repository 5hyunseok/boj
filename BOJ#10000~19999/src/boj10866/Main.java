package boj10866;

import java.io.*;
import java.util.LinkedList;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.valueOf(br.readLine());
    LinkedList<Integer> deck = new LinkedList<>();
    for (int i = 0; i < n; i++) {
      String s = br.readLine();
      if (s.equals("size")) {
        System.out.println(deck.size());
      } else if (s.equals("empty")) {
        System.out.println(deck.isEmpty() ? "1" : "0");
      } else if (s.equals("front")) {
        if (deck.isEmpty()) {
          System.out.println(-1);
        } else {
          System.out.println(deck.getFirst());
        }
      } else if (s.equals("back")) {
        if (deck.isEmpty()) {
          System.out.println(-1);
        } else {
          System.out.println(deck.getLast());
        }
      } else if (s.equals("pop_front")) {
        if (deck.isEmpty()) {
          System.out.println(-1);
        } else {
          System.out.println(deck.pollFirst());
        }
      } else if (s.equals("pop_back")) {
        if (deck.isEmpty()) {
          System.out.println(-1);
        } else {
          System.out.println(deck.pollLast());
        }
      } else if (s.contains("push_front")) {
        deck.addFirst(Integer.valueOf(s.split(" ")[1]));
      } else if (s.contains("push_back")) {
        deck.addLast(Integer.valueOf(s.split(" ")[1]));
      }
    }
  }
}
