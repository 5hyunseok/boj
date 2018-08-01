package boj2605;

import java.io.*;
import java.util.Vector;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        int n = Integer.valueOf(br.readLine());
        Vector<Integer> vector = new Vector<>();
        for(int i=1; i<=n; i++) vector.add(i);
        String[] input = br.readLine().split(" ");
        for(int i=0; i<input.length; i++) {
            int num = vector.remove(i);
            vector.insertElementAt(num, i - Integer.valueOf(input[i]));
        }
        StringBuilder sb = new StringBuilder();
        for(int i : vector) sb.append(i + " ");
        System.out.println(sb.toString());
    }
}
