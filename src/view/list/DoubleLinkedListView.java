package view.list;

import model.list.DLinkedList;

public class DoubleLinkedListView {
    public static void main(String[] args) {
        DLinkedList<Integer> numbers = new DLinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        numbers.remove(1);

        for (int i = 0; i < numbers.getSize(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
