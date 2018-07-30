package boj2562;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//    BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));
        int max = -1;
        int which = -1;
        for(int i=0; i<9; i++){
            int input = Integer.valueOf(br.readLine());
            if(max < input) {
                max = input;
                which = i;
            }
        }
        which++;
        System.out.println(max + "\n" + which);
    }
}


