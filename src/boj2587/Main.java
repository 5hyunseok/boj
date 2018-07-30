package boj2587;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        int sum = 0;
        int[] arr = new int[5];
        for(int i=0; i<5; i++){
            int input = Integer.valueOf(br.readLine());
            sum += input;
            arr[i] = input;
        }
        Arrays.sort(arr);
        System.out.println(sum/5 + "\n" + arr[2]);
    }
}
