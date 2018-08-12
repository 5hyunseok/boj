package boj1316;

import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));
    int n = Integer.valueOf(br.readLine());

    int groupWordCount = 0;
    for (int i = 0; i < n; i++) {
      int[] count = new int[26];
      boolean isGroupWord = true;

      String s = br.readLine();
      char[] charArray = s.toCharArray();
      char prevChar = 'A';
      for (int j = 0; j < charArray.length; j++) {
        if (prevChar != charArray[j]) {
          if (count[(int) charArray[j] - 97] > 0) {
            isGroupWord = false;
            break;
          } else {
            count[(int) charArray[j] - 97]++;
          }
        }
        prevChar = charArray[j];
      }
      if (isGroupWord) {
        groupWordCount++;
      }
    }
    System.out.println(groupWordCount);

  }
}
