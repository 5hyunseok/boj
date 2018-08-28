package boj5635;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException, ParseException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.valueOf(br.readLine());
    LinkedList<String> names = new LinkedList<>();
    LinkedList<Long> birthdays = new LinkedList<>();
    SimpleDateFormat dt = new SimpleDateFormat("dd MM yyyy");
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      names.add(st.nextToken());
      Date date = dt.parse(st.nextToken() + " " + st.nextToken() + " " + st.nextToken());
      birthdays.add(date.getTime());
    }

    long min = Long.MAX_VALUE;
    long max = Long.MIN_VALUE;
    int minIdx = -1;
    int maxIdx = -1;
    for (int i = 0; i < birthdays.size(); i++) {
      long b = birthdays.get(i);
      if (b < min) {
        min = b;
        minIdx = i;
      }
      if (b > max) {
        max = b;
        maxIdx = i;
      }
    }
    System.out.println(names.get(maxIdx));
    System.out.println(names.get(minIdx));
  }
}
