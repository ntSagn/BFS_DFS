import lombok.Data;
import lombok.ToString;

import java.util.LinkedList;
import java.util.List;

@Data
public class Vertex{

    private final int data;

    private boolean visited;

    @ToString.Exclude
    private List<Vertex> neighbors = new LinkedList<>();

}
