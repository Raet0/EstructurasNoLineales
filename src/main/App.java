package main;

import main.Materia.Models.Node;
import main.Materia.Models.Controllers.ArbolBinario;
/*
 *                     1
 *            2               3
 *         4         5             6
 *       7           8
   * 
 */

public class App {
    public static void main(String[] args) throws Exception {
        ArbolBinario arbolBinario = new ArbolBinario();
        Node nodeRoot = new Node(1);
        nodeRoot.setLeft(new Node(2));
        nodeRoot.setRight(new Node(3));

        nodeRoot.getLeft().setLeft(new Node(4));
        nodeRoot.getLeft().setRight(new Node(5));

        nodeRoot.getRight().setLeft(new Node(6));
        nodeRoot.getLeft().getLeft().setLeft(new Node(7));
        nodeRoot.getLeft().getRight().setLeft(new Node(8));
        System.out.println("\nPreOrder - Loop");
        arbolBinario.preOrderLoop(nodeRoot);
        System.out.println(" \nPreOrder - Recursivo");
        arbolBinario.preOrderRecursivo(nodeRoot);
        System.out.println();
        System.out.println("PostOrder - Loop");
        arbolBinario.postOrderLoop(nodeRoot);
        System.out.println("\n PostOrder - Recursivo");
        arbolBinario.postOrderRecursivo(nodeRoot);
        System.out.println("\n PostOrder - InRecursivo");
        arbolBinario.inRecursivo(nodeRoot);
        
       
    }

}
