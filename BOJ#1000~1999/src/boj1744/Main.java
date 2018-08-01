package boj1744;

import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {
  public static void main(String args[]) throws IOException {
    InputStream in = System.in;
    InputStreamReader reader = new InputStreamReader(in);
    BufferedReader br = new BufferedReader(reader);
//    BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

    int n = Integer.parseInt(br.readLine());
    int result = 0;
    boolean hasZero = false;

    LinkedList<Integer> posNums = new LinkedList<Integer>();
    LinkedList<Integer> negNums = new LinkedList<Integer>();
    for(int i=0; i<n; i++){
      int t = Integer.parseInt(br.readLine());
      if(t > 1) posNums.add(t);
      else if (t == 1) result += 1;
      else if (t < 0) negNums.add(t);
      else hasZero = true;
    }

    // positive numbers
    Collections.sort(posNums, new Comparator<Integer>() {
      @Override
      public int compare(Integer t1, Integer t2) {
        return t2 - t1;
      }
    });
    Collections.sort(negNums);

    for(int i=0; i<posNums.size()/2; i++){
      result += posNums.get(i*2) * posNums.get(i*2+1);
    }
    if(posNums.size() % 2 != 0) result += posNums.get(posNums.size() - 1);

    for(int i=0; i<negNums.size()/2; i++){
      result += negNums.get(i*2) * negNums.get(i*2+1);
    }
    if(negNums.size() % 2 != 0) {
      if(!hasZero) result += negNums.get(negNums.size() - 1);
    }

    System.out.println(result);
  }
}

