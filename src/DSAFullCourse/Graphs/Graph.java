package DSAFullCourse.Graphs;

import java.util.*; // Importing utilities for collections

public class Graph {
    private final Map<Integer, List<Integer>> adjList; // Adjacency list to store the graph

    public Graph() {
        adjList = new HashMap<>();
    }

    // Add a vertex to the graph
    public void addVertex(int vertex) {
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }

    // Add an edge between two vertices
    public void addEdge(int vertex1, int vertex2) {
        adjList.get(vertex1).add(vertex2);
        adjList.get(vertex2).add(vertex1); // Since it's an undirected graph
    }

    // Print the adjacency list
    public void printGraph() {
        for (int vertex : adjList.keySet()) {
            System.out.print("Vertex " + vertex + ": ");
            for (int neighbor : adjList.get(vertex)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);

        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        graph.printGraph(); // Print the adjacency list
    }
}

/*
  Explanation of Graph (Adjacency List):

  - Time Complexity for adding an edge: O(1), as adding an element to the list takes constant time.
  - Space Complexity: O(V + E), where V is the number of vertices and E is the number of edges.

  - The graph is represented using an adjacency list (HashMap where keys are vertices and values are lists of neighbors).
  - We add vertices using `addVertex()` and edges using `addEdge()`.
  - The `printGraph()` method prints the graph's adjacency list, which shows the connections between the nodes.
*/
