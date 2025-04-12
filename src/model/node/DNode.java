package model.node;

public class DNode <T> {
    private T value;
    private DNode<T> previous;
    private DNode<T> next;

    public DNode() {
        this.value = null;
        this.next = null;
        this.previous = null;
    }

    public DNode(T value, DNode<T> previous, DNode<T> next) {
        this.value = value;
        this.previous = previous;
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public DNode<T> getPrevious() {
        return previous;
    }

    public void setPrevious(DNode<T> previous) {
        this.previous = previous;
    }

    public DNode<T> getNext() {
        return next;
    }

    public void setNext(DNode<T> next) {
        this.next = next;
    }
}
