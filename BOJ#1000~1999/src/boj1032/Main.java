package boj1032;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        int n = Integer.valueOf(br.readLine());
        String[] compared = br.readLine().split("");
        boolean[] isDiff = new boolean[compared.length];

        for(int i=1; i<n; i++) {
            String[] input = br.readLine().split("");
            for(int j=0; j<compared.length; j++) {
                if(!compared[j].equals(input[j])) {
                    isDiff[j] = true;
                }
            }
        }
        for(int i=0; i<compared.length; i++) {
            if(isDiff[i]) System.out.print("?");
            else System.out.print(compared[i]);
        }
    }
}
