package boj1373;

import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        String[] baseTwo = {"000", "001", "010", "011", "100", "101", "110", "111"};
        HashMap<String, Integer> dic = new HashMap<>();
        for(int i=0; i<8; i++) dic.put(baseTwo[i], i);

        String input = br.readLine();
        for(int i=0; i<input.length()%3; i++) input = "0" + input;

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<input.length(); i+=3) sb.append(dic.get(input.substring(i, i + 3)));
        System.out.println(sb.toString());
    }
}
