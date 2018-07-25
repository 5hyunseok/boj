import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

//        BufferedReader br = new BufferedReader(new FileReader("input.txt"););

        int plusMax = -100000;
        int plusMin = 100000;
        int minusMax = -100000;
        int minusMin = 100000;
        int n = Integer.valueOf(br.readLine());

        for(int i=0; i<n; i++){
            String[] str = br.readLine().split(" ");
            int a = Integer.valueOf(str[0]);
            int b = Integer.valueOf(str[1]);
            int plus = a+b;
            int minus = a-b;
            if (plus >= plusMax) plusMax = plus;
            if (plus <= plusMin) plusMin = plus;
            if (minus >= minusMax) minusMax = minus;
            if (minus <= minusMin) minusMin = minus;
        }

        int max = Math.max(Math.abs(plusMax-plusMin), Math.abs(minusMax-minusMin));

        System.out.println(max);
    }
}
