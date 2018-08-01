package boj1269;

import java.io.*;
import java.util.TreeSet;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        String[] input = br.readLine().split(" ");
        String[] inputA = br.readLine().split(" ");
        String[] inputB = br.readLine().split(" ");

        int n = Integer.valueOf(input[0]);
        int m = Integer.valueOf(input[1]);

        int[] a = new int[n];
        TreeSet<Integer> b = new TreeSet<>();

        for(int i=0; i<n; i++) a[i] = Integer.valueOf(inputA[i]);
        for(int i=0; i<m; i++) b.add(Integer.valueOf(inputB[i]));

        int count = 0;
        for(int i : a) if(b.contains(i)) count++;
        System.out.println(n+m-count-count);
    }
}

