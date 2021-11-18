package lesson7;

import java.util.LinkedList;

public class Path {
    protected boolean[] marked;
    protected int[] edgeTo;
    protected int source;

    protected Path(Graph g, int source) {
        this.source = source;
        marked = new boolean[g.getVertexCount()];
        edgeTo = new int[g.getVertexCount()];
        fs(g, source);
    }

    protected void lengthOfPaths ( int dist){
     System.out.println(pathTo(dist).size());
        }

    protected void fs(Graph g, int v) {
        marked[v] = true;
        for (int w : g.getAdjList(v)) {
            if (!marked[w]) {
                edgeTo[w] = v;
                fs(g, w);
            }
        }
    }



    protected boolean hasPathTo(int dist) {
        return marked[dist];
    }
    protected LinkedList<Integer> pathTo(int dist) {
        if (!hasPathTo(dist)) {
            return null;
        }
        LinkedList<Integer> stack = new LinkedList<>();
        int vertex = dist;
        while (vertex != source) {
            stack.push(vertex);
            vertex = edgeTo[vertex];
        }
        return stack;
    }
}
