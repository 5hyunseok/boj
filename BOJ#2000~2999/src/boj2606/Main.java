package boj2606;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        int n = Integer.valueOf(br.readLine());
        int numOfEdge = Integer.valueOf(br.readLine());
        ArrayList<Integer>[] adjacent = new ArrayList[n+1];
        for(int i=1; i<n+1; i++) adjacent[i] = new ArrayList<>();
        for(int i=0; i<numOfEdge; i++) {
            String[] input = br.readLine().split(" ");
            adjacent[Integer.valueOf(input[0])].add(Integer.valueOf(input[1]));
            adjacent[Integer.valueOf(input[1])].add(Integer.valueOf(input[0]));
        }

        boolean[] visited = new boolean[n+1];
        LinkedList<Integer> q = new LinkedList<>();
        q.add(1);
        visited[1] = true;

        while(!q.isEmpty()) {
            int a = q.poll();
            for(int i : adjacent[a]) {
                if(visited[i]) continue;
                visited[i] = true;
                q.add(i);
            }
        }

        int cnt = 0;
        for(int i=1; i<visited.length; i++) if (visited[i]) cnt++;
        System.out.println(cnt-1);
    }
}
