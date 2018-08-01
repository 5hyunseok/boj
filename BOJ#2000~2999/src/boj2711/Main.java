package boj2711;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        int n = Integer.valueOf(br.readLine());
        for(int i=0; i<n; i++){
            String[] input = br.readLine().split(" ");
            System.out.println(input[1].substring(0, Integer.valueOf(input[0])-1) + input[1].substring(Integer.valueOf(input[0]), input[1].length()));
        }
    }
}
