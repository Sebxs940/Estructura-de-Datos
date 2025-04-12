package model.line;

import model.node.Node;

public class Stack<T> {
    private Node<T> top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public T getTop() {
        return (top != null) ? top.getValue() : null;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return this.top == null || this.size == 0;
    }

    public void push(T value) {
        if (isEmpty()) {
            this.top = new Node<>(value, null);
        } else {
            this.top = new Node<>(value, this.top);
        }
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        Node<T> top = this.top;
        this.top = this.top.getNext();
        size--;
        if (size == 0) {
            this.top = null;
        }
        return top.getValue();
    }
}
