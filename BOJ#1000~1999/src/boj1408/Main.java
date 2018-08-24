package boj1408;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

    StringTokenizer st = new StringTokenizer(br.readLine(), ":");
    int currentHour = Integer.valueOf(st.nextToken());
    int currentMin = Integer.valueOf(st.nextToken());
    int currentSec = Integer.valueOf(st.nextToken());

    st = new StringTokenizer(br.readLine(), ":");
    int startHour = Integer.valueOf(st.nextToken());
    int startMin = Integer.valueOf(st.nextToken());
    int startSec = Integer.valueOf(st.nextToken());

    int resultSec = startSec - currentSec;

    if (resultSec < 0) {
      startMin--;
      resultSec += 60;
    }

    int resultMin = startMin - currentMin;

    if (resultMin < 0) {
      startHour--;
      resultMin += 60;
    }

    int resultHour = startHour - currentHour;

    if (resultHour < 0) {
      resultHour += 24;
    }

    System.out.println(
        String.format("%02d", resultHour) + ":" + String.format("%02d", resultMin) + ":" + String
            .format("%02d", resultSec));
  }
}

