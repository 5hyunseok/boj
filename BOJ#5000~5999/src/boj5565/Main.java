package boj5565;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        int totalPrice = Integer.valueOf(br.readLine());
        for(int i=0; i<9; i++) totalPrice -= Integer.valueOf(br.readLine());
        System.out.println(totalPrice);
    }
}
