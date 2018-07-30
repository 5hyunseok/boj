package boj2506;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        int n = Integer.valueOf(br.readLine());
        String[] input = br.readLine().split(" ");

        int beforeAccumulatedCount = 0;
        int sum = 0;
        for(int i=0; i<n; i++){
            boolean isCorrect = input[i].equals("1");
            if(isCorrect) {
                sum += beforeAccumulatedCount + 1;
                beforeAccumulatedCount++;
            }
            else beforeAccumulatedCount = 0;
        }

        System.out.println(sum);
    }
}
