package boj5361;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
        double[] price = {350.34, 230.90, 190.55, 125.30, 180.90};
        int n = Integer.valueOf(br.readLine());
        for(int i=0; i<n; i++) {
            String[] input = br.readLine().split(" ");
            double sum = 0;
            for(int j=0; j<5; j++) sum += Integer.valueOf(input[j]) * price[j];
            System.out.println("$" + String.format("%.2f", sum));
        }
    }
}
