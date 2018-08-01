package boj1550;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        char[] input = br.readLine().toCharArray();
        int base = 1;
        int res = 0;
        for(int i=input.length-1; i>=0; i--){
            if(input[i] >= 48 && input[i] <= 57) res += (Integer.valueOf(input[i]) - 48) * base;
            else res += (Integer.valueOf(input[i]) - 55) * base;
            base *= 16;
        }

        System.out.println(res);
    }
}
