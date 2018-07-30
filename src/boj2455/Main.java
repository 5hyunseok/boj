package boj2455;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        int max = 0;
        int count = 0;
        for(int i=0; i<4; i++){
            String[] input = br.readLine().split(" ");
            count -= Integer.valueOf(input[0]);
            count += Integer.valueOf(input[1]);
            if(count > max) max = count;
        }
        System.out.println(max);
    }
}
