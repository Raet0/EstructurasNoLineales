package main.Ejercicio_02_invert;

import main.Materia.Models.Node;

public class InvertBinaryTree {

    /*
     * Dada la raíz de un árbol binario, implementa
     * un algoritmo que devuelva el árbol binario
     * invertido
     */

    public Node invertTree(Node root) {
        if (root == null) {
            return null;
        }

        // Invertir recursivamente los subárboles izquierdo y derecho
        Node left = invertTree(root.getLeft());
        Node right = invertTree(root.getRight());

        // Intercambia los subárboles izquierdo y derecho

        root.left = right;
        root.right = left;

        return root;
    }
    
}
