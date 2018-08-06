package boj1012;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {

  static final int[] dRow = {0, -1, 0, 1};
  static final int[] dCol = {-1, 0, 1, 0};
  static int m;
  static int n;
  static int[][] baechuField;
  static LinkedList<Vector<Integer>> toRemove;

  public static void main(String args[]) throws IOException {
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

    int caseNum = Integer.valueOf(br.readLine());
    for (int i = 0; i < caseNum; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      m = Integer.valueOf(st.nextToken());
      n = Integer.valueOf(st.nextToken());
      int k = Integer.valueOf(st.nextToken());
      baechuField = new int[m][n];
      LinkedList<Vector<Integer>> baechus = new LinkedList<>();

      for (int j = 0; j < k; j++) {
        st = new StringTokenizer(br.readLine(), " ");
        Vector<Integer> v = new Vector<>();
        v.add(Integer.valueOf(st.nextToken()));
        v.add(Integer.valueOf(st.nextToken()));
        baechus.add(v);
      }
      for (Vector<Integer> b : baechus) {
        baechuField[b.get(0)][b.get(1)] = 1;
      }

      int count = 1;
      while (true) {
        toRemove = new LinkedList<>();
        Vector<Integer> b = baechus.getFirst();
        toRemove.add(b);
        baechuField[b.get(0)][b.get(1)] = 2;
        dfs(b.get(0), b.get(1));
        for (Vector<Integer> r : toRemove) {
          baechus.remove(r);
        }

        if (baechus.size() == 0) {
          break;
        }
        count++;
      }
      System.out.println(count);

    }
  }

  public static void dfs(int row, int col) {
    for (int i = 0; i < 4; i++) {
      int nextRow = row + dRow[i];
      int nextCol = col + dCol[i];

      if (nextRow < 0 || nextRow >= m || nextCol < 0 || nextCol >= n) {
        continue;
      }
      if (baechuField[nextRow][nextCol] == 0 || baechuField[nextRow][nextCol] == 2) {
        continue;
      }
      if (baechuField[nextRow][nextCol] == 1) {
        baechuField[nextRow][nextCol] = 2;
        Vector<Integer> r = new Vector<>();
        r.add(nextRow);
        r.add(nextCol);
        toRemove.add(r);
        dfs(nextRow, nextCol);
      }
    }
  }
}
