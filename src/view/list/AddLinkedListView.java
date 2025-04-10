package view.list;

import model.list.LinkedList;

public class AddLinkedListView {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        System.out.println("names isEmpty: " + names.isEmpty());
        names.add("Pepe");
        names.add("Cristian");
        names.add("Sebastian");

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(5);
        System.out.println("numbers isEmpty: " + numbers.isEmpty());
        numbers.add(1);
        numbers.add(4);

        System.out.println("Size names: " + names.getSize());
        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));

        System.out.println("Size numbers: " + numbers.getSize());
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));
    }
}
