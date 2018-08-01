package boj2998;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        String[] binaries = {"000", "001", "010", "011", "100", "101", "110", "111"};
        String input = br.readLine();
        if(input.length() % 3 != 0) for (int i = 0; i < (input.length() % 3); i++) input = "0" + input;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<input.length(); i+=3){
            for(int j=0; j<8; j++) if(binaries[j].equals(input.substring(i, i+3))) {
                sb.append(j);
                break;
            }
        }
        System.out.println(sb.toString());
    }
}
