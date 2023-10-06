import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public record DepthFirstSearch(Vertex startVertex) {
    static LinkedList<Integer> close = new LinkedList<>();
    static LinkedList<Integer> open = new LinkedList<>();
        public void traverseRecursively(Vertex vertex) {
            vertex.setVisited(true);
            LinkedList<Vertex> temp = new LinkedList<>();
            System.out.println(vertex);
//            open.removeFirst();
            close.add(vertex.getData());
            temp.addAll(vertex.getNeighbors());
            for (int i = 0; i < temp.size(); i++){
                if(open.contains(temp.get(i).getData()) || close.contains(temp.get(i).getData()))
                    break;
                open.add(i,temp.get(i).getData());
            }
            for(int i = 0; i < open.size(); i++){
                if(vertex.getData() == open.get(i)){
                    open.remove(i);
                }
            }
            System.out.println("Close: " + close);
            System.out.println("Open: " + open +"\n");
            vertex.getNeighbors().stream().filter(neighbor -> !neighbor.isVisited())
                    .forEach(this::traverseRecursively);
        }
}