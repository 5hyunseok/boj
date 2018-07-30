package boj2744;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        String[] input = br.readLine().split("");
        for(int i=0; i<input.length; i++){
            if(input[i].compareTo("a") < 0) System.out.print(input[i].toLowerCase());
            else System.out.print(input[i].toUpperCase());
        }
    }
}
