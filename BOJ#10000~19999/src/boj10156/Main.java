package boj10156;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int need = Integer.valueOf(st.nextToken()) * Integer.valueOf(st.nextToken());
    int pocket = Integer.valueOf(st.nextToken());
    need -= pocket;
    System.out.println(need < 0 ? 0 : need);
  }
}
