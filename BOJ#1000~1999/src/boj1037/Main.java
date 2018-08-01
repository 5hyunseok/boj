package boj1037;

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

        String[] inputA = br.readLine().split(" ");

        for(int i=0; i<n; i++){
            a.add(Integer.valueOf(inputA[i]));
        }

        Collections.sort(a);
        System.out.println(a.getFirst()*a.getLast());
    }
}
