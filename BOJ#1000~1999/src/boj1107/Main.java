package boj1107;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

  public static final int MAX = Integer.MAX_VALUE;

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.valueOf(br.readLine());
    int brokenNum = Integer.valueOf(br.readLine());
    LinkedList<Integer> brokens = new LinkedList<>();
    if(brokenNum > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      for (int i = 0; i < brokenNum; i++) {
        brokens.add(Integer.valueOf(st.nextToken()));
      }
    }


    int onlyPlusMinus = Math.abs(n - 100);

    int firstAvailableFromMinus = -1;
    int i = n;
    while (i >= 0) {
      if (isAllNotBroken(i, brokens)) {
        firstAvailableFromMinus = i;
        break;
      }
      i--;
    }
    if (firstAvailableFromMinus == -1) {
      firstAvailableFromMinus = MAX;
    }

    int firstAvailableFromPlus = -1;
    int j = n;
    while (j <= 1000000) {
      if (isAllNotBroken(j, brokens)) {
        firstAvailableFromPlus = j;
        break;
      }
      j++;
    }
    if (firstAvailableFromPlus == -1) {
      firstAvailableFromPlus = MAX;
    }

    if (firstAvailableFromMinus != MAX) {
      firstAvailableFromMinus =
          Integer.toString(firstAvailableFromMinus).length() + (n - firstAvailableFromMinus);
    }
    if (firstAvailableFromPlus != MAX) {
      firstAvailableFromPlus =
          Integer.toString(firstAvailableFromPlus).length() + (firstAvailableFromPlus - n);
    }

    System.out.println(
        Math.min(Math.min(firstAvailableFromMinus, firstAvailableFromPlus), onlyPlusMinus));
  }

  public static boolean isAllNotBroken(int n, LinkedList<Integer> brokens) {
    if (brokens.size() == 10) {
      return false;
    }
    if (brokens.size() == 0) {
      return true;
    }
    char[] chars = Integer.toString(n).toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if (brokens.contains(Integer.valueOf(Character.toString(chars[i])))) {
        return false;
      }
    }
    return true;
  }
}
