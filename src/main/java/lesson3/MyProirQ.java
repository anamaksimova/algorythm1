package lesson3;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyProirQ<T extends Comparable<T>> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;

    public MyProirQ(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException();
        }
        list = (T[]) new Comparable[capacity];
    }

    public MyProirQ() {
        list = (T[]) new Comparable[DEFAULT_CAPACITY];
    }


    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }

    public void insert(T item) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");

        }
         list[size] = item;
        size++;

    }
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } int temp = 0;
       for (int i = 1; i < size; i++) {

            if(list[i].compareTo(list[temp]) > 0){
            temp=i;
            i++;
        }


    }return temp;
    }
    public T remove() {
         T temp = list[peek()];
         swap(peek(), (size-1));

        list[size] = null; size--;
        return temp;
    }

    private void swap(int index1, int index2) {
        T temp = list[index1];
        list[index1] = list[index2];
        list[index2] = temp;
    }
    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(list, size));
    }
}
