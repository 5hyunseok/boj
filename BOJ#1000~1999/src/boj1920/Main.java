package boj1920;

import java.io.*;
import java.util.TreeSet;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        br.readLine();
        TreeSet<Integer> A = new TreeSet<>();
        for(String s : br.readLine().split(" ")) A.add(Integer.valueOf(s));
        br.readLine();
        String[] input = br.readLine().split(" ");
        for(int i=0; i<input.length; i++){
            if(A.contains(Integer.valueOf(input[i]))) System.out.println("1");
            else System.out.println("0");
        }
    }
}
