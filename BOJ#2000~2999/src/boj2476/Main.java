package boj2476;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        int n = Integer.valueOf(br.readLine());
        int max = 0;
        for(int i=0; i<n; i++){
            int reward;
            String[] input = br.readLine().split(" ");
            int first = Integer.valueOf(input[0]);
            int second = Integer.valueOf(input[1]);
            int third = Integer.valueOf(input[2]);
            if (first == second && second == third) reward = 10000 + first * 1000;
            else if (first == second || second == third) reward = 1000 + second * 100;
            else if (first == third) reward = 1000 + first * 100;
            else reward = Math.max(Math.max(first, second), third) * 100;
            if (reward > max) max = reward;
        }
        System.out.println(max);

    }
}
