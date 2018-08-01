package boj3029;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        String[] currentTime = br.readLine().split(":");
        int currentSec = 0;
        currentSec += Integer.valueOf(currentTime[0]) * 3600;
        currentSec += Integer.valueOf(currentTime[1]) * 60;
        currentSec += Integer.valueOf(currentTime[2]);

        String[] bumpTime = br.readLine().split(":");
        int bumpSec = 0;
        bumpSec += Integer.valueOf(bumpTime[0]) * 3600;
        bumpSec += Integer.valueOf(bumpTime[1]) * 60;
        bumpSec += Integer.valueOf(bumpTime[2]);

        int diff = bumpSec - currentSec;
        if(diff <= 0) diff += 86400;

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%02d", diff / 3600));
        sb.append(":");
        diff = diff -  (diff / 3600) * 3600;
        sb.append(String.format("%02d", diff / 60));
        sb.append(":");
        diff = diff - (diff / 60) * 60;
        sb.append(String.format("%02d", diff));
        System.out.println(sb.toString());
    }
}
