package boj1406;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        String s = br.readLine();

        int n = Integer.valueOf(br.readLine());
        int cursor = s.length();
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        for(int i=0; i<n; i++) {
            String[] input = br.readLine().split(" ");
            if(input[0].equals("L")) {
                if(cursor > 0) cursor--;
            }else if(input[0].equals("D")) {
                if(cursor < (sb.length())) cursor++;
            }else if(input[0].equals("B")) {
                if(cursor > 0) {
                    sb.delete(cursor-1, cursor);
                    cursor--;
                }
            }else if(input[0].equals("P")) {
                if(cursor < (sb.length())) sb.insert(cursor, input[1]);
                else sb.append(input[1]);
                cursor++;
            }
        }
        System.out.println(sb.toString());
    }
}
