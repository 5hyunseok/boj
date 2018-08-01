package boj10886;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        int n = Integer.valueOf(br.readLine());
        int cute = 0;
        int notCute = 0;
        for(int i=0; i<n; i++) {
            if(Integer.valueOf(br.readLine()) == 1) cute++;
            else notCute++;
        }
        if(cute > notCute) System.out.println("Junhee is cute!");
        else System.out.println("Junhee is not cute!");
    }
}