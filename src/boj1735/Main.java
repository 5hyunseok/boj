package boj1735;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(s->Integer.valueOf(s)).toArray();
        int[] b = Arrays.stream(br.readLine().split(" ")).mapToInt(s->Integer.valueOf(s)).toArray();
        int dA = a[1];
        int dB = b[1];

        // 통분
        a[0] *= dB;
        a[1] *= dB;
        b[0] *= dA;
        b[1] *= dA;

        int[] res = new int[2];
        res[0] = a[0] + b[0];
        res[1] = a[1];

        //약분
        int x = res[0];
        int y = res[1];

        if (res[0] < res[1]) {
            x = res[1];
            y = res[0];
        }
        while(y != 0) {
            int n = x % y;
            x = y;
            y = n;
        }
        int gcd = x;

        System.out.print(res[0] / gcd);
        System.out.print(" ");
        System.out.print(res[1] / gcd);
    }
}
