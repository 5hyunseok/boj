package boj7572;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.valueOf(br.readLine());

    String[] sipgan = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    String[] sipiji = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"};
    String[] ganzi = new String[60];

    for (int i = 0; i < 60; i++) {
      ganzi[i] = sipiji[i % 12] + sipgan[i % 10];
    }

    System.out.println(ganzi[(n + 60 - 4) % 60]);
  }
}
