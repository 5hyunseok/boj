package boj11399;

import java.io.*;
import java.util.Arrays;

public class Main {
  public static void main(String args[]) throws IOException {
    InputStream in = System.in;
    InputStreamReader reader = new InputStreamReader(in);
    BufferedReader br = new BufferedReader(reader);
//    BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

    int n = Integer.parseInt(br.readLine());
    String[] inputStr = br.readLine().split(" ");
    int[] input = new int[n];

    for(int i=0; i<inputStr.length; i++){
      input[i] = Integer.parseInt(inputStr[i]);
    }

    Arrays.sort(input);
    int sum = 0;
    for(int i=0; i<input.length; i++){
      sum += input[i] * (input.length - i);
    }
    System.out.println(sum);
  }
}

