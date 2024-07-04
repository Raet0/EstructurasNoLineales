package main.Materia.Controllers;
import java.util.ArrayList;
import java.util.LinkedList;
import main.Materia.Models.Node;
import java.util.List;
import java.util.Queue;
public class Grafos {
    private List<NodeGrafo> nodes;

    public Grafos(){
        this.nodes = new ArrayList<>();
    }

    //Metodo para agregar un nodo
    public NodeGrafo addNode(int value){
        NodeGrafo newNode = new NodeGrafo(value);
        nodes.add(newNode);
        return newNode;
    }

    //Metodo para agregar una arista
    public void addEdge(NodeGrafo src, NodeGrafo dest){
        src.addNeighbor(dest);
        dest.addNeighbor(src);
    }
    public void printGrafo(){
        for(NodeGrafo node : nodes){
            System.out.println("Vertex " + node.getValue() + ":");
            for(NodeGrafo neighbor : node.getNeighbors()){
                System.out.println(" -> " + neighbor.getValue());

            }
            System.out.println();
        }
    }
    // Método para realizar una búsqueda en profundidad (DFS) desde un nodo inicial
    public void getDFS(NodeGrafo startNode){
        boolean[] visited = new boolean[nodes.size()]; // Crear un arreglo para marcar nodos visitados
        getDFSUtil(startNode, visited); // Llamar al método auxiliar de DFS
    }

    // Método auxiliar para DFS que se llama recursivamente
    private void getDFSUtil(NodeGrafo node, boolean[] visited){
        visited[node.getValue()] = true; // Marcar el nodo actual como visitado
        System.out.print(node.getValue() + " "); // Imprimir el valor del nodo
        for (NodeGrafo neighbor : node.getNeighbors()) {
            if (!visited[neighbor.getValue()]) { // Si el vecino no ha sido visitado
                getDFSUtil(neighbor, visited); // Llamar recursivamente para el vecino
            }
        }
    }

    // Método para realizar una búsqueda en anchura (BFS) desde un nodo inicial
    public void getBFS(NodeGrafo startNode){
        boolean[] visited = new boolean[nodes.size()]; // Crear un arreglo para marcar nodos visitados
        Queue<NodeGrafo> queue = new LinkedList<>(); // Crear una cola para gestionar los nodos por visitar
        visited[startNode.getValue()] = true; // Marcar el nodo inicial como visitado
        queue.add(startNode); // Agregar el nodo inicial a la cola

        while (!queue.isEmpty()) {
            NodeGrafo node = queue.poll(); // Extraer un nodo de la cola
            System.out.print(node.getValue() + " "); // Imprimir el valor del nodo
            for (NodeGrafo neighbor : node.getNeighbors()) {
                if (!visited[neighbor.getValue()]) { // Si el vecino no ha sido visitado
                    visited[neighbor.getValue()] = true; // Marcar el vecino como visitado
                    queue.add(neighbor); // Agregar el vecino a la cola
                }
            }
        }
    }

    // Método para obtener la matriz de adyacencia del grafo
    public int[][] getAdjacencyMatrix(){
        int size = nodes.size(); // Obtener el tamaño del grafo
        int[][] adjacencyMatrix = new int[size][size]; // Crear una matriz de tamaño [size][size]
        for (int i = 0; i < size; i++) {
            for (NodeGrafo neighbor : nodes.get(i).getNeighbors()) {
                adjacencyMatrix[i][neighbor.getValue()] = 1; // Marcar una conexión en la matriz
            }
        }
        return adjacencyMatrix; // Retornar la matriz de adyacencia
    }

    // Método para imprimir la matriz de adyacencia
    public void printAdjacencyMatrix(){
        int[][] adjacencyMatrix = getAdjacencyMatrix(); // Obtener la matriz de adyacencia
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j < adjacencyMatrix[i].length; j++) {
                System.out.print(adjacencyMatrix[i][j] + " "); // Imprimir el valor en la posición [i][j]
            }
            System.out.println(); // Nueva línea para separar las filas
        }
    }
}