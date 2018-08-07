package boj2445;

import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

    int n = Integer.valueOf(br.readLine());

    for(int i=0; i<n; i++) {
      for(int j=0; j<=i; j++) {
        System.out.print("*");
      }
      for(int j=0; j<2*(n-i-1); j++) {
        System.out.print(" ");
      }
      for(int j=0; j<=i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for(int i=n-2; i>=0; i--){
      for(int j=0; j<=i; j++) {
        System.out.print("*");
      }
      for(int j=0; j<2*(n-i-1); j++) {
        System.out.print(" ");
      }
      for(int j=0; j<=i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
