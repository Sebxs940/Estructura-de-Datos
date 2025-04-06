package test;

import model.Node;

public class AddTest {
    public static void main(String[] args) {
        Node add = new Node(4, null);
        add.add(1);
        add.add(11);
        add.add(3);
        add.add(12);

        Node root = add;
        while (root != null) {
            System.out.println(root.getValue());
            root = root.getNext();
        }
    }
}
