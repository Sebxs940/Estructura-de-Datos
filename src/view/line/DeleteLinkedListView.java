package view.line;

import model.line.LinkedList;

public class DeleteLinkedListView {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Pepe");
        names.add("Cristian");
        names.add("Sebastian");

        System.out.println("Size names: " + names.getSize());
        for (int i = 0; i < names.getSize(); i++) {
            System.out.println(names.get(i));
        }
        names.removeLast();
        names.remove(0);

        System.out.println("Size names: " + names.getSize());
        for (int i = 0; i < names.getSize(); i++) {
            System.out.println(names.get(i));
        }
    }
}
