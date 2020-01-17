package lesson3;

import java.util.EmptyStackException;

public class MyDeque <T> {
    private T[] list;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private int begin = 0;
    private int end = 0;

    public MyDeque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public MyDeque(){
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void insertLeft(T value) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        size++;
        for (int i = size-1; i >0 ; i--) {
            list[i]=list[i-1];
        }
        list[begin] = value;

        end = nextIndex(end);
    }
    public void insertRight(T value) {
        if (isFull()) {
            throw new StackOverflowError();
        }

        list[end] = value;
        size++;
        end = nextIndex(end);
    }
    public T removeLeft() {

        T temp = peekLeft();

        list[begin] = null;
        for (int i = 0; i <size-1; i++) {
            list[i]=list[i+1];
        }
        size--;
        end--;
        return temp;
    }
    public T removeRight() {
        T temp = list[end-1];
        list[end-1] = null;
        size--;
        end--;

        return temp;
    }

    public T peekLeft() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[begin];
    }
    public T peekRight() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[end-1];
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    public boolean isFull() {
        return size == list.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        for (int i = 0; i < size - 1; i++) {
            sb.append(list[i] + ", ");
        }
        sb.append(list[size - 1] + " ]");
        return sb.toString();
    }
}
