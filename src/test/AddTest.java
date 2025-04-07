package test;

import model.Node;

public class AddTest {
    public static void main(String[] args) {
        Node node = new Node(4, null);
        node.add(1);
        node.add(11);
        node.add(3);
        node.add(12);

        Node root = node;
        while (root != null) {
            System.out.println(root.getValue());
            root = root.getNext();
        }
    }
}
