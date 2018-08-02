package boj10845;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

    int n = Integer.valueOf(br.readLine());
    Queue<Integer> queue = new LinkedList<>();
    for (int i = 0; i < n; i++) {
      String s = br.readLine();
      if (s.equals("pop")) {
        if (queue.size() > 0) {
          System.out.println(queue.poll());
        } else {
          System.out.println("-1");
        }
      } else if (s.equals("size")) {
        System.out.println(queue.size());
      } else if (s.equals("empty")) {
        System.out.println(queue.isEmpty() ? "1" : "0");
      } else if (s.equals("front")) {
        if (queue.size() > 0) {
          System.out.println(queue.peek());
        } else {
          System.out.println("-1");
        }
      } else if (s.equals("back")) {
        if (queue.size() > 0) {
          System.out.println(((LinkedList<Integer>) queue).getLast());
        } else {
          System.out.println("-1");
        }
      } else {
        queue.add(Integer.valueOf(s.split(" ")[1]));
      }
    }
  }
}
