package model.list;

import model.Node;

import java.util.EmptyStackException;

public class LinkedList<T> {
    private Node<T> head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void add(T value){
        if (isEmpty()) {
            head = new Node<>(value, null);
        } else {
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new Node<>(value, null));
        }
        size++;
    }

    public void removeLast() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Node<T> node = new Node<>(head.getValue(), null);
        Node<T> current = head;
        current = current.getNext();
        while (current.getNext() != null) {
            Node<T> aux = new Node<>(current.getValue(), null);
            node.setNext(aux);
            current = current.getNext();
        }
        head = node;
        size--;
    }

    public T get(int pos){
        int i = 0;
        T value = null;
        Node<T> node = this.head;
        while (node != null) {
            if (pos == i) {
                value = node.getValue();
                break;
            }
            node = node.getNext();
            i++;
        }
        if (value == null) {
            throw new ArrayIndexOutOfBoundsException("Invalid position");
        }
        return value;
    }
}
