package boj2588;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        int n = Integer.valueOf(br.readLine());
        int m = Integer.valueOf(br.readLine());

        int base = 1;
        for(int i=0; i<3; i++){
            base *= 10;
            System.out.println(n * ((m % base) / (base / 10)));
        }
        System.out.println(n*m);
    }
}
