package learning;

public class DirectedDFS {

    private final boolean[] marked;

    public DirectedDFS(final Digraph digraph, final int headVertex) {
        marked = new boolean[digraph.V()];
        dfs(digraph, headVertex);
    }

    private void dfs(final Digraph digraph, final int currentVertex) {
        marked[currentVertex] = true;
        for (int w : digraph.adj(currentVertex))
            if (!marked[w])
                dfs(digraph, w);
    }

    public boolean visited(final int vertex) {
        return marked[vertex];
    }
}
