package boj1076;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet",
        "grey", "white"};

    Map<String, Integer> table = new HashMap<>();
    for (int i = 0; i < 10; i++) {
      table.put(color[i], i);
    }
    String a = table.get(br.readLine()).toString();
    a = a.equals("0") ? "" : a;
    String b = table.get(br.readLine()).toString();
    int zeroNum = Integer.valueOf(table.get(br.readLine()));
    System.out.print(a + b);
    if (Integer.valueOf(a + b) == 0) {
      zeroNum = 0;
    }
    for (int i = 0; i < zeroNum; i++) {
      System.out.print("0");
    }
  }
}
