package boj9086;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        int caseNum = Integer.valueOf(br.readLine());
        for(int i=0; i<caseNum; i++) {
            String input = br.readLine();
            if(input.length() == 0) System.out.println("");
            else System.out.println(input.substring(0,1) + input.substring(input.length()-1,input.length()));
        }
    }
}
