package boj2845;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        String[] input = br.readLine().split(" ");
        int num = Integer.valueOf(input[0]) * Integer.valueOf(input[1]);

        String[] articles = br.readLine().split(" ");
        StringBuilder output = new StringBuilder();
        for(int i=0; i<5; i++){
            output.append(Integer.valueOf(articles[i]) - num);
            output.append(" ");
        }
        System.out.println(output.toString());
    }
}
