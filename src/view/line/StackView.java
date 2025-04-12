package view.line;

import model.line.Stack;

public class StackView {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);
        numbers.push(4);

        System.out.println("Size: " + numbers.getSize());

        while (numbers.getTop() != null) {
            System.out.println(numbers.getTop());
            numbers.pop();
        }

        System.out.println("Size: " + numbers.getSize());

    }
}
