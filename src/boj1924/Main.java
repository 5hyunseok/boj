package boj1924;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String args[]) throws IOException, ParseException {
        String[] dayName = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));
        String[] input = br.readLine().split(" ");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date t = sdf.parse("2017-" + String.format("%02d", Integer.valueOf(input[0])) + "-" + String.format("%02d", Integer.valueOf(input[1])));

        System.out.println(dayName[t.getDay()]);
    }
}
