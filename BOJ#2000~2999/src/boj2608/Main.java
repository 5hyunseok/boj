package boj2608;

import java.io.*;
import java.util.HashMap;

public class Main {
    public static HashMap<String, Integer> dictionary;
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        String[] sign = {"I", "V", "X", "L", "C", "D", "M", "IV", "IX", "XL", "XC", "CD", "CM"};
        int[] value = {1, 5, 10, 50, 100, 500, 1000, 4, 9, 40, 90, 400, 900};
        dictionary = new HashMap<>();
        for(int i=0; i<13; i++) dictionary.put(sign[i], value[i]);

        String[] a = br.readLine().split("");
        String[] b = br.readLine().split("");
        int sum = getValueSum(a) + getValueSum(b);
        System.out.println(sum);

        int thousand = (sum / 1000) * 1000;
        int hundred = ((sum - thousand) / 100) * 100;
        int ten = ((sum - thousand - hundred) / 10) * 10;
        int one = sum % 10;

        StringBuilder sb = new StringBuilder();
        int thousandNum = thousand / 1000;
        int hundredNum = hundred / 100;
        int tenNum = ten / 10;

        // 1000
        for(int i=0; i<thousandNum; i++) sb.append("M");
        // 100
        if(hundredNum < 4) for(int i=0; i<hundredNum; i++) sb.append("C");
        else if(hundredNum == 4) sb.append("CD");
        else if(hundredNum > 4 && hundredNum < 9) {
            sb.append("D");
            for(int i=0; i<hundredNum-5; i++) sb.append("C");
        }
        else if(hundredNum == 9) sb.append("CM");
        // 10
        if(tenNum < 4) for(int i=0; i<tenNum; i++) sb.append("X");
        else if(tenNum == 4) sb.append("XL");
        else if(tenNum > 4 && tenNum < 9) {
            sb.append("L");
            for(int i=0; i<tenNum-5; i++) sb.append("X");
        }
        else if(tenNum == 9) sb.append("XC");
        // 1
        if(one < 4) for(int i=0; i<one; i++) sb.append("I");
        else if(one == 4) sb.append("IV");
        else if(one > 4 && one < 9) {
            sb.append("V");
            for(int i=0; i<one-5; i++) sb.append("I");
        }
        else if(one == 9) sb.append("IX");

        System.out.println(sb.toString());
    }

    public static int getValueSum(String[] a) {
        int aSum = 0;
        boolean isUsed = false;
        for(int i=0; i<a.length-1; i++) {
            if(dictionary.get(a[i]) < dictionary.get(a[i+1])) {
                if(i == a.length-2) isUsed = true;
                aSum += dictionary.get(a[i]+a[i+1]);
                i++;
            } else {
                aSum += dictionary.get(a[i]);
            }
        }
        if(!isUsed) aSum += dictionary.get(a[a.length-1]);
        return aSum;
    }
}

