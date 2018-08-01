package boj2750;

import java.io.*;
import java.util.TreeSet;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        int n = Integer.valueOf(br.readLine());
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int i=0; i<n; i++) treeSet.add(Integer.valueOf(br.readLine()));
        for(int i : treeSet) System.out.println(i);
    }
}
