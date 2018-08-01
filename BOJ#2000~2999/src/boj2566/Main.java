package boj2566;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//    BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));
        int max = -1;
        int whichI = -1;
        int whichJ = -1;
        for(int i=0; i<9; i++){
            String[] inputString = br.readLine().split(" ");
            for(int j=0; j<9; j++){
                int input = Integer.valueOf(inputString[j]);
                if(max < input) {
                    max = input;
                    whichI = i;
                    whichJ = j;
                }
            }
        }
        whichI++;
        whichJ++;
        System.out.println(max + "\n" + whichI + " " + whichJ);
    }
}


