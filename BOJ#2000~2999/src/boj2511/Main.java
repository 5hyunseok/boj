package boj2511;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        String[] A = br.readLine().split(" ");
        String[] B = br.readLine().split(" ");

        int pointA = 0;
        int pointB = 0;
        String lastWinner = "";
        for(int i=0; i<10; i++){
            int a = Integer.valueOf(A[i]);
            int b = Integer.valueOf(B[i]);
            if(a > b) {
                pointA += 3;
                lastWinner = "A";
            }
            else if(a < b) {
                pointB += 3;
                lastWinner = "B";
            }
            else {
                pointA++;
                pointB++;
            }
        }
        System.out.println(pointA + " " + pointB);
        if(pointA > pointB) System.out.println("A");
        else if(pointA < pointB) System.out.println("B");
        else {
            if(!lastWinner.equals("")) System.out.println(lastWinner);
            else System.out.println("D");
        }
    }
}
