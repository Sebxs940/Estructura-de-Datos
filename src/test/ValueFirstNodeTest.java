package test;

import model.Node;

public class ValueFirstNodeTest {
    public static void main(String[] args) {
        Node a = new Node(6, null);
        Node b = new Node(8, a);
        Node c = new Node(4, b);
        Node d = new Node(9, c);

        System.out.println(d);

        Node root = d;
        while (root != null) {
            System.out.println(root.getValue());
            root = root.getNext();
        }
    }
}
