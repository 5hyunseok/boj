package boj9316;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.valueOf(br.readLine());
    StringBuilder sb = new StringBuilder();
    String helloWorld = "Hello World, Judge ";
    String q = "!\n";
    for (int i = 1; i <= n; i++) {
      sb.append(helloWorld);
      sb.append(i);
      sb.append(q);
    }
    System.out.println(sb.toString());
  }
}
