package boj1673;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = null;
    while ((s = br.readLine()) != null) {
      StringTokenizer st = new StringTokenizer(s, " ");
      int coupons = Integer.valueOf(st.nextToken());
      int k = Integer.valueOf(st.nextToken());

      int chicken = 0;
      int stamp = 0;

      while (coupons > 0) {
        chicken += coupons;
        stamp += coupons;
        coupons = 0;
        if (stamp >= k) {
          coupons += stamp / k;
          stamp -= k * coupons;
        }
      }
      System.out.println(chicken);
    }
  }
}