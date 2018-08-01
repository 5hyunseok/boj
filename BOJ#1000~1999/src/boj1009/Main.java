package boj1009;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));
        int n = Integer.valueOf(br.readLine());
        for(int i=0; i<n; i++){
            String[] input = br.readLine().split(" ");
            int result = 1;
            int a = Integer.valueOf(input[0]);
            int b = Integer.valueOf(input[1]);

            for(int j=0; j<b; j++){
                result = (result * a) % 10;
            }
            if (result == 0) System.out.println("10");
            else System.out.println(result);
        }
    }
}


