package boj2167;

import java.io.*;

public class Main {
    public static int[][] sum;
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        String[] arrSize = br.readLine().split(" ");
        int n = Integer.valueOf(arrSize[0]);
        int m = Integer.valueOf(arrSize[1]);
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++){
            String[] input = br.readLine().split(" ");
            for(int j=0; j<m; j++) arr[i][j] = Integer.valueOf(input[j]);
        }

        sum = new int[n][m];
        for(int i=0; i<n; i++) sum[i][0] = arr[i][0];
        for(int j=0; j<m; j++) sum[0][j] = arr[0][j];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                sum[i][j] = -1;
            }
        }
        sum[0][0] = arr[0][0];

        int caseNum = Integer.valueOf(br.readLine());
        for(int num=0; num<caseNum; num++){
            String[] input = br.readLine().split(" ");
            int i = Integer.valueOf(input[0]);
            int j = Integer.valueOf(input[1]);
            int x = Integer.valueOf(input[2]);
            int y = Integer.valueOf(input[3]);

            int a = getSum(x-1, y-1, arr);
            int b = getSum(i-2, y-1, arr);
            int c = getSum(x-1, j-2, arr);
            int d = getSum(i-2, j-2, arr);
            System.out.println(a - b - c + d);
        }
    }

    public static int getSum(int i, int j, int[][] arr) {
        if(i < 0 || j < 0) return 0;
        if(sum[i][j] != -1) return sum[i][j];
        int res = getSum(i-1, j, arr);
        for(int n=0; n<=j; n++) res += arr[i][n];
        sum[i][j] = res;
        return sum[i][j];
    }
}
