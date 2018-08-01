package boj1546;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        int n = Integer.valueOf(br.readLine());
        int m = -1;
        int sum = 0;
        String[] input = br.readLine().split(" ");
        for(int i=0; i<input.length; i++){
            int score = Integer.valueOf(input[i]);
            if (score > m) m = score;
            sum += score;
        }
        double res = (double)(sum * 100) / (n * m);
        System.out.println(res);
    }
}
