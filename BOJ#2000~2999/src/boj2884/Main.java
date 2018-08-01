package boj2884;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));
        String[] input = br.readLine().split(" ");

        int hour = Integer.valueOf(input[0]);
        int min = Integer.valueOf(input[1]);

        min -= 45;
        if(min < 0) {
            hour--;
            min += 60;
        }
        if(hour < 0) hour += 24;
        System.out.println(hour + " " + min);

    }
}

