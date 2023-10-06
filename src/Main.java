import java.util.List;

public class Main {

    public static void main(String[] args) {

        Vertex v0 = new Vertex(0);
        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4= new Vertex(4);
        Vertex v5 = new Vertex(5);
        Vertex v6 = new Vertex(6);

        v0.setNeighbors(List.of(v1, v5, v6));
        v1.setNeighbors(List.of(v3, v4, v5));
        v4.setNeighbors(List.of(v2, v6));
        v6.setNeighbors(List.of(v0));

        //new BreadthFirstSearch(v0).traverse();
       new DepthFirstSearch(v0).traverseRecursively(v0);

    }

}