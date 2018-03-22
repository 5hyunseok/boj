package boj11047;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        String[] arg = br.readLine().split(" ");
        int n = Integer.parseInt(arg[0]);
        int k = Integer.parseInt(arg[1]);
        int remainder = k;
        int count = 0;

        int[] coinCategory = new int[n];
        for(int i=0; i<n; i++){
            coinCategory[i] = Integer.parseInt(br.readLine());
        }

        for(int i=n-1; i>=0; i--){
            while(remainder >= coinCategory[i]) {
                remainder -= coinCategory[i];
                count++;
            }
            if(remainder == 0) break;
        }
        System.out.println(count);

    }
}
