package boj5074;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = null;
    while ((s = br.readLine()) != null) {
      if (s.equals("00:00 00:00")) {
        break;
      }
      StringTokenizer st = new StringTokenizer(s, " ");
      StringTokenizer hm = new StringTokenizer(st.nextToken(), ":");
      int startHour = Integer.valueOf(hm.nextToken());
      int startMin = Integer.valueOf(hm.nextToken());
      hm = new StringTokenizer(st.nextToken(), ":");
      int durationHour = Integer.valueOf(hm.nextToken());
      int durationMin = Integer.valueOf(hm.nextToken());

      int finalMin = startMin + durationMin;
      int finalHour = startHour + durationHour;
      int count = 0;
      if (finalMin >= 60) {
        finalMin -= 60;
        finalHour++;
      }
      while (finalHour >= 24) {
        finalHour -= 24;
        count++;
      }
      System.out.print(String.format("%02d", finalHour) + ":" + String.format("%02d", finalMin));
      System.out.print(count > 0 ? " +" + count : "");
      System.out.print("\n");

    }

  }
}