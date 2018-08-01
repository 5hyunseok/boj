package boj2163;

import java.io.*;

public class Main {
    public static int[][] store;
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));
        String[] input = br.readLine().split(" ");
        int n = Integer.valueOf(input[0]);
        int m = Integer.valueOf(input[1]);
        store = new int[n+1][m+1];
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                store[i][j] = -1;
            }
        }
        store[1][1] = 0;
        for(int i=1; i<n+1; i++){
            store[i][1] = i-1;
        }
        for(int i=1; i<m+1; i++){
            store[1][i] = i-1;
        }
        System.out.println(splitChocolate(n,m));
    }

    public static int splitChocolate(int n, int m) {
        if(store[n][m] != -1) return store[n][m];
        store[n][m] = Math.min(
                splitChocolate(n-1, m) + splitChocolate(1, m) + 1,
                splitChocolate(n, m-1) + splitChocolate(n, 1) + 1
        );
        return store[n][m];
    }
}
