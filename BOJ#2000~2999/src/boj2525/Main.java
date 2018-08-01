package boj2525;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        String[] input = br.readLine().split(" ");
        int nowHour = Integer.valueOf(input[0]);
        int nowMin = Integer.valueOf(input[1]);

        int duration = Integer.valueOf(br.readLine());
        nowHour += (duration / 60);
        nowMin += (duration % 60);
        if (nowMin >= 60) {
            nowMin -= 60;
            nowHour += 1;
        }
        System.out.println(nowHour%24 + " " + nowMin);
    }
}
