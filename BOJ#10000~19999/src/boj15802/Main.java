package boj15802;

import java.util.Random;

public class Main {

  public static void main(String args[]) {
    Random generator = new Random();
    if (generator.nextFloat() > 0.5) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }
}
