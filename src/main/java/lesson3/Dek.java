package lesson3;

public class Dek<T>{
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int left=0;
    private int right;
    public Dek(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException();
        }
        list = (T[]) new Object[capacity];
    }

    public Dek() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void insertRight(T item) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
             }
        size++;
        list[right] = item;
        right = nextIndex(right);
    }
    public T removeRight() {
        T temp = peekRight();
        list[right] = null;
        right = prevIndex(right);
        size--;
        return temp;
    }

    public T peekRight() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        return list[right-1];
    }
    public void insertLeft(T item) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        size++;
        //вот здесь почему-то начиная со второго вызова начинает перескакивть цикл и выдает нули вместо сдвига, не поняла что не так
        for (int i = right; i ==1; i--) {
            list[i]=list[i-1];
        }
        list[left] = item;
        right = nextIndex(right);
    }
    public T removeLeft() {
        T temp = peekLeft();

        for (int i = 0; i <right; i++) {
            list[i]=list[i+1];
        }
        size--;
        right = prevIndex(right);
        list[right] = null;

        return temp;
    }

    public T peekLeft() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return list[left];
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
    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }
    private int prevIndex(int index) {
        return (index - 1) % list.length;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0;  i < size; i++) {
            sb.append(list[i]).append(", ");
        }
        sb.setLength(sb.length() - 2);
        sb.append("]");
        return sb.toString();
    }
}
