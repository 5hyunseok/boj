package boj2490;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        for(int i=0; i<3; i++){
            String[] input = br.readLine().split(" ");
            int sum = 0;
            for (int j=0; j<4; j++) sum += Integer.valueOf(input[j]);
            if (sum == 0) System.out.println("D");
            else if (sum == 1) System.out.println("C");
            else if (sum == 2) System.out.println("B");
            else if (sum == 3) System.out.println("A");
            else if (sum == 4) System.out.println("E");
        }
    }
}
