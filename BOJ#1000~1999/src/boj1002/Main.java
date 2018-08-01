package boj1002;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));
        int n = Integer.valueOf(br.readLine());
        for(int i=0; i<n; i++){
           String[] input = br.readLine().split(" ");
           int result;
           int x1 = Integer.valueOf(input[0]);
           int y1 = Integer.valueOf(input[1]);
           int r1 = Integer.valueOf(input[2]);
           int x2 = Integer.valueOf(input[3]);
           int y2 = Integer.valueOf(input[4]);
           int r2 = Integer.valueOf(input[5]);

           double d = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
           int diff = Math.abs(r1 - r2);

           if(d==0) {
               if(r1 == r2) result = -1;
               else result = 0;
           } else {
               if(d > (r1+r2) || d < diff) result = 0;
               else if(d == (r1+r2) || d == diff) result = 1;
               else result = 2;
           }

           System.out.println(result);
        }
    }
}


