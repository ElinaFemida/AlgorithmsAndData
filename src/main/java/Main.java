public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,4);
        graph.addEdge(2,4);
        graph.addEdge(2,5);
        graph.addEdge(3,6);
        graph.addEdge(4,7);
        graph.addEdge(5,8);
        graph.addEdge(6,8);
        graph.addEdge(6,9);

//            1 - 4 - 7
//          /   /
//        0 -  2 -5 -8
//          \       / \
//            3 -  6 - 9

        BreadthFirstPath bfp = new BreadthFirstPath(graph, 0);
        System.out.println(bfp.hasPathTo(9));
        System.out.println(bfp.pathTo(8));
        System.out.println(bfp.pathTo(4));
    }
}