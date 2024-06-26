package main.Ejercicio_03_listLeves;

import java.util.ArrayList;
import java.util.List;

import main.Materia.Models.Node;

/*
 *  Implementa un algoritmo que devuelva una lista enlazada con 
 *  los nodos de cada nivel de un árbol binario. Si el árbol 
 *  tiene N niveles, debes devolver N listas enlazadas.
 */

public class ListLevels {

    public List<List<Node>> listLevels(Node root) {

        List<List<Node>> levels = new ArrayList<>();
        listLevelsHelper(root, levels, 0);
        return levels;
    }

    private void listLevelsHelper(Node node, List<List<Node>> levels, int depth) {
        if (node == null) {
            return;
        }
        // Si la profundidad actual aún no tiene una lista, añada una
        if (depth == levels.size()) {
            levels.add(new ArrayList<>());
        }
        // Añade el nodo actual a la lista de profundidad correspondiente
        levels.get(depth).add(node);

        // Recurrir para los subárboles izquierdo y derecho
        listLevelsHelper(node.getLeft(), levels, depth + 1);
        listLevelsHelper(node.getRight(), levels, depth + 1);
    }

}
