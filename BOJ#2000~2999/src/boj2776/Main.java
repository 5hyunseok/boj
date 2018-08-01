package boj2776;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        int caseNum = Integer.valueOf(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int num=0; num<caseNum; num++){
            int n = Integer.valueOf(br.readLine());
            String[] input = br.readLine().split(" ");
            int[] firstNote = new int[n];
            for(int i=0; i<n; i++) firstNote[i] = Integer.valueOf(input[i]);
            Arrays.sort(firstNote);

            int m = Integer.valueOf(br.readLine());
            String[] secondNote = br.readLine().split(" ");
            for(int i=0; i<m; i++) {
                int t = Integer.valueOf(secondNote[i]);
                sb.append(Arrays.binarySearch(firstNote, t) > -1 ? 1 : 0);
                sb.append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
