package model;

public class Node {
    private int value;
    private Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void add(int value) {
        Node current = this;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(value, null);
    }


    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
