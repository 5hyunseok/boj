package boj1676;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        int n = Integer.valueOf(br.readLine());
        int numOfTwo = 0;
        int numOfFive = 0;

        for(int i=1; i<=n; i++) {
            int num = i;
            while(num%2 == 0) {
                numOfTwo++;
                num /= 2;
            }
            num = i;
            while(num%5 == 0) {
                numOfFive++;
                num /= 5;
            }
        }

        System.out.println(Math.min(numOfFive, numOfTwo));
    }
}
