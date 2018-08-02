package boj1406;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int n = Integer.valueOf(br.readLine());

        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();

        for(int i=0; i<s.length(); i++) leftStack.push(s.charAt(i));

        for(int i=0; i<n; i++) {
            String input = br.readLine();
            if(input.equals("L")) {
                if(leftStack.size() > 0) rightStack.push(leftStack.pop());
            }else if(input.equals("D")) {
                if(rightStack.size() > 0) leftStack.push(rightStack.pop());
            }else if(input.equals("B")) {
                if(leftStack.size() > 0) leftStack.pop();
            }else {
                leftStack.push(input.split(" ")[1].charAt(0));
            }
        }

        while(leftStack.size() > 0) rightStack.push(leftStack.pop());
        StringBuilder stringBuilder = new StringBuilder();
        while(rightStack.size() > 0) stringBuilder.append(rightStack.pop());

        System.out.print(stringBuilder.toString());
    }
}
