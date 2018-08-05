package boj5032;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int e = Integer.valueOf(st.nextToken());
    int f = Integer.valueOf(st.nextToken());
    int c = Integer.valueOf(st.nextToken());

    int emptyCokeCount = e + f;
    int newCokeSum = 0;

    while(true) {
      int newCokeCount = 0;
      newCokeCount = emptyCokeCount / c;
      emptyCokeCount -= (emptyCokeCount / c) * c;
      newCokeSum += newCokeCount;
      emptyCokeCount += newCokeCount;
      if(emptyCokeCount < c) break;
    }

    System.out.println(newCokeSum);
  }
}

