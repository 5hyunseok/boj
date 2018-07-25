package boj1152;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));
        String input = br.readLine().trim();
        int count = 0;
        boolean hasOnlyBlank = true;
        for(int i=0; i<input.length(); i++) {
            if(input.charAt(i) == ' ' && input.charAt(i-1) != ' ') count++;
            else hasOnlyBlank = false;
        }

        if(hasOnlyBlank) System.out.println(count);
        else System.out.println(count+1);
    }
}
