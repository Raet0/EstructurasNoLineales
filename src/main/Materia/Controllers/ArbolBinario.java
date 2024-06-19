package main.Materia.Controllers;

import java.util.Stack;

import main.Materia.Models.Node;

public class ArbolBinario {
    // recorrido del arbol
    public void preOrdenLoop(Node root) {
        if (root == null) {
            return;

        }
        Stack<Node> stack = new Stack<>();
        // agregamos una pila la raiz para empezar el recorrido
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            System.out.println(node.getValue() + "-");
            // Agregar los hijos de la derecha a la fila
            if (node.getRight() != null) {
                stack.push(node.getRight());
            }
            // Agregar los hijos de la izquierda a la pila
            if (node.getLeft() != null) {
                stack.push(node.getLeft());
            }
        }
    }

    public void preOrderRecursividad(Node root) {
        if (root != null) {
            System.out.println(root.getValue() + "-");
            preOrderRecursividad(root.getLeft());
            preOrderRecursividad(root.getRight());

        }
    }

    public void postOrderLoop(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()) {
            Node node = stack1.pop();
            stack2.push(node);
            if (node.getLeft() != null) {
                stack1.push(root.getLeft());
            }
            if (node.getRight() != null) {
               stack1.push(node.getRight());
            }
            while (!stack2.isEmpty()) {
                Node node1 = stack2.pop();
                System.out.print(node1.getValue()+ " ");
            }
        }
    }
    public void inordenRecursivo(Node node){
        if(node  != null){
            inordenRecursivo(node.getLeft());
            System.out.println(node.getValue()+"-");
            inordenRecursivo(node.getRight());
        }
    }
}
