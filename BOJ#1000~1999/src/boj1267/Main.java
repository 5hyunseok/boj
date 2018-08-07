package boj1267;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));
    int n = Integer.valueOf(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int ysSum = 0;
    int msSum = 0;
    for (int i = 0; i < n; i++) {
      int time = Integer.valueOf(st.nextToken());
      ysSum += ((time / 30) + 1) * 10;
      msSum += ((time / 60) + 1) * 15;
    }
    System.out.print(ysSum < msSum ? "Y " + ysSum : ysSum > msSum ? "M " + msSum : "Y M " + ysSum);
  }
}
