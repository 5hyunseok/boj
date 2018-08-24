package boj10175;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

    int n = Integer.valueOf(br.readLine());
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      String location = st.nextToken();
      char[] species = st.nextToken().toCharArray();
      int[] count = new int[4]; // B C M W
      for (int j = 0; j < species.length; j++) {
        switch (species[j]) {
          case 'B':
            count[0] += 2;
            break;
          case 'C':
            count[1] += 1;
            break;
          case 'M':
            count[2] += 4;
            break;
          case 'W':
            count[3] += 3;
            break;
        }
      }
      int max = -1;
      int maxIdx = -1;
      for (int j = 0; j < 4; j++) {
        if (count[j] > max) {
          max = count[j];
          maxIdx = j;
        }
      }
      boolean hasNoDominant = false;
      for (int j = 0; j < 4; j++) {
        if (j == maxIdx) {
          continue;
        }
        if (count[j] == count[maxIdx]) {
          hasNoDominant = true;
        }
      }
      StringBuilder sb = new StringBuilder();
      sb.append(location);
      sb.append(": ");
      if (hasNoDominant) {
        sb.append("There is no dominant species");
      } else {
        sb.append("The ");
        if (maxIdx == 0) {
          sb.append("Bobcat ");
        } else if (maxIdx == 1) {
          sb.append("Coyote ");
        } else if (maxIdx == 2) {
          sb.append("Mountain Lion ");
        } else {
          sb.append("Wolf ");
        }
        sb.append("is the dominant species");
      }
      System.out.println(sb.toString());
    }
  }
}
