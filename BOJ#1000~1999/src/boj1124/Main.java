package boj1124;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

  public static int[] prime;

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int a = Integer.valueOf(st.nextToken());
    int b = Integer.valueOf(st.nextToken());

    int n = b + 1;
    prime = new int[n];

    for (int i = 2; i < n; i++) {
      prime[i] = i;
    }

    for (int i = 2; i < Math.sqrt(n); i++) {
      if (prime[i] == 0) {
        continue;
      }
      for (int j = i + i; j < n; j += i) {
        if (prime[j] != i && prime[j] % i == 0) {
          prime[j] = 0;
        }
      }
    }

    int count = 0;
    for (int i = a; i < b + 1; i++) {
      int primeCount = getPrimeCount(i);
      if (prime[primeCount] != 0) {
        count++;
      }
    }

    System.out.println(count);
  }


  public static int getPrimeCount(int n) {
    int count = 0;
    int i = 2;
    while (n > 1) {
      if (prime[i] == 0) {
        i++;
        continue;
      }
      if (n % prime[i] == 0) {
        n /= i;
        count++;
      } else {
        i++;
      }
    }
    return count;
  }
}

