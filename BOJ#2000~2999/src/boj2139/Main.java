package boj2139;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

  public static void main(String args[]) throws IOException, ParseException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String s = null;
    while ((s = br.readLine()) != null) {
      if (s.equals("0 0 0")) {
        break;
      }

      DateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
      Date date = dateFormat.parse(s);
      long targetTime = date.getTime();

      Date base = dateFormat.parse("1 1 " + s.split(" ")[2]);
      long baseTime = base.getTime();

      System.out.println(((targetTime - baseTime) / 86400000) + 1);
    }
  }
}
