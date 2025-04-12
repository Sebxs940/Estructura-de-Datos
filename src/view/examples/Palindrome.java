package view.examples;

import model.line.Stack;

public class Palindrome {
    public static boolean isPalindrome(String word){
        Stack<Character> letters = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            letters.push(word.charAt(i));
        }
        int i = 0;

        while(letters.getTop() != null){
            if (!letters.getTop().equals(word.charAt(i))){
                return false;
            }
            i++;
            letters.pop();
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("oso"));
        System.out.println(isPalindrome("pepe"));
        System.out.println(isPalindrome("radar"));
        System.out.println(isPalindrome("anilina"));
        System.out.println(isPalindrome("reconocer"));
    }
}
