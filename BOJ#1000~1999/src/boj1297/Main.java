package boj1297;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int diagonal = Integer.valueOf(st.nextToken());
    int width = Integer.valueOf(st.nextToken());
    int height = Integer.valueOf(st.nextToken());

    double base = Math.sqrt(Math.pow(diagonal, 2) / (Math.pow(width, 2) + Math.pow(height, 2)));
    width *= base;
    height *= base;

    System.out.println(width + " " + height);
  }
}

