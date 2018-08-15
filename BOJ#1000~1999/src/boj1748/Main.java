package boj1748;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.valueOf(br.readLine());

    long length = 0;
    while(n>0){
      length += Integer.toString(n).length();
      n--;
    }
    System.out.println(length);

  }
}
