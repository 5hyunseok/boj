package boj2752;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));
        String[] input = br.readLine().split(" ");
        int[] arr = new int[3];
        for(int i=0; i<3; i++) arr[i] = Integer.valueOf(input[i]);
        Arrays.sort(arr);
        for(int i=0; i<3; i++) System.out.print(arr[i] + " ");
    }
}
