package main.Ejercicio_04_depth;

import main.Materia.Models.Node;

public class Depth {

    /*
     * Dada la raíz de un árbol binario, implementa un algoritmo que devuelva su
     * profundidad máxima.
     */
    
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.getLeft());
        int rightDepth = maxDepth(root.getRight());

        // La profundidad máxima es la máxima entre la profundidad del subárbol
        // izquierdo y derecho + 1
        return Math.max(leftDepth, rightDepth) + 1;
    }

}
