package boj5656;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

    String s = null;
    int i = 1;
    while ((s = br.readLine()) != null) {
      StringTokenizer st = new StringTokenizer(s, " ");
      int a = Integer.valueOf(st.nextToken());
      String op = st.nextToken();
      int b = Integer.valueOf(st.nextToken());

      if (op.equals("E")) {
        break;
      }
      System.out.print("Case " + i + ": ");
      if (op.equals(">")) {
        System.out.print(a > b);
      } else if (op.equals(">=")) {
        System.out.print(a >= b);
      } else if (op.equals("<")) {
        System.out.print(a < b);
      } else if (op.equals("<=")) {
        System.out.print(a <= b);
      } else if (op.equals("==")) {
        System.out.print(a == b);
      } else if (op.equals("!=")) {
        System.out.print(a != b);
      }
      System.out.print("\n");
      i++;
    }
  }
}
