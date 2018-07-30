package boj2953;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        int max = -1;
        int who = -1;
        for(int i=0; i<5; i++){
            int sum = 0;
            String[] scores = br.readLine().split(" ");
            for(int j=0; j<4; j++) sum += Integer.valueOf(scores[j]);
            if(sum > max) {
                max = sum;
                who = i;
            }
        }
        System.out.println((who+1) + " " + max);
    }
}
