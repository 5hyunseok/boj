package boj11721;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        String input = br.readLine();
        for(int i=0; i<input.length(); i+=10) {
            if((i+10) > input.length()) System.out.println(input.substring(i, input.length()));
            else System.out.println(input.substring(i, i+10));
        }
    }
}
