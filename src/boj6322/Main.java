package boj6322;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        int caseNum = 1;
        while(true) {
            String[] input = br.readLine().split(" ");
            int a = Integer.valueOf(input[0]);
            int b = Integer.valueOf(input[1]);
            int c = Integer.valueOf(input[2]);
            if(a == 0 && b == 0 && c == 0) break;
            boolean isImpossible = false;

            StringBuilder sb = new StringBuilder();
            sb.append("Triangle #");
            sb.append(caseNum);
            sb.append("\n");

            if(a == -1) {
                if(b >= c) isImpossible = true;
                else {
                    sb.append("a = ");
                    sb.append(String.format("%.3f", Math.sqrt(c * c - b * b)));
                }
            } else if(b == -1) {
                if(a >= c) isImpossible = true;
                else {
                    sb.append("b = ");
                    sb.append(String.format("%.3f", Math.sqrt(c * c - a * a)));
                }
            } else if(c == -1) {
                sb.append("c = ");
                sb.append(String.format("%.3f", Math.sqrt(a * a + b * b)));
            }
            if(isImpossible) sb.append("Impossible.");
            sb.append("\n");
            System.out.println(sb.toString());
            caseNum++;
        }
    }
}
