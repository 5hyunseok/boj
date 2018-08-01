package boj8741;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        int k = Integer.valueOf(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<k; i++) sb.append("1");
        for(int i=1; i<k; i++) sb.append("0");
        System.out.println(sb.toString());
    }
}
