package boj2577;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        int[] count = new int[10];
        int multiple = 1;
        for(int i=0; i<3; i++) multiple *= Integer.valueOf(br.readLine());
        while(multiple > 0) {
            count[multiple % 10]++;
            multiple /= 10;
        }

        for(int i=0; i<10; i++) System.out.println(count[i]);
    }
}
