package lesson3;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String string = "Создать программу, которая переворачивает вводимые строки (читает справа налево).";

        MyStack<Character> stack = new MyStack<>(string.length());

        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
        }
        for (int i = 0; i <string.length(); i++) {
            System.out.print(stack.pop());
        }
        System.out.println();

        MyDeque<Integer> deque = new MyDeque<>();
        deque.insertLeft(1);
        deque.insertLeft(2);
        deque.insertLeft(3);
        deque.insertLeft(4);
        deque.insertRight(6);
        deque.insertRight(8);
        deque.insertRight(4);
        deque.insertRight(5);
        System.out.println(deque.peekLeft());
        System.out.println(deque.peekRight());
        System.out.println(deque.toString());
        System.out.println(deque.removeRight());
        System.out.println(deque.removeLeft());
        System.out.println(deque.removeLeft());
        System.out.println(deque.toString());






    }
}
