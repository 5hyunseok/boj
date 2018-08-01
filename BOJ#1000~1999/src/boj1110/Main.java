package boj1110;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        int n = Integer.valueOf(br.readLine());
        int count = 0;
        int oldOne = n;
        while(true) {
            int newOne = (oldOne/10) + oldOne%10;
            newOne %= 10;
            newOne += (oldOne%10)*10;
            count++;
            if(newOne == n) break;
            oldOne = newOne;
        }
        System.out.println(count);
    }
}
