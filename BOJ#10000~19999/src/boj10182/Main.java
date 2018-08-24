package boj10182;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

    int n = Integer.valueOf(br.readLine());
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      if (st.nextToken().equals("H")) {
        st.nextToken();
        double h = Double.parseDouble(st.nextToken());
        System.out.println(String.format("%.2f", -Math.log10(h)));
      } else {
        st.nextToken();
        double oh = Double.parseDouble(st.nextToken());
        System.out.println(String.format("%.2f", 14 + Math.log10(oh)));
      }
    }
  }
}
