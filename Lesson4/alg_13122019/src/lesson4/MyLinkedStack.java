package lesson4;

public class MyLinkedStack<T> {
     private MyLinkedList<T> stack = new MyLinkedList<>();

    public int size(){
        return stack.size();
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void push(T value){
       stack.insertLast(value);
    }

    public void pop(){
        stack.removeLast();
    }

    public T peek(){
        return stack.getLast();

    }

    @Override
    public String toString() {
        return "MyLinkedStack" +
                "stack=" + stack +
                ' ';
    }
}
