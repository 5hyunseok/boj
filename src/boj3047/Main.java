package boj3047;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        String[] input = br.readLine().split(" ");
        int[] num = new int[3];
        for(int i=0; i<3; i++) num[i] = Integer.valueOf(input[i]);
        Arrays.sort(num);

        String order = br.readLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<3; i++){
            if(order.charAt(i) == 'A') sb.append(num[0]);
            else if(order.charAt(i) == 'B') sb.append(num[1]);
            else sb.append(num[2]);
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
