package graph;

import java.util.*;

public class GraphDFS {
    private int V; // number of vertices
    private List<List<Integer>> adj; // adjacency list representation

    public GraphDFS(int v) {
        V = v;
        adj = new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
    }

    // Add an edge to the graph
    public void addEdge(int v, int w) {
        adj.get(v).add(w);
    }

    // DFS traversal starting from vertex v
    private void DFSUtil(int v, boolean[] visited, List<Integer> result) {
        visited[v] = true;
        result.add(v);

        for (int n : adj.get(v)) {
            if (!visited[n]) {
                DFSUtil(n, visited, result);
            }
        }
    }

    // DFS traversal starting from a given vertex
    public List<Integer> DFS(int v) {
        boolean[] visited = new boolean[V];
        List<Integer> result = new ArrayList<>();
        DFSUtil(v, visited, result);
        return result;
    }

    // Print the DFS traversal
    public void printDFS(int startVertex) {
        List<Integer> result = DFS(startVertex);
        System.out.println("DFS traversal starting from vertex " + startVertex + ":");
        for (int vertex : result) {
            System.out.print(vertex + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a sample graph
        GraphDFS g = new GraphDFS(6);
        
        // Add edges to create the following graph:
        // 0 -> 1 -> 2
        // |    |    |
        // 3 -> 4 -> 5
        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(1, 4);
        g.addEdge(2, 5);
        g.addEdge(3, 4);
        g.addEdge(4, 5);

        // Test DFS from different starting vertices
        g.printDFS(0);  // Should visit all vertices
        g.printDFS(2);  // Will only visit vertices reachable from 2
        
        // Create and test another graph
        GraphDFS g2 = new GraphDFS(4);
        g2.addEdge(0, 1);
        g2.addEdge(1, 2);
        g2.addEdge(2, 3);
        g2.addEdge(3, 0);
        System.out.println("\nCyclic graph DFS:");
        g2.printDFS(0);
    }
}