package boj1004;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {

  public final static int X = 0;
  public final static int Y = 1;
  public final static int R = 2;

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int caseNum = Integer.valueOf(br.readLine());
    for (int i = 0; i < caseNum; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int[] start = new int[2];
      start[X] = Integer.valueOf(st.nextToken());
      start[Y] = Integer.valueOf(st.nextToken());
      int[] end = new int[2];
      end[X] = Integer.valueOf(st.nextToken());
      end[Y] = Integer.valueOf(st.nextToken());

      int n = Integer.valueOf(br.readLine());
      Vector<Vector<Integer>> planets = new Vector<>();
      for (int j = 0; j < n; j++) {
        st = new StringTokenizer(br.readLine(), " ");
        Vector<Integer> v = new Vector<>();
        v.add(Integer.valueOf(st.nextToken()));
        v.add(Integer.valueOf(st.nextToken()));
        v.add(Integer.valueOf(st.nextToken()));
        planets.add(v);
      }
      int count = 0;
      for (Vector<Integer> p : planets) {
        double dFromStart = Math
            .sqrt(Math.pow(start[X] - p.get(X), 2) + Math.pow(start[Y] - p.get(Y), 2));
        double a = p.get(R) - dFromStart;

        double dFromEnd = Math
            .sqrt(Math.pow(end[X] - p.get(X), 2) + Math.pow(end[Y] - p.get(Y), 2));
        double b = p.get(R) - dFromEnd;
        if (a * b <= 0) {
          count++;
        }
      }
      System.out.println(count);
    }
  }
}
