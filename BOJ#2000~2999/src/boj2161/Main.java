package boj2161;

import java.io.*;
import java.util.LinkedList;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

    int n = Integer.valueOf(br.readLine());

    LinkedList<Integer> list = new LinkedList<>();
    for (int i = 1; i <= n; i++) {
      list.add(i);
    }

    int i = 0;
    while (list.size() > 0) {
      if (i % 2 == 0) {
        System.out.print(list.pollFirst() + " ");
      } else {
        list.add(list.pollFirst());
      }
      i++;
    }

  }
}
