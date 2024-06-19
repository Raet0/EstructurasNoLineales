package main;

/*
 *       1
 *  2          3
 *    4     5         6
 * 7     8
 */
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Models.Node;

public class App {
    public static void main(String[] args) {
        ArbolBinario arbolBinario = new ArbolBinario();
        Node nodeRoot = new Node(1);
        nodeRoot.setLeft(new Node(2));
        nodeRoot.setRight(new Node(3));
        nodeRoot.getLeft().setLeft(new Node(4));
        nodeRoot.getLeft().setRight(new Node(5));
        nodeRoot.getRight().setLeft(new Node(6));
        nodeRoot.getLeft().getLeft().setLeft(new Node(7));
        nodeRoot.getLeft().getRight().setLeft(new Node(8));

        System.out.println("Pre order loop");
        arbolBinario.preOrdenLoop(nodeRoot);

        System.out.println();

        System.out.println("Pre order Recursivo");
        arbolBinario.preOrderRecursividad(nodeRoot);

        System.out.println();

        System.out.println("Post Order Recursivo");
        arbolBinario.postOrderLoop(nodeRoot);

        System.out.println();

        System.out.println("IN Order Recursivo");
        arbolBinario.inordenRecursivo(nodeRoot);
    }
}
