package boj1753;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
//        BufferedReader br = new BufferedReader(new FileReader("src/sample.txt"));

        String[] num = br.readLine().split(" ");
        int V = Integer.valueOf(num[0]);
        int E = Integer.valueOf(num[1]);
        int start = Integer.valueOf(br.readLine());

        Graph g = new Graph(V);

        for(int i=0; i<E; i++) {
            String[] input = br.readLine().split(" ");
            g.setWeight(Integer.valueOf(input[0]), Integer.valueOf(input[1]), Integer.valueOf(input[2]));
        }
        g.dijkstra(start);
    }
}

class Graph {
    private int n;
    private ArrayList<Edge>[] weight;
    private int[] d;
    private boolean[] visited;

    public Graph(int n) {
        this.n = n;
        this.d = new int[n+1];
        this.visited = new boolean[n+1];
        this.weight = (ArrayList<Edge>[]) new ArrayList[n+1];
        for(int i=1; i<n+1; i++) {
            d[i] = Integer.MAX_VALUE;
            weight[i] = new ArrayList<>();
        }
    }

    public void setWeight(int i, int j, int w) {
        weight[i].add(new Edge(j, w));
    }

    public void dijkstra(int start) {
        d[start] = 0;

        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.offer(new Edge(start, 0));

        while(!pq.isEmpty()) {
            Edge minEdge = pq.poll();
            if (visited[minEdge.dest]) continue;
            visited[minEdge.dest] = true;
            for(Edge e : weight[minEdge.dest]) {
                if (!visited[e.dest]) {
                    if (d[e.dest] > d[minEdge.dest] + e.weight) {
                        d[e.dest] = d[minEdge.dest] + e.weight;
                        pq.add(new Edge(e.dest, d[e.dest]));
                    }
                }
            }
        }

        for(int i=1; i<n+1; i++) System.out.println(d[i] == Integer.MAX_VALUE ? "INF" : d[i]);
    }
}

class Edge implements Comparable<Edge> {
    int dest;
    int weight;

    Edge(int dest, int weight) {
        this.dest = dest;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge o) {
        return Integer.compare(this.weight, o.weight);
    }
}