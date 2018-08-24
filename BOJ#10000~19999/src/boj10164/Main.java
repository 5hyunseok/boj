package boj10164;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int n = Integer.valueOf(st.nextToken());
    int m = Integer.valueOf(st.nextToken());
    int k = Integer.valueOf(st.nextToken());

    if (k == 0) {
      k = n * m;
    }

    int a = (k / m) + 1;
    int b = k - (m * (a - 1));

    if (k % m == 0) {
      a--;
      b = m;
    }

    BigInteger multiply = new BigInteger("1");
    multiply = multiply.multiply(factorial(a - 1 + b - 1));
    multiply = multiply.divide(factorial(a - 1));
    multiply = multiply.divide(factorial(b - 1));

    multiply = multiply.multiply(factorial(n - a + m - b));
    multiply = multiply.divide(factorial(n - a));
    multiply = multiply.divide(factorial(m - b));

    System.out.println(multiply.toString());
  }

  public static BigInteger factorial(int n) {
    if (n == 0) {
      return new BigInteger("1");
    }
    BigInteger multiply = new BigInteger("1");
    for (int i = 1; i <= n; i++) {
      multiply = multiply.multiply(new BigInteger(Long.toString(i)));
    }
    return multiply;
  }
}
