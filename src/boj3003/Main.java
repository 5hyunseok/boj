package boj3003;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        String[] input = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append(1 - Integer.valueOf(input[0]));
        sb.append(" ");
        sb.append(1 - Integer.valueOf(input[1]));
        sb.append(" ");
        sb.append(2 - Integer.valueOf(input[2]));
        sb.append(" ");
        sb.append(2 - Integer.valueOf(input[3]));
        sb.append(" ");
        sb.append(2 - Integer.valueOf(input[4]));
        sb.append(" ");
        sb.append(8 - Integer.valueOf(input[5]));
        System.out.println(sb.toString());
    }
}
