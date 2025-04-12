package model.list;

import model.node.DNode;
import model.node.Node;

public class DLinkedList<T> {
    private DNode<T> head;
    private int size;

    public DLinkedList() {
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
            head = new DNode<>(value, null, null);
        } else {
            DNode<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new DNode<>(value, current, null));
        }
        size++;
    }

    public void remove(int position){
        if (isEmpty() || position + 1 > size || position < 0){
            throw new ArrayIndexOutOfBoundsException("Invalid position");
        }
        DNode temp = head;
        if (position == 0){
            temp.setPrevious(null);
            head = temp.getNext();
            size --;
            return;
        }
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.getNext();
        }
        if (temp == null || temp.getNext() == null){
            return;
        }

        temp.setNext(temp.getNext().getNext());
        if (temp.getNext() != null) {
            temp.getNext().setPrevious(temp);
        }
        size--;
    }

    public T get(int pos){

        if (pos < 0 || pos >= size){
            throw new ArrayIndexOutOfBoundsException("Invalid position");
        }

        int i = 0;
        DNode<T> node = this.head;

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
