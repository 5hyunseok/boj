package boj10818;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

    int n = Integer.valueOf(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int min = 10000000;
    int max = -10000000;
    for(int i=0; i<n; i++) {
      int input = Integer.valueOf(st.nextToken());
      if(input < min) min = input;
      if(input > max) max = input;
    }

    System.out.print(min + " " + max);
  }
}
