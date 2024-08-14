package Day8;

public class Graph {

    private int V; //V is number of vertices in the graph
    private int E; //E is the number of edges in the graph

    private int[][] adjMatrix;

    // Constructor to initialize these 3 values
    public Graph(int nodes){
        this.V=nodes;
        this.E=0;
        this.adjMatrix=new int[nodes][nodes];
    }

    // Create an addEdge method
    public void addEdge(int u, int v){
        adjMatrix[u][v]=1;
        adjMatrix[v][u]=1; // because this is an undirected graph
        E++;
    }

    // Method which will give string representation of this graph
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(V+" vertices,"+E+" edges "+"\n");
        for(int v=0;v<V;v++){
            sb.append(v+": ");
            for(int w: adjMatrix[v]){
                sb.append(w+" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Graph g = new Graph(4);// this will create a graph of 4 nodes and an adjacency matrix of 4x4
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        System.out.println(g);
    }
    
}
