package Day10;

import java.util.LinkedList;
import java.util.Queue;

public class BFSGraph {
     private LinkedList<Integer> [] adj;
    private int V;// NO. OF VERTICES
    private int E;// NO. OF EDGES

    // create a constructor
    public BFSGraph(int nodes){
        this.V=nodes;
        this.E=0;
        this.adj=new LinkedList[nodes];
        for(int v=0;v<V;v++){
            adj[v]=new LinkedList<>();// iterating for every vertex to initialize a linked list for every index of array;
        }
    }

    public void addEdge(int u, int v){
        adj[u].add(v);
        adj[v].add(u);
        E++;
    }

    // For string representation of this graph
    public String toString(){
        // first create a string builder
        StringBuilder sb = new StringBuilder();
        sb.append(V+" vertices, "+E+" edges"+"\n");
        for(int v=0;v<V;v++){
            sb.append(v+": ");// here we have teh vertex value now we want LL associated with this vertex and print its content
            for(int w: adj[v]){// iterate over that vertex for the linked list associated with it
                sb.append(w+" ");

            }
            sb.append("\n");
        } 
        return sb.toString();// return string representation of this string builder
    }

    // BREADTH FIRST SEARCH

    public void bfs(int s){
        boolean [] visited= new boolean[V];
        Queue<Integer> q=new LinkedList<>();

        visited[s]=true;
        q.offer(s);

        while(!q.isEmpty()){
            int u =q.poll();
            System.out.print(u);

            for(int v:adj[u]){
                if(!visited[v]){
                    visited[v]=true;
                    q.offer(v);
                }
            }
        }

    }
    
    public static void main(String[] args) {
        BFSGraph g = new BFSGraph(5);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        g.addEdge(2, 4);
        g.bfs(0);

        // System.out.println(g);
    }
}
