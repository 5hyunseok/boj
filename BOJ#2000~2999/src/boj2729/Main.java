package boj2729;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        int n = Integer.valueOf(br.readLine());
        for(int num=0; num<n; num++){
            String[] input = br.readLine().split(" ");
            int l = Math.max(input[0].length(), input[1].length());
            for(int i=0; i<2; i++){
                if(input[i].length() < l) {
                    int numOfZeros = l - input[i].length();
                    for(int j=0; j<numOfZeros; j++) input[i] = "0" + input[i];
                }
            }

            String[] a = input[0].split("");
            String[] b = input[1].split("");

            boolean upFlag = false;
            StringBuilder sb = new StringBuilder();
            for(int i=l-1; i>=0; i--){
                int sum = Integer.valueOf(a[i]) + Integer.valueOf(b[i]);
                if(upFlag) {
                    sum += 1;
                    upFlag = false;
                }
                if(sum > 1) {
                    sum -= 2;
                    upFlag = true;
                }
                sb.append(sum);
            }

            if(upFlag) sb.append(1);
            String result = sb.reverse().toString();
            while(result.length() > 1) {
                if(result.charAt(0) == '0') result = result.substring(1);
                else break;
            }
            System.out.println(result);
        }
    }
}
