package boj9933;

import java.io.*;
import java.util.LinkedList;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        int n = Integer.valueOf(br.readLine());
        LinkedList<String> list = new LinkedList<>();
        for(int i=0; i<n; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(br.readLine());
            list.add(sb.toString());
            if(list.contains(sb.reverse().toString())) {
                String s = sb.toString();
                System.out.println(s.length() + " " + s.charAt(s.length() / 2));
                break;
            };
        }
    }
}
