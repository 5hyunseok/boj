package boj2592;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] count = new int[100];
    int[] num = new int[10];
    int sum = 0;
    for (int i = 0; i < 10; i++) {
      String input = br.readLine();
      num[i] = Integer.valueOf(input.substring(0, input.length() - 1));
      sum += num[i];
      count[num[i]]++;
    }
    System.out.println(sum);
    int max = -1;
    int idx = -1;
    for(int i=0; i<100; i++){
      if(count[i] > max) {
        max = count[i];
        idx = i;
      }
    }
    System.out.println(idx * 10);
  }
}
