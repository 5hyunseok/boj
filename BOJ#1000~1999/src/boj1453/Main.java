package boj1453;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        int n = Integer.valueOf(br.readLine());
        boolean[] isTaken = new boolean[100];
        String[] input = br.readLine().split(" ");
        int reject = 0;
        for(int i=0; i<n; i++){
            int target = Integer.valueOf(input[i])-1;
            if (isTaken[target]) reject++;
            else isTaken[target] = true;
        }
        System.out.println(reject);
    }
}
