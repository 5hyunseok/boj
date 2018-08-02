package boj10799;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        String[] input = br.readLine().split("");
        Stack<Integer> stick = new Stack<>();
        int sum = 0;
        boolean isPrevOpen = false;
        for(int i=0; i<input.length; i++) {
            if(input[i].equals("(")) {
                stick.push(0);
                isPrevOpen = true;
            } else if(input[i].equals(")")) {
                stick.pop();
                if(isPrevOpen) {
                    // is laser.
                    sum += stick.size();
                } else {
                    // is end of the stick
                    sum++;
                }
                isPrevOpen = false;
            }
        }
        System.out.println(sum);
    }
}
