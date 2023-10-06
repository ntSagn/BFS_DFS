import java.util.LinkedList;
import java.util.Queue;

public record BreadthFirstSearch(Vertex startVertex) {

    public void traverse() {
        Queue<Vertex> queue = new LinkedList<>();
        LinkedList<Integer> open = new LinkedList<>();
        LinkedList<Integer> close = new LinkedList<>();
        queue.add(startVertex);
        open.addFirst(0);
        while (!queue.isEmpty()) {
            Vertex current = queue.poll();
            LinkedList<Vertex> temp = new LinkedList<>();
            if (!current.isVisited()) {
                current.setVisited(true);
                close.add(current.getData());
                System.out.println(current);
                System.out.println("Close: " + close);
                queue.addAll(current.getNeighbors());
                temp.addAll(current.getNeighbors());
                for (int i = 0; i < temp.size(); i++){
                    if(open.contains(temp.get(i).getData()) || close.contains(temp.get(i).getData()))
                        break;
                    open.addLast(temp.get(i).getData());
                }
                open.removeFirst();
                System.out.println("Open: " + open +"\n");

            }
        }
    }

}
