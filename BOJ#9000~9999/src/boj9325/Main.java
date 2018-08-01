package boj9325;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        int caseNum = Integer.valueOf(br.readLine());
        for(int i=0; i<caseNum; i++) {
            long carPrice = Long.valueOf(br.readLine());
            long numOfOptions = Long.valueOf(br.readLine());
            long sum = carPrice;
            for(int j=0; j<numOfOptions; j++) {
                String[] input = br.readLine().split(" ");
                sum += Long.valueOf(input[0]) * Long.valueOf(input[1]);
            }
            System.out.println(sum);
        }
    }
}
