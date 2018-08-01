package boj1026;

import java.io.*;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));
        int n = Integer.valueOf(br.readLine());
        LinkedList<Integer> a = new LinkedList<>();
        LinkedList<Integer> b = new LinkedList<>();
        String[] inputA = br.readLine().split(" ");
        String[] inputB = br.readLine().split(" ");
        for(int i=0; i<n; i++){
            a.add(Integer.valueOf(inputA[i]));
            b.add(Integer.valueOf(inputB[i]));
        }

        Collections.sort(a);
        Collections.sort(b);

        int sum = 0;
        for(int i=0; i<n; i++){
            sum += a.get(i)*b.get(n-1-i);
        }
        System.out.println(sum);
    }
}
