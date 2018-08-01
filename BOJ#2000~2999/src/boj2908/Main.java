package boj2908;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        String[] input = br.readLine().split(" ");
        int bigger = 0;
        for(int i=2; i>=0; i--){
            if(input[0].charAt(i) > input[1].charAt(i)) {
                bigger = 0;
                break;
            } else if (input[0].charAt(i) < input[1].charAt(i)) {
                bigger = 1;
                break;
            }
        }
        StringBuilder sb = new StringBuilder(input[bigger]);
        System.out.println(sb.reverse().toString());
    }
}
