package boj1541;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
  public static void main(String args[]) throws IOException {
    InputStream in = System.in;
    InputStreamReader reader = new InputStreamReader(in);
    BufferedReader br = new BufferedReader(reader);
//    BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));
    String str = br.readLine();
    String[] part = str.split("-");
    LinkedList<Integer> sumOfPart = new LinkedList<Integer>();

    for(int i=0; i<part.length; i++){
      String[] numbers = part[i].split("[+]");
      int sum = 0;
      for(String num : numbers){
        sum += Integer.parseInt(num);
      }
      sumOfPart.add(sum);
    }

    int result = sumOfPart.get(0);
    for(int i=1; i<sumOfPart.size(); i++){
      result -= sumOfPart.get(i);
    }

    System.out.println(result);
  }
}


