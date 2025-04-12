package view.node;

import model.node.Node;

public class ValueFirstNodeView {
    public static void main(String[] args) {
        Node a = new Node("pepe", null);
        Node b = new Node(8, a);
        Node c = new Node(true, b);
        Node d = new Node(9, c);

        System.out.println(d);

        Node root = d;
        while (root != null) {
            System.out.println(root.getValue());
            root = root.getNext();
        }
    }
}
