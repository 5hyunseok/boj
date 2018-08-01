package boj1350;

import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        int numOfFiles = Integer.valueOf(br.readLine());
        String[] sizeInput = br.readLine().split(" ");
        int[] fileSizes = new int[numOfFiles];
        for(int i=0; i<numOfFiles; i++) fileSizes[i] = Integer.valueOf(sizeInput[i]);
        int clusterSize = Integer.valueOf(br.readLine());


        BigInteger totalClusterCount = new BigInteger("0");
        for(int i=0; i<numOfFiles; i++){
            totalClusterCount = totalClusterCount.add(new BigInteger(Integer.toString(fileSizes[i] / clusterSize)));
            if(fileSizes[i] % clusterSize != 0) totalClusterCount = totalClusterCount.add(new BigInteger("1"));
        }

        System.out.println(totalClusterCount.multiply(new BigInteger(Integer.toString(clusterSize))));
    }
}
