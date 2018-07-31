package boj9417;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        int n = Integer.valueOf(br.readLine());
        for(int i=0; i<n; i++) {
            String[] input = br.readLine().split(" ");
            int[] num = new int[input.length];
            for(int j=0; j<input.length; j++) num[j] = Integer.valueOf(input[j]);
            Arrays.sort(num);
            int max = -1;
            for(int j=0; j<input.length; j++) {
                for(int k=j+1; k<input.length; k++) {
                    int a = num[j];
                    int b = num[k];

                    while(b != 0) {
                        int r = a % b;
                        a = b;
                        b = r;
                    }
                    if(a > max) max = a;
                }
            }
            System.out.println(max);
        }
    }
}
