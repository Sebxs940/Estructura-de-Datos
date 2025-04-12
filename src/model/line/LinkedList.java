package model.list;

import model.node.Node;

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

    public void remove(int position){
        if (head == null){
            return;
        } Node temp = head;
        if (position == 0){
            head = temp.getNext();
            size --;
            return;
        } for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.getNext();
        }
        if (temp == null || temp.getNext() == null){
            return;
        }
        temp.setNext(temp.getNext().getNext());
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

        if (pos < 0 || pos >= size){
            throw new ArrayIndexOutOfBoundsException("Invalid position");
        }

        int i = 0;
        Node<T> node = this.head;

        while (node != null) {
            if (pos == i) {
                return node.getValue();
            }
            node = node.getNext();
            i++;
        }
        return null;
    }
}
