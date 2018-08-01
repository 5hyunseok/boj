package boj2875;

import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {
  public static void main(String args[]) throws IOException {
    InputStream in = System.in;
    InputStreamReader reader = new InputStreamReader(in);
    BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));
    String[] inputStr = br.readLine().split(" ");
    int numOfGirls = Integer.parseInt(inputStr[0]);
    int numOfBoys = Integer.parseInt(inputStr[1]);
    int numOfIntern = Integer.parseInt(inputStr[2]);
    int result = 0;

    while(numOfGirls > 1 && numOfBoys > 0){
      numOfGirls -= 2;
      numOfBoys -= 1;
      result += 1;
    }

    while(numOfGirls > 0){
      numOfIntern -= 1;
      numOfGirls -= 1;
    }
    while(numOfBoys > 0){
      numOfIntern -= 1;
      numOfBoys -= 1;
    }

    while(numOfIntern > 0){
      result -= 1;
      numOfIntern -= 3;
    }

    System.out.println(result);
  }
}

