package boj1978;

import java.io.*;
import java.util.LinkedList;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        LinkedList<Integer> primes = new LinkedList<>();
        for(int i=2; i<=1000; i++) primes.add(i);

        for(int i=2; i<=1000; i++){
            final int a = i;
            if (!primes.contains(a)) continue;
            LinkedList<Integer> toRemove = new LinkedList<>();
            primes.stream()
                    .filter((n) -> n%a==0)
                    .forEach((n) -> toRemove.add(n));
            for(int r : toRemove) if (r != a) primes.remove(new Integer(r));
        }

        br.readLine();
        String[] input = br.readLine().split(" ");
        int count = 0;
        for(int i=0; i<input.length; i++) if (primes.contains(Integer.valueOf(input[i]))) count++;
        System.out.println(count);
    }
}
