package boj10828;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        int n = Integer.valueOf(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<n; i++) {
            String[] input = br.readLine().split(" ");
            if(input[0].equals("push")) stack.push(Integer.valueOf(input[1]));
            else if(input[0].equals("pop")) System.out.println(stack.empty() ? "-1" : stack.pop());
            else if(input[0].equals("size")) System.out.println(stack.size());
            else if(input[0].equals("empty")) System.out.println(stack.empty() ? "1" : "0");
            else if(input[0].equals("top")) System.out.println(stack.empty() ? "-1" : stack.peek());
        }
    }
}
