package boj1100;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        int count = 0;
        for(int i=0; i<8; i++){
            String[] line = br.readLine().split("");
            for(int j=0; j<8; j++){
                if(line[j].equals("F")) {
                    if((i%2) == 0 && (j%2) == 0) count++;
                    if((i%2) != 0 && (j%2) != 0) count++;
                }
            }
        }
        System.out.println(count);
    }
}
