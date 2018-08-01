package boj2563;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        int n = Integer.valueOf(br.readLine());
        boolean[][] blacked = new boolean[100][100];
        for(int i=0; i<n; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.valueOf(input[0]);
            int b = Integer.valueOf(input[1]);
            for(int j=a; j<a+10; j++) {
                for(int k=b; k<b+10; k++) {
                    blacked[j][k] = true;
                }
            }
        }
        int sum = 0;
        for(int i=0; i<100; i++) {
            for(int j=0; j<100; j++) {
                if(blacked[i][j]) sum++;
            }
        }
        System.out.println(sum);

    }
}