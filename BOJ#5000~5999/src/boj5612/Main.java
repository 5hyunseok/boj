package boj5612;

import java.io.*;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.valueOf(br.readLine());
    int carNum = Integer.valueOf(br.readLine());

    TreeSet<Integer> carNums = new TreeSet<>();
    carNums.add(carNum);

    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      carNum += Integer.valueOf(st.nextToken());
      carNum -= Integer.valueOf(st.nextToken());
      carNums.add(carNum);
    }
    System.out.println(carNums.first() < 0 ? 0 : carNums.last());
  }
}
