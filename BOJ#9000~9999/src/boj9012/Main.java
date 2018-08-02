package boj9012;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        int n = Integer.valueOf(br.readLine());
        for(int i=0; i<n; i++) {
            String[] input = br.readLine().split("");
            Stack<Integer> stack = new Stack<>();
            for(int j=0; j<input.length; j++) {
                if(input[j].equals("(")) stack.push(0);
                else {
                    if(stack.empty()) {
                        stack.push(0);
                        break;
                    }
                    else stack.pop();
                }
            }
            System.out.println(stack.empty() ? "YES" : "NO");
        }
    }
}
