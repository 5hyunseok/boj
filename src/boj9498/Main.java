package boj9498;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        int n = Integer.valueOf(br.readLine());
        String result;
        if(n >= 90) result = "A";
        else if(n >= 80) result = "B";
        else if(n >= 70) result = "C";
        else if(n >= 60) result = "D";
        else result = "F";
        System.out.println(result);
    }
}
