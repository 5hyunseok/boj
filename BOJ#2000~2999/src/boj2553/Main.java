package boj2553;

import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        int n = Integer.valueOf(br.readLine());
        int numOfTwo = 0;
        int numOfFive = 0;
        for(int i=n; i>0; i--){
            int input = i;
            while(input>0){
                if(input%2==0) numOfTwo++;
                else break;
                input /= 2;
            }
        }
        for(int i=n; i>0; i--){
            int input = i;
            while(input>0){
                if(input%5==0) numOfFive++;
                else break;
                input /= 5;
            }
        }
        int numOfZero = Math.min(numOfFive, numOfTwo);
        BigInteger remainder = new BigInteger("1");
        for(int i=0; i<=numOfZero; i++){
            remainder = remainder.multiply(new BigInteger("10"));
        }

        BigInteger res = new BigInteger("1");
        for(int i=1; i<=n; i++){
            res = res.multiply(new BigInteger(Integer.toString(i)));
            res = res.divideAndRemainder(remainder)[1];
        }
        remainder = remainder.divide(new BigInteger("10"));
        System.out.println(res.divide(remainder));

    }
}
