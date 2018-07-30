package boj2864;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        String[] input = br.readLine().split(" ");
        StringBuilder maxBuilder = new StringBuilder();
        StringBuilder minBuilder = new StringBuilder();
        for(int i=0; i<input[0].length(); i++) {
            if (input[0].charAt(i) == '5') {
                maxBuilder.append(6);
                minBuilder.append(5);
            } else if (input[0].charAt(i) == '6') {
                maxBuilder.append(6);
                minBuilder.append(5);
            } else {
                maxBuilder.append(input[0].charAt(i));
                minBuilder.append(input[0].charAt(i));
            }
        }
        int allSixA = Integer.valueOf(maxBuilder.toString());
        int allFiveA = Integer.valueOf(minBuilder.toString());

        maxBuilder = new StringBuilder();
        minBuilder = new StringBuilder();
        for(int i=0; i<input[1].length(); i++) {
            if (input[1].charAt(i) == '5') {
                maxBuilder.append(6);
                minBuilder.append(5);
            } else if (input[1].charAt(i) == '6') {
                maxBuilder.append(6);
                minBuilder.append(5);
            } else {
                maxBuilder.append(input[1].charAt(i));
                minBuilder.append(input[1].charAt(i));
            }
        }
        int allSixB = Integer.valueOf(maxBuilder.toString());
        int allFiveB = Integer.valueOf(minBuilder.toString());

        System.out.print(allFiveA + allFiveB);
        System.out.print(" ");
        System.out.print(allSixA + allSixB);
    }
}
