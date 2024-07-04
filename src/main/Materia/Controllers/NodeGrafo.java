package main.Materia.Controllers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class NodeGrafo {
    int value;
    private List<NodeGrafos> neighbors;

    public NodeGrafo(int value){
        this.value = value;
        this.neighbors = new LinkedList<>();
    }

    public int getValue(){
        return value;
    }
    public void addNeighbor(NodeGrafo neighbor){
        neighbors.add(neighbor);
    }

    public NodeGrafo[] getNeighbors() {
        return neighbors.toArray(new NodeGrafo[0]);
    }
}
