package boj2501;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        String[] input = br.readLine().split(" ");
        int n = Integer.valueOf(input[0]);
        int k = Integer.valueOf(input[1]);

        int count = 0;
        int answer = 0;
        boolean hasAnswer = false;
        for(int i=1; i<=n; i++){
            if(n%i == 0) {
                count++;
                answer = i;
            }
            if(count == k) {
                hasAnswer = true;
                break;
            }
        }
        if(!hasAnswer) System.out.println("0");
        else System.out.println(answer);
    }
}
