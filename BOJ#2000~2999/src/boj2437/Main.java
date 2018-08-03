package boj2437;

import java.io.*;
import java.util.Collections;
import java.util.LinkedList;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.valueOf(br.readLine());
    String[] input = br.readLine().split(" ");
    LinkedList<Integer> weights = new LinkedList<>();
    for (int i = 0; i < input.length; i++) {
      weights.add(Integer.valueOf(input[i]));
    }

    Collections.sort(weights);
    int partialSum = 0;
    boolean haveMin = false;
    for (int i = 0; i < weights.size(); i++) {
      if ((partialSum + 1) < weights.get(i)) {
        System.out.println(partialSum + 1);
        haveMin = true;
        break;
      }
      partialSum += weights.get(i);
    }
    if (!haveMin) {
      System.out.println(partialSum + 1);
    }
  }
}
