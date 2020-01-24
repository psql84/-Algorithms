package lesson7;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);
        graph.addEdge(0,1);
        graph.addEdge(0,9);
        graph.addEdge(1,2);
        graph.addEdge(3,1);
        graph.addEdge(2,4);
        graph.addEdge(3,4);
        graph.addEdge(4,5);
        graph.addEdge(4,8);
        graph.addEdge(3,6);
        graph.addEdge(5,7);
        graph.addEdge(6,8);
        graph.addEdge(6,9);
        graph.addEdge(7,8);
        graph.addEdge(8,9);

        BreadthFirstPath bfp = new BreadthFirstPath(graph, 1);
        System.out.println(bfp.pathTo(3));


    }
}
