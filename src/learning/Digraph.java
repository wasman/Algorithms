package learning;

public class Digraph {

    private final int V;
    private final Bag<Integer>[] adj;
    private int E = 0;


    public Digraph(int V) {
        this.V = V;
        adj = (Bag<Integer>[]) new Bag[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<>();
        }
    }

    public void addAdge(int v, int w) {
        adj[v].add(w);
        E++;
    }

    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

    public int V() {
        return V;
    }

    public int E() {
        return E;
    }

    public Digraph reverse() throws NoSuchMethodException {
        throw new NoSuchMethodException("Not implemented yet");
    }
}
