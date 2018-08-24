package boj2010;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

    int n = Integer.valueOf(br.readLine());
    int count = 1;
    for (int i = 0; i < n; i++) {
      count += Integer.valueOf(br.readLine());
      count--;
    }

    System.out.println(count);
  }
}
