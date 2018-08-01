package boj5543;

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        int[] burger = new int[3];
        burger[0] = Integer.valueOf(br.readLine());
        burger[1] = Integer.valueOf(br.readLine());
        burger[2] = Integer.valueOf(br.readLine());
        int[] drink = new int[2];
        drink[0] = Integer.valueOf(br.readLine());
        drink[1] = Integer.valueOf(br.readLine());

        int cheapest = 5000;
        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                int setPrice = burger[i] + drink[j] - 50;
                if(setPrice < cheapest) cheapest = setPrice;
            }
        }
        System.out.println(cheapest);
    }
}

