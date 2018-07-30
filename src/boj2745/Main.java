package boj2745;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        String[] input = br.readLine().split(" ");
        int b = Integer.valueOf(input[1]);
        int base = 1;
        int result = 0;
        for(int i=input[0].length()-1; i>=0; i--){
            int ascii = (int)input[0].charAt(i);
            if(ascii > 57) ascii -= 55;
            else ascii -= 48;
            result += ascii * base;
            base *= b;
        }
        System.out.println(result);
    }
}
