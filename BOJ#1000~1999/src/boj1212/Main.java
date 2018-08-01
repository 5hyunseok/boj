package boj1212;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        String[] base2 = {"000", "001", "010", "011", "100", "101", "110", "111"};
        String[] input = br.readLine().split("");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<input.length; i++){
            sb.append(base2[Integer.valueOf(input[i])]);
        }

        String result = sb.toString();
        while(result.length() > 1) {
            if(result.charAt(0) == '0') result = result.substring(1);
            else break;
        }
        System.out.println(result);
    }
}
