package DSAFullCourse.Graphs;

public class GraphMatrix {
    private final int[][] adjMatrix;

    public GraphMatrix(int numVertices) {
        adjMatrix = new int[numVertices][numVertices]; // Initialize a 2D array (matrix) for the graph
    }

    // Add an edge between two vertices
    public void addEdge(int v1, int v2) {
        adjMatrix[v1][v2] = 1; // Directed graph: set the edge from v1 to v2
        adjMatrix[v2][v1] = 1; // Since it's an undirected graph, we add the reverse edge as well
    }

    // Print the graph (adjacency matrix)
    public void printGraph() {
        for (int i = 0; i < adjMatrix.length; i++) {
            for (int j = 0; j < adjMatrix[i].length; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphMatrix graph = new GraphMatrix(4);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        graph.printGraph();
        // Output will show the adjacency matrix representation of the graph
    }
}

/*
  Explanation of Graph (Adjacency Matrix):

  - Time Complexity for adding an edge: O(1), since it's just setting the value in the matrix.
  - Space Complexity: O(V^2), as we store a matrix with size V x V (where V is the number of vertices).

  - The graph is represented using an adjacency matrix, where `adjMatrix[i][j]` indicates the presence of an edge between vertex `i` and vertex `j`.
  - The `addEdge()` method sets the appropriate elements in the matrix.
  - The `printGraph()` method displays the graph's adjacency matrix.
*/
