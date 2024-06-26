package main.Ejercicio_01_insert;

import main.Materia.Models.Node;

public class InsertBST {

    /*
     * Implementa un algoritmo para insertar valores en un Árbol Binario de Búsqueda
     * (BST). Un BST es un árbol binario donde cada nodo sigue las siguientes
     * reglas:
     * • El subárbol izquierdo de un nodo contiene solo nodos con valores menores
     * que el nodo.
     * • El subárbol derecho de un nodo contiene solo nodos con valores mayores que
     * el nodo.
     */
    public Node insert(Node root, int value) {

        if (root == null) {
            return new Node(value);
        }
        /*
         * if (value < root.getValue) {
            root.setLeft = insert(root.getLeft(), value);
        } else if (value > root.getValue) {
            root.setRight = insert(root.getRight(), value);
        }
         */
        // En caso contrario, utilice el árbol
        if (value < root.value) {
            root.left = insert(root.left, value);
        } else if (value > root.value) {
            root.right = insert(root.right, value);
        }

        // devuelve el puntero del nodo (sin cambios)
        return root;

    }

}
