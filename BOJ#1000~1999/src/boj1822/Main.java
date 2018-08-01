package boj1822;

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

        TreeSet<Integer> a = new TreeSet<>();
        TreeSet<Integer> b = new TreeSet<>();
        TreeSet<Integer> res = new TreeSet<>();

        for(int i=0; i<n; i++) a.add(Integer.valueOf(inputA[i]));
        for(int i=0; i<m; i++) b.add(Integer.valueOf(inputB[i]));

        for(int i : a)
            if (!b.contains(i)) {
                res.add(i);
                b.remove(new Integer(i));
            }
        System.out.println(res.size());
        for(int i : res) System.out.print(i + " ");
    }
}
