package boj2558;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//    BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));
        System.out.println(Integer.valueOf(br.readLine()) + Integer.valueOf(br.readLine()));
    }
}


