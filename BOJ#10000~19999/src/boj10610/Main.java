package boj10610;

import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {
  public static void main(String args[]) throws IOException {
    InputStream in = System.in;
    InputStreamReader reader = new InputStreamReader(in);
    BufferedReader br = new BufferedReader(reader);

    String input = br.readLine();
    LinkedList<Integer> nums = new LinkedList<Integer>();

    int sum = 0;
    boolean hasZero = false;

    for(int i=0; i<input.length(); i++){
      int temp = input.charAt(i);
      temp -= 48;
      nums.add(temp);
      sum += temp;
      if(temp == 0) hasZero = true;
    }

    if(!hasZero || (sum % 3 != 0)) {
      System.out.println(-1);
    } else {
      Collections.sort(nums, new Comparator<Integer>() {
        @Override
        public int compare(Integer integer, Integer t1) {
          return t1 - integer;
        }
      });

      for(int i=0; i<nums.size(); i++) {
        System.out.print(nums.get(i));
      }
    }
  }
}
