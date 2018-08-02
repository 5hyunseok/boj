package boj10824;

import java.io.*;
import java.math.BigInteger;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    System.out
        .println(new BigInteger(input[0] + input[1]).add(new BigInteger(input[2] + input[3])));
  }
}
