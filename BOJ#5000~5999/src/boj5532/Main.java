package boj5532;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int l = Integer.valueOf(br.readLine());
    int a = Integer.valueOf(br.readLine());
    int b = Integer.valueOf(br.readLine());
    int c = Integer.valueOf(br.readLine());
    int d = Integer.valueOf(br.readLine());

    System.out
        .println(Math.round(l - Math.max(Math.ceil((double) a / c), Math.ceil((double) b / d))));
  }
}