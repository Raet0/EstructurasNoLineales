package main;

/*
 *       1
 *  2          3
 *    4     5         6
 * 7     8
 */
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.Grafos;
import main.Materia.Controllers.NodeGrafo;
import main.Materia.Controllers.Set;
import main.Materia.Controllers.Set.Sets;
import main.Materia.Models.Node;

public class App {    public static void main(String[] args) {

       /*  ArbolBinario arbolBinario = new ArbolBinario();

        Node nodeRoot = new Node(1);
        nodeRoot.setLeft(new Node(2));
        nodeRoot.setRight(new Node(3));

        nodeRoot.getLeft().setLeft(new Node(4));
        nodeRoot.getLeft().setRight(new Node(5));

        nodeRoot.getRight().setRight(new Node(6));

        nodeRoot.getLeft().getLeft().setLeft(new Node(7));
        nodeRoot.getLeft().getRight().setLeft(new Node(8));


        arbolBinario.preOrderLoop(nodeRoot);

        System.out.println(" ");

        arbolBinario.preOrderLoop(nodeRoot);
        System.out.println();

        System.out.println("Postorder - loop");

        arbolBinario.postOrderLoop(nodeRoot);
        System.out.println();
        System.out.println();
        arbolBinario.postOrderRecursivo(nodeRoot);

        System.out.println();
        System.out.println();
        arbolBinario.inOrderRecursivo(nodeRoot);

        AVLTree tree = new AVLTree();
        int[] values = {10 , 20 , 15, 24, 9 , 8 , 21 , 23, 50, 25};
        for(int value: values){
            tree.insert(value);
            tree.printTreeNode(nodeRoot,"", true);
        }*/


        runGraph();

        runSets();

      

    }

    private static void runSets() {
        new Set();

    }

    private static void runGraph() {
        Grafos graph = new Grafos();

        //Agregar nodos
        NodeGrafo node1 = graph.addNode(1);
        NodeGrafo node2 = graph.addNode(2);
        NodeGrafo node3 = graph.addNode(3);
        NodeGrafo node4 = graph.addNode(4);
        NodeGrafo node5 = graph.addNode(5);


        graph.addEdge(node1, node2);
        graph.addEdge(node1, node3);
        graph.addEdge(node2, node4);
        graph.addEdge(node4, node5);



        //imprime el grafo

        graph.printGrafo();
  
    }
}
