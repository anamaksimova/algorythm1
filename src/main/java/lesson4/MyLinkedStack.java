package lesson4;

import java.util.EmptyStackException;

public class MyLinkedStack<T> {
    private MyLinketList<T> list;

    public MyLinkedStack() {
        this.list = new MyLinketList<>();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int size(){
        return list.size();
    }


    public void push(T item) {

      list.insertLast(item);
    }

    public T pop() {

        return list.deleteLast();
    }

    @Override
    public String toString() {
        return  "list=" + list ;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.getLast();
    }
}
