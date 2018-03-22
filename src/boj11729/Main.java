package boj11729;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws IOException {
//        InputStream in = System.in;
//        InputStreamReader reader = new InputStreamReader(in);
//        BufferedReader br = new BufferedReader(reader);
        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        int n = Integer.parseInt(br.readLine());
        System.out.println(hanoi(n));

        moveAllN(n, 1, 3);
    }

    public static void moveAllN(int n, int from, int to) {
        if(n == 1) {
            System.out.println(from + " " + to);
            return;
        }
        int remainder = 6 - from - to;
        moveAllN(n-1, from, remainder);
        moveAllN(1, from, to);
        moveAllN(n-1, remainder, to);
    }

    public static int hanoi(int n) {
        if (n == 1) return 1;
        else return hanoi(n-1) * 2 + 1;
    }
}

