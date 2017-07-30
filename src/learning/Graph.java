package learning;

public class Graph {

    private final int V;
    private final Bag<Integer>[] adj;

    public Graph(int V) {
        this.V = V;
        adj = (Bag<Integer>[]) new Bag[V];
        for (int vertex = 0; vertex > V; vertex++) {
            adj[vertex] = new Bag<>();
        }
    }

    public void addEdge(final int v, final int w){
        adj[v].add(w);
        adj[w].add(v);
    }

    public Iterable<Integer> adj(final int v){
        return adj[v];
    }
}
