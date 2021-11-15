package lesson7;

public class Main {
    public static void main(String[] args) {
//        Graph graph = new Graph(5);
//        graph.addEdge(0,2);
//        graph.addEdge(1,3);
//        graph.addEdge(3,2);
//        graph.addEdge(4,2);
//        graph.addEdge(4,3);
//        graph.addEdge(1,2);
//
//        System.out.println(graph.getEdgeCount());
//        System.out.println(graph.getAdjList(2));
//
//        DepthFirstPaths dfp = new DepthFirstPaths(graph, 1);
//        System.out.println(dfp.hasPathTo(0));
//        System.out.println(dfp.pathTo(0));
//
//        BreadthFirstPaths bfp = new BreadthFirstPaths(graph, 1);
//        System.out.println(bfp.hasPathTo(0));
//        System.out.println(bfp.pathTo(0));


        Graph graph = new Graph(10);
        graph.addEdge(0,1);
        graph.addEdge(0,4);
        graph.addEdge(0,5);
        graph.addEdge(1,3);
        graph.addEdge(3,2);
        graph.addEdge(3,8);
        graph.addEdge(4,1);
        graph.addEdge(4,7);
        graph.addEdge(7,8);
        graph.addEdge(8,9);
        graph.addEdge(8,6);
        graph.addEdge(6,9);

        BreadthFirstPaths bfp = new BreadthFirstPaths(graph, 5);
        System.out.println(bfp.hasPathTo(2));
        System.out.println(bfp.pathTo(2));
        bfp.lengthOfPaths(0);
    }
}
